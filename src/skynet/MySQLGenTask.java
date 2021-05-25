package skynet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.ProcessBuilder.Redirect;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MySQLGenTask extends CodeGenTask {
	
	static  String TASK_NAME="mysql";
	public void doStart() throws Exception{
		super.doStart();
		log("mysql task source file will be: "+ getSourceSQLFilePath());		
	}
	public void doTask() throws Exception{
		doSingleTask("data_spec");
		doSingleTask(TASK_NAME);
		//backupOldData();
		
		
		importNewData();
		//importOldData();
	}
	
	
	
	private void importOldData() {
		// TODO Auto-generated method stub
		
	}
	protected  void importNewData() throws IOException{
		
		CodeGenContext context=CodeGenContext.start();
		if(context.isSkippedMySQLImport()) {
			log("Skip mysql data import for model "+getModel());
			return;
		}
		
		
		
		String output = executeCommand();
		//System.out.println(output);
		log("Import data for "+getModel()+" done!");
	}
	
	protected  void backupOldData() throws IOException{
		
		
		String output = executeBackupCommand();
		//System.out.println(output);
		log("Backup data for "+getModel()+" done!");
	}
	
	protected String getSourceSQLFilePath(){
		String sourcePath = super.getDestPath(TASK_NAME);
//     /works/jobs/teachain_v1/workspace/teachain-biz-suite/bizcore/teachain_mysql.sql
     return sourcePath + "WEB-INF/" + getModel() + "_core_src/META-INF/" + getModel() + "_mysql.sql";
//		return sourcePath + getModel() + "_mysql.sql";
	}
	protected String getBackupSQLFilePath(){
		String sourcePath = super.getDestPath(TASK_NAME);
		DateFormat format=new SimpleDateFormat("yyyyMMddHHmmss");
		
		return sourcePath+"WEB-INF/"+getModel()+"_core_src/META-INF/"+getModel()+"_mysql_"+format.format(new Date())+".sql";
		
	}
	
	protected String getMySQLExecPath(){
		
		String path = System.getProperty(MYSQL_EXEC_PATH_PARAM);
		if(path !=null){
			return path;
		}
		if(isUnix()){
			return "/usr/bin/mysql";
		}
		return "/usr/local/bin/mysql";
	}
	
	protected String getMySQLDumplExecPath(){
		
		String path = System.getProperty(MYSQL_EXEC_PATH_PARAM);
		if(path !=null){
			return path;
		}
		return "/usr/local/bin/mysqldump";
	}
	protected String getMySQLPassword(){
		
		String path = System.getProperty(MYSQL_PASSWORD_PARAM);
		if(path !=null){
			return path;
		}
		return "0254891276";
	}
	
	protected String getMySQLUser(){
		
		String path = System.getProperty(MYSQL_USER_PARAM);
		if(path !=null){
			return path;
		}
		return "root";
	}
	protected String executeCommand() throws IOException {

		
		
		ProcessBuilder pb = new ProcessBuilder(getMySQLExecPath(),
				"-p"+getMySQLPassword(),"-h127.0.0.1",
				"-u"+getMySQLUser(),"--default-character-set=utf8mb4");
		//.redirectOutput(Redirect.INHERIT).redirectInput(Redirect.PIPE);
		
		this.log("Trying to execute command: " 
		+ getMySQLExecPath() + " -p"+getMySQLPassword() + " -h127.0.0.1" 
		+ " -u"+getMySQLUser() + " --default-character-set=utf8mb4" 
		+ " < " + getSourceSQLFilePath() );
		
		
		
		//pb.toString();
		
		Process p = pb.start();
		inheritIO(p.getInputStream(), System.out);
	    inheritIO(p.getErrorStream(), System.err);
		
		String sourcePath = getSourceSQLFilePath();
		
		
		OutputStream pos = p.getOutputStream();
		Files.copy(Paths.get(sourcePath), pos);
		
		pos.close();
		
		return "";

		//return output.toString();

	}
	
	private static void inheritIO(final InputStream src, final PrintStream dest) {
	    new Thread(new Runnable() {
	        public void run() {
	            Scanner sc = new Scanner(src);
	            while (sc.hasNextLine()) {
	                dest.println(sc.nextLine());
	            }
	        }
	    }).start();
	}
	
	
	protected String executeBackupCommand() throws IOException {

		
		
		ProcessBuilder pb = new ProcessBuilder(getMySQLDumplExecPath(),
				"-p"+getMySQLPassword(),
				"-u"+getMySQLUser(),this.getModel()+" sec_user_data user_app_data object_access_data");
		
		Process p = pb.start();
		InputStream pos = p.getInputStream();
		
		String destPath = this.getBackupSQLFilePath();
		
		OutputStream fos = new FileOutputStream(destPath);
		byte[] buffer = new byte[1024*1024];
		int read = 0;
		while((read = pos.read(buffer)) != -1) {
			//System.out.print(new String(buffer,0,read));
			fos.write(buffer, 0, read);
		}
		fos.close();
		
		return "";

		//return output.toString();

	}
	
}
