package skynet;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
class IllegalModelException extends RuntimeException{
	public IllegalModelException(String message) {
		super(message);
	}
}
public class CodeSplitter {
	protected List<BaseFileProcessor> processors;

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
		String []tokens = new String[processors.size()];
		int index = 0;
		//collect tokens
		for (BaseFileProcessor processor : processors) {
			processor.setDirectory(directory);
			tokens[index] = processor.getToken();
			index++;
		}
		//set tokens for each processor, make them know each other
		for (BaseFileProcessor processor : processors) {
			processor.addBreakingTokens(tokens);;
		}
		StringBuilder errorLog = new StringBuilder();
		while ((line = reader.readLine()) != null) {
			
			if(line.trim().startsWith("Error#")){
				String message =  line;
				errorLog.append("\n");
				errorLog.append(message);
				
				continue;
			}
			if(line.trim().startsWith("@warning")){
				System.err.println("Found: "+ line);
				
			}
			
			for (BaseFileProcessor processor : processors) {
				processor.handleLine(line);
			}
		}
		
		if(errorLog.length()>0) {
			reader.close();
			throw new Exception(errorLog.toString());
		}
		
		for (BaseFileProcessor processor : processors) {
			processor.end();
		}
		reader.close();
		
		if(errorLog.length()>0) {
			throw new IllegalModelException(errorLog.toString());
		}
		
		// throw new IOException("重试次数超过"+count+"次，只好放弃了",lastException);

	}
	protected static void doJspAppSplit(String objectToSplit, String destination) throws Exception
	{
		URI uri=new URI("http://localhost:8080/sky/jsp/jsp_app_index.jsp?name="+objectToSplit);
		File dir=new File(destination);
		new CodeSplitter().splitIntoFiles(uri, dir);
	}
	protected static void doJspListSplit(String objectToSplit, String destination) throws Exception
	{
		URI uri=new URI("http://localhost:8080/sky/jsp/jsp_object_present_list.jsp?name="+objectToSplit);
		File dir=new File(destination);
		new CodeSplitter().splitIntoFiles(uri, dir);
	}
	protected static void doJavaAppSplit(String objectToSplit, String destination) throws Exception
	{
		URI uri=new URI("http://localhost:8080/sky/javaweb/java_app_index.jsp?name="+objectToSplit);
		File dir=new File(destination);
		new CodeSplitter().splitIntoFiles(uri, dir);
	}
	
	protected static void doIosAppSplit(String objectToSplit, String destination) throws Exception
	{
		URI uri=new URI("http://localhost:8080/sky/ios/ios_app_index.jsp?name="+objectToSplit);
		File dir=new File(destination);
		new CodeSplitter().splitIntoFiles(uri, dir);
	}
	
	
	

	
	public static void main(String[] args) throws Exception {
		//doJspAppSplit("humanresource","/Users/Philip/githome/java-web-tool-framework/naf/");
		
		//add2
		
		
	}

}
