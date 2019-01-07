package skynet;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AndroidSaveIfNotExistProcessor extends SaveIfNotExistProcessor{
	protected void handleNewFileExists(String line) throws IOException{
		line = preProcessLine(line);
		super.handleNewFileExists(line);
	}
	
	private static final Pattern ptnJavaPojoPath = Pattern.compile("(@save\\S*\\s+)(.*?_src)/com/");
	private String preProcessLine(String line) {
		Matcher m = ptnJavaPojoPath.matcher(line);
		if (!m.find()){
			return line;
		}
		return m.replaceAll("$1com/");
	}
}
