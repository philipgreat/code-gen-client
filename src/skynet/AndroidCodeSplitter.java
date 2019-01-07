package skynet;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class AndroidCodeSplitter extends CodeSplitter{

	public void splitIntoFiles(URI uri, File directory) throws Exception {
		
		URLConnection conn;
		conn = uri.toURL().openConnection();
		if (!(conn instanceof HttpURLConnection)) {
			throw new IllegalArgumentException("The URI must be HTTP URI");
		}
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
		String line;
		// StringBuilder content = new StringBuilder(1000);
		processors = new ArrayList<BaseFileProcessor>();
		processors.add(new AndroidSaveFileProcessor());
		processors.add(new AndroidSaveIfNotExistProcessor());
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
		//process each line
		while ((line = reader.readLine()) != null) {
			for (BaseFileProcessor processor : processors) {
				processor.handleLine(line);
			}
		}
		for (BaseFileProcessor processor : processors) {
			processor.end();
		}
		reader.close();
		// throw new IOException("重试次数超过"+count+"次，只好放弃了",lastException);

	}
	
}
