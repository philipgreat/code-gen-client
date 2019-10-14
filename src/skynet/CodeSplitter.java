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
import java.util.zip.ZipOutputStream;

class IllegalModelException extends RuntimeException {
    public IllegalModelException(String message) {
        super(message);
    }
}

public class CodeSplitter {
    protected List<BaseFileProcessor> processors;

    public static void splitIntoZipStream(URI uri, ZipOutputStream zos, SaveAllFileProcessor processor) throws Exception {
        URLConnection conn;
        System.out.println("Connect to " + uri);
        conn = uri.toURL().openConnection();
        if (!(conn instanceof HttpURLConnection)) {
            throw new IllegalArgumentException("The URI must be HTTP URI");
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                conn.getInputStream(), StandardCharsets.UTF_8));
        String line;
        StringBuilder errorLog = new StringBuilder();
        String prefix = getPrefix(uri);
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
            processor.handleLine(line, zos, prefix);
        }
    }

    private static String getPrefix(URI uri) {
        if (uri.getPath().startsWith("/sky/react")){
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
        String port = System.getProperty("port");
        if (port == null || port.trim().isEmpty()) {
            port = "8080";
        }

        HttpServer httpserver = provider.createHttpServer(new InetSocketAddress(Integer.parseInt(port)), 100);

        Map<String, String[]> scopeMapping = new HashMap<>();
        scopeMapping.put("all", new String[]{
                "react/dva_app_index.jsp"
                ,"javaweb/java_app_index.jsp"
        });

        httpserver.createContext("/codegen", new GenCodeHandler(scopeMapping));
        httpserver.start();
    }

    private static class GenCodeHandler implements HttpHandler {

        private Map<String, String[]> scopeMapping;

        public GenCodeHandler(Map<String, String[]> pScopeMapping) {
            scopeMapping = pScopeMapping;
        }

        @Override
        public void handle(HttpExchange pHttpExchange) throws IOException {
            String path = pHttpExchange.getRequestURI().toString();
            String[] parts = path.split("/");
            String project = (String) parts[2];
            String scope = (String) parts[3];

            List<String> serverURIs = calculateServiceURL(project, scope);

            pHttpExchange.getResponseHeaders().set("Content-disposition", "attachment;filename=" + project +".zip");
            pHttpExchange.sendResponseHeaders(200, 0);
            OutputStream responseBody = pHttpExchange.getResponseBody();

            ZipOutputStream zip = new ZipOutputStream(responseBody);

            SaveAllFileProcessor processor = new SaveAllFileProcessor();
            processor.addBreakingToken(SaveIfNotExistProcessor.CREATE_IF_NOT_EXIST_FILE_FLAG);
            processor.addBreakingToken(SaveFileProcessor.NEW_FILE_FLAG);
            serverURIs.forEach(serverURI -> {
                try {
                    CodeSplitter.splitIntoZipStream(new URI(serverURI), zip, processor);
                } catch (Exception pE) {
                    pE.printStackTrace();
                }
            });
            zip.finish();

            responseBody.close();
        }

        private List<String> calculateServiceURL(String pProject, String pScope) {
            String template = "http://t420.doublechaintech.cn:2080/sky/%s?name=%s";

            String[] services = scopeMapping.get(pScope);
            if (services == null) {
                return null;
            }

            return Arrays.asList(services).stream().map(s ->
                    String.format(template, s, pProject)
            ).collect(Collectors.toList());
        }
    }
}
