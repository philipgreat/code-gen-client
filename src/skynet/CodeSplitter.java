package skynet;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.spi.HttpServerProvider;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

class IllegalModelException extends RuntimeException {
    public IllegalModelException(String message) {
        super(message);
    }
}

public class CodeSplitter {
    protected List<BaseFileProcessor> processors;

    public static void splitIntoZipStream(URI uri, ZipOutputStream zos, SaveAllFileProcessor processor, StringBuilder pErrBuilder, StringBuilder pLog) throws Exception {
        URLConnection conn;
        conn = uri.toURL().openConnection();

        BufferedReader reader = new BufferedReader(new InputStreamReader(
                conn.getInputStream(), StandardCharsets.UTF_8));
        String line;
        String prefix = getPrefix(uri);
        while ((line = reader.readLine()) != null) {
            if (line.trim().startsWith("Error#")) {
                log(pErrBuilder, line);
                continue;
            }
            if (line.trim().startsWith("@warning")) {
                log(pLog, line);
            }
            processor.handleLine(line, zos, prefix);
        }
    }


    public static void log(StringBuilder logger, String messageTemplate, Object... paramters) {
        String message = String.format(messageTemplate + "\n", paramters);
        logger.append(message);
        System.err.println(message);
    }

    private static String getPrefix(URI uri) {
        if (uri.getPath().startsWith("/sky/react")) {
            return "bizui";
        }
        return "bizcore";
    }

    public void splitIntoFiles(URI uri, File directory) throws Exception {

        URLConnection conn;
        System.out.println("Connect to " + uri);
        conn = uri.toURL().openConnection();
        if (!(conn instanceof HttpURLConnection)) {
            throw new IllegalArgumentException("The URI must be HTTP URI");
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                conn.getInputStream(), StandardCharsets.UTF_8));
        String line;
        // StringBuilder content = new StringBuilder(1000);
        processors = new ArrayList<BaseFileProcessor>();
        processors.add(new SaveFileProcessor());
        processors.add(new SaveIfNotExistProcessor());
        String[] tokens = new String[processors.size()];
        int index = 0;
        //collect tokens
        for (BaseFileProcessor processor : processors) {
            processor.setDirectory(directory);
            tokens[index] = processor.getToken();
            index++;
        }
        //set tokens for each processor, make them know each other
        for (BaseFileProcessor processor : processors) {
            processor.addBreakingTokens(tokens);
            ;
        }
        StringBuilder errorLog = new StringBuilder();
        while ((line = reader.readLine()) != null) {

            if (line.trim().startsWith("Error#")) {
                String message = line;
                errorLog.append("\n");
                errorLog.append(message);

                continue;
            }
            if (line.trim().startsWith("@warning")) {
                System.err.println("Found: " + line);

            }

            for (BaseFileProcessor processor : processors) {
                processor.handleLine(line);
            }
        }

        if (errorLog.length() > 0) {
            reader.close();
            throw new Exception(errorLog.toString());
        }

        for (BaseFileProcessor processor : processors) {
            processor.end();
        }
        reader.close();

        if (errorLog.length() > 0) {
            throw new IllegalModelException(errorLog.toString());
        }

        // throw new IOException("重试次数超过"+count+"次，只好放弃了",lastException);

    }

    protected static void doJspAppSplit(String objectToSplit, String destination) throws Exception {
        URI uri = new URI("http://localhost:8080/sky/jsp/jsp_app_index.jsp?name=" + objectToSplit);
        File dir = new File(destination);
        new CodeSplitter().splitIntoFiles(uri, dir);
    }

    protected static void doJspListSplit(String objectToSplit, String destination) throws Exception {
        URI uri = new URI("http://localhost:8080/sky/jsp/jsp_object_present_list.jsp?name=" + objectToSplit);
        File dir = new File(destination);
        new CodeSplitter().splitIntoFiles(uri, dir);
    }

    protected static void doJavaAppSplit(String objectToSplit, String destination) throws Exception {
        URI uri = new URI("http://localhost:8080/sky/javaweb/java_app_index.jsp?name=" + objectToSplit);
        File dir = new File(destination);
        new CodeSplitter().splitIntoFiles(uri, dir);
    }

    protected static void doIosAppSplit(String objectToSplit, String destination) throws Exception {
        URI uri = new URI("http://localhost:8080/sky/ios/ios_app_index.jsp?name=" + objectToSplit);
        File dir = new File(destination);
        new CodeSplitter().splitIntoFiles(uri, dir);
    }


    public static void main(String[] args) throws Exception {
        HttpServerProvider provider = HttpServerProvider.provider();
        String port = System.getProperty("agentPort");
        if (port == null || port.trim().isEmpty()) {
            port = "8081";
        }

        String genServer = System.getProperty("genServer");
        if (genServer == null || genServer.trim().isEmpty()) {
            genServer = "http://localhost:8080";
        }

        HttpServer httpserver = provider.createHttpServer(new InetSocketAddress(Integer.parseInt(port)), 100);

        Map<String, String[]> scopeMapping = createMapping();

        httpserver.createContext("/codegen", new GenCodeHandler(scopeMapping, genServer));
        httpserver.start();
    }

    private static Map<String, String[]> createMapping() throws Exception {
        Map<String, String[]> scopeMapping = new HashMap<>();
        String mappingFile = System.getProperty("scopeMapping");
        if (mappingFile == null || mappingFile.trim().length() == 0) {
            System.out.println("no scopeMapping file, please set in the java system property -DscopeMapping=scopeMapping file, default to scopeMapping.txt");
            mappingFile = "scopeMapping.txt";
        }
        Properties p = new Properties();
        try (FileReader reader = new FileReader(mappingFile)) {
            p.load(reader);
            p.entrySet().forEach(e -> {
                String scope = (String) e.getKey();
                String services = (String) e.getValue();
                System.out.println(scope + ":" + services);
                scopeMapping.put(scope, services.trim().split(","));
            });
        }
        return scopeMapping;
    }

    private static class GenCodeHandler implements HttpHandler {

        private Map<String, String[]> scopeMapping;
        private String genServer;

        public GenCodeHandler(Map<String, String[]> pScopeMapping, String pGenServer) {
            scopeMapping = pScopeMapping;
            genServer = pGenServer;
        }

        @Override
        public void handle(HttpExchange pHttpExchange) throws IOException {
            try {
                String path = pHttpExchange.getRequestURI().toString();
                String[] parts = path.split("/");
                String project = (String) parts[2];
                String scope = (String) parts[3];

                String daasToken = pHttpExchange.getRequestHeaders().getFirst("daasToken");
                if (daasToken == null) {
                    daasToken = "";
                }

                String daasServer = pHttpExchange.getRequestHeaders().getFirst("daasServer");
                if (daasServer == null) {
                    daasServer = "";
                }

                System.out.println("received download request for :" + path);
                List<String> serverURIs = calculateServiceURL(project, scope, daasToken, daasServer);

                pHttpExchange.getResponseHeaders().set("Content-disposition", "attachment;filename=" + project + ".zip");
                pHttpExchange.sendResponseHeaders(200, 0);

                OutputStream responseBody = pHttpExchange.getResponseBody();

                ZipOutputStream zip = new ZipOutputStream(responseBody);

                ByteArrayOutputStream memBytes = new ByteArrayOutputStream();
                ZipOutputStream mem = new ZipOutputStream(new BufferedOutputStream(memBytes));

                SaveAllFileProcessor processor = new SaveAllFileProcessor();
                processor.addBreakingToken(SaveIfNotExistProcessor.CREATE_IF_NOT_EXIST_FILE_FLAG);
                processor.addBreakingToken(SaveFileProcessor.NEW_FILE_FLAG);

                StringBuilder errBuilder = new StringBuilder();
                StringBuilder warnBuilder = new StringBuilder();
                for (String serverURI : serverURIs) {
                    try {
                        CodeSplitter.splitIntoZipStream(new URI(serverURI), mem, processor, errBuilder, warnBuilder);
                    } catch (Exception pE) {
                        pE.printStackTrace();
                        errBuilder.append(pE.toString());
                        break;
                    }
                }

                String errlogs = errBuilder.toString();
                String warnlogs = warnBuilder.toString();
                if (errlogs != null && !errlogs.trim().isEmpty()) {
                    System.out.println("write error:" + errlogs);
                    zip.putNextEntry(new ZipEntry("error.log"));
                    zip.write(errlogs.getBytes());
                    zip.finish();
                } else {
                    readAndPackConstantFiles(mem, processor);

                    if (warnlogs != null && !warnlogs.trim().isEmpty()) {
                        mem.putNextEntry(new ZipEntry("warn.log"));
                        mem.write(warnBuilder.toString().getBytes());
                    }
                    mem.finish();
                    System.out.println("finished");
                    memBytes.writeTo(responseBody);
                }
                responseBody.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        private void readAndPackConstantFiles(ZipOutputStream pMem, SaveAllFileProcessor pProcessor) throws IOException {
            String commonDir = System.getProperty("skynet.commonfiles");
            if (commonDir == null || commonDir.trim().isEmpty()){
                return;
            }

            System.out.println("common files:" + commonDir);
            String[] files = commonDir.split(",");

            for (String f : files){
                if (f == null || f.isEmpty()){
                    continue;
                }

                File file = new File(f);
                if (!file.exists()){
                    continue;
                }

                if (file.isDirectory()){
                    File[] subs = file.listFiles();

                    for (File sub : subs){
                        readAndPackConstantFile(pMem, sub, pProcessor, "bizcore");
                    }
                }else {
                    readAndPackConstantFile(pMem, file, pProcessor, "bizcore");
                }

            }
        }

        private void readAndPackConstantFile(ZipOutputStream pMem, File pFile, SaveAllFileProcessor pProcessor, String prefix) throws IOException {
            //hidden files
            if (pFile.getName().startsWith(".")){
                return;
            }

            ensureFileEntry(pMem, pProcessor, prefix + "/" + pFile.getName(), pFile.isDirectory());
            byte[] buff = new byte[1024];

            if (pFile.isDirectory()){
                File[] files = pFile.listFiles();
                for (File sub : files){
                    readAndPackConstantFile(pMem, sub, pProcessor, prefix + "/" + pFile.getName());
                }
            }else {
                try(BufferedInputStream br = new BufferedInputStream(new FileInputStream(pFile))){
                    int read = -1;
                    while ( (read = br.read(buff)) > 0){
                        pMem.write(buff, 0 , read);
                    };
                }
            }
        }

        private void ensureFileEntry(ZipOutputStream pMem, SaveAllFileProcessor pProcessor, String filepath, boolean folder) throws IOException {
            if (!pProcessor.createdPath.contains(filepath)){
                String[] parts = filepath.trim().split("/");
                String current = null;
                for (int i = 0; i < parts.length; i++) {
                    if (current != null) {
                        current = current + "/" + parts[i];
                    } else {
                        current = parts[i];
                    }

                    if (i < parts.length - 1 || folder) {
                        current += "/";
                    }

                    if (pProcessor.createdPath.contains(current)) {
                        continue;
                    }

                    pMem.putNextEntry(new ZipEntry(current));
                    pProcessor.createdPath.add(current);
                }
            }
        }

        private List<String> calculateServiceURL(String pProject, String pScope, String token, String daasServer) {
            String template = "%s/sky/%s?name=%s&daasToken=%s&daasServer=%s";

            String[] services = scopeMapping.get(pScope);
            if (services == null) {
                return null;
            }

            return Arrays.asList(services).stream().map(s ->
                    String.format(template, genServer, s, pProject, token, daasServer)
            ).collect(Collectors.toList());
        }
    }
}
