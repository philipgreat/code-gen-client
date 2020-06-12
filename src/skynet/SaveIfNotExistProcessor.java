package skynet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveIfNotExistProcessor extends SaveFileProcessor{
	static  final String CREATE_IF_NOT_EXIST_FILE_FLAG="@savefileifnotexist: ";
	public String getToken(){
		
		return CREATE_IF_NOT_EXIST_FILE_FLAG;
		
	}
	public String getName(){
	
		return "SaveIfNotExistProcessor";

	}
	protected void handleNewFileExists(String line) throws IOException{
		File destFile = new File(getDirectory() , getFileName(line));
		if (destFile.exists()) {
			log("ignoring file: " + destFile.getAbsolutePath()+" because it exists.");
			out  = null; //close the buffer and do nothing
			return;// do nothing to keep the file content, just do not touch it.
		}
		boolean result = destFile.getParentFile().mkdirs();
		if(result){
			log("creating a new directory for file: "+ destFile);
		}
		// System.out.println("file created: "+ result);
		// out = new BufferedWriter(new FileWriter(destFile));
		out = new BufferedWriter(new FileWriter(destFile));
		this.onNewFile(destFile.getAbsolutePath());
		// Charset.forName("UTF-8").newDecoder()
		
		log("saveif to file: " + destFile.getAbsolutePath());
	}
	public void end() throws Exception{
	    super.end();
		log(getName()+"("+getToken()+")"+": ignore generates '"+lineCount + "' lines and '" + charsCount + "' chars, '"+filesCount+"' files");
		System.out.println();
	}
}
