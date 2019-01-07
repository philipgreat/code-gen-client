package skynet;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SaveFileProcessor extends BaseFileProcessor {
	static final String NEW_FILE_FLAG = "@savefile: ";
	
	BufferedWriter out = null;

	public String getToken() {

		return NEW_FILE_FLAG;

	}

	public String getName() {
		return "SaveFileProcessor";
	}
	

	public void handleLine(String line) throws Exception {
		
		if(this.getDirectory() == null){
			throw new IllegalStateException("Directory not set yet, exit here!");
		}
		
		if (!isBreakLine(line)) {
			appendLine(out, line);
			return;
		}
		if (out != null) {
			out.close();
			out = null;
		}
		//is my job?
		
		if(!isMyJob(line)){
			//the new job is not mine, other processor will handle it
			return;
		}
		//ok it is my job, get the buffer ready to write to the file
		handleNewFileExists(line);

	}
	protected void handleNewFileExists(String line) throws IOException{
		File destFile = new File(getDirectory() , getFileName(line));
		if (destFile.exists()) {
			destFile.delete();
		}
		boolean result = destFile.getParentFile().mkdirs();
		if(result){
			log("creating a new directory for file: "+ destFile);
		}
		// System.out.println("file created: "+ result);
		// out = new BufferedWriter(new FileWriter(destFile));
		out = new BufferedWriter(new FileWriter(destFile));
		// Charset.forName("UTF-8").newDecoder()
		super.onNewFile(destFile.getAbsolutePath());
		log("save to file: " + destFile.getAbsolutePath());
	}
	public void end() throws Exception{
		super.end();
		//log(getName()+": totally generates '"+lineCount + "' lines and '" + charsCount + "' chars");
		if (out != null) {
			out.close();
			out = null;
		}
	}

}
