package skynet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Set;

public  class BaseFileProcessor {


	protected int lineCount = 0;
	protected int charsCount = 0;
	protected int filesCount = 0;
	protected File directory;
	
	private Set<String> breakingTokens;
	
	protected BufferedReader readerFromFile(String fileName) throws UnsupportedEncodingException, FileNotFoundException{
		return new BufferedReader(new InputStreamReader(
                new FileInputStream(fileName), "UTF8"));
	}
	protected BufferedWriter writerToFile(String fileName) throws UnsupportedEncodingException, FileNotFoundException{
		return new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(fileName), "UTF8"));
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
		// TODO Auto-generated method stub
		this.directory = directory;
	}
	protected void onNewFile(String absolutePath) {
		// TODO Auto-generated method stub
		filesCount++;
	}
}
