package skynet;

import com.google.common.io.CharSource;
import com.google.googlejavaformat.java.Formatter;
import com.google.googlejavaformat.java.FormatterException;
import com.google.googlejavaformat.java.JavaFormatterOptions;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public  class BaseFileProcessor {


	protected int lineCount = 0;
	protected int charsCount = 0;
	protected int filesCount = 0;
	protected File directory;
	protected String curFilePath;
	
	private Set<String> breakingTokens;
	
	protected BufferedReader readerFromFile(String fileName) throws UnsupportedEncodingException, FileNotFoundException{
		return new BufferedReader(new InputStreamReader(
                new FileInputStream(fileName), StandardCharsets.UTF_8));
	}
	protected BufferedWriter writerToFile(String fileName) throws UnsupportedEncodingException, FileNotFoundException{
		return new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(fileName), StandardCharsets.UTF_8));
	}
	
	public void addBreakingToken(String token){
		if(breakingTokens == null){
			breakingTokens = new HashSet<String>();			
		}
		breakingTokens.add(token);
	}
	//a little duplicated code, input performance
	public void addBreakingTokens(String[] tokens){
		if(breakingTokens == null){
			breakingTokens = new HashSet<String>();			
		}
		for(String token: tokens){
			breakingTokens.add(token);
		}
		
	}
	public File getDirectory() {
		return directory;
	}

	protected void appendLine(BufferedWriter out, String line) throws IOException {

		if(out==null){
			return;
		}
		
		if(line==null){
			return;
		}
		lineCount++;
		charsCount += line.length();
		out.write(line);
		out.write(newLine());

	}

	protected String newLine() {
		return System.getProperty("line.separator");
	}
	protected boolean isBreakLine(String line) {
		// TODO Auto-generated method stub
		if(breakingTokens ==  null ){
			return false;
		}
		for(String token: breakingTokens){
			if(line.startsWith(token)){
				return true;
			}
		}
		return false;
	}
	
	
	public String getToken(){
		throw new IllegalStateException("Should not call to getToken() function, this is the base");	
	}
	public String getName(){
		throw new IllegalStateException("Should not call to getName() function, this is the base");	
	}
	public void handleLine(String line) throws Exception{
		throw new IllegalStateException("Should not call to handleLine(String line) function, this is the base");
	}
	protected String getFileName(String line) {
		/*
		 * if(isNewFileLine(line)){ return null; }
		 */
		if (isBreakLine(line)) {
			return line.substring(getToken().length());
		}
		return null;

	}
	protected boolean isMyJob(String line) {
		/*
		 * if(isNewFileLine(line)){ return null; }
		 */
		return line.startsWith(getToken());

	}
	public void end() throws Exception{

		log(getName()+"("+getToken()+")"+": totally generates '"+lineCount + "' lines and '" + charsCount + "' chars, '"+filesCount+"' files");
		System.out.println();
	}



	//private CLASS_NAME=
	private long previousTime = System.currentTimeMillis();
	//private final String CLASS_NAME=
	protected void log(String string) {
		long currentTime = System.currentTimeMillis();
		long span =currentTime - previousTime;	
		System.out.printf("+%10d %-30s %s\n",span,"FileProcessor", string);
		previousTime = currentTime;
		
	}

	public void setDirectory(File directory) {
		this.directory = directory;
	}
	protected void onNewFile(String absolutePath) {
		curFilePath = absolutePath;
		filesCount++;
	}

	protected void formatOutputJavaSourceFile(String curFilePath) {
		String fileName = curFilePath.replaceAll("^(.*)?src", "...");
//		log("Format java source file " + fileName );
//		Formatter fmt = new Formatter(JavaFormatterOptions.builder()
//				.style(JavaFormatterOptions.Style.GOOGLE)
//				.build());
		Formatter fmt = new Formatter();
		String orgContent=null;
		try {
			String srcString = readFileAsString(curFilePath);
			orgContent = srcString;
			String formattedStr = fmt.formatSource(srcString);
			writeFile(curFilePath, formattedStr);
		} catch (FormatterException e) {
			log("Exception when format " + curFilePath);
			log(orgContent);
			e.printStackTrace();
			// throw new RuntimeException("Exception when format " + curFilePath, e);
		}
	}

	private void writeFile(String curFilePath, String formattedStr) {
		try {
			FileWriter fw = new FileWriter(curFilePath);
			fw.write(formattedStr);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	private String readFileAsString(String curFilePath) {
		try {
			FileInputStream fin = new FileInputStream(curFilePath);
			InputStreamReader reader = new InputStreamReader(fin, StandardCharsets.UTF_8);
			StringBuilder sb = new StringBuilder();
			char[] buff = new char[1024];
			int n;
			while ((n = reader.read(buff)) > 0) {
				sb.append(buff, 0, n);
			}
			fin.close();
			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	protected void onOutpotClosed() {
		if (curFilePath != null){
			if (curFilePath.endsWith(".java")) {
				formatOutputJavaSourceFile(curFilePath);
			}
		}
	}
}
