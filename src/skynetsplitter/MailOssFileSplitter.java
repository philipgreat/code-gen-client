package skynetsplitter;

import skynet.CodeGenTask;
import skynet.FullTask;
import skynet.FullTaskWithoutDBImport;
import skynet.JSPTask;
import skynet.JavaTask;
import skynet.MySQLGenTask;
import skynet.ReactTask;


public class MailOssFileSplitter {
	
	
	public static void main(String[] args) throws Exception {
		System.setProperty("file.encoding", "UTF-8");
		System.setProperty("skynet.model", "mailoss");
		//System.setProperty("skynet.env", "xp");
		//System.setProperty("skynet.env", "xp");
		
		//System.setProperty("skynet.model", "mini");
		//System.setProperty("skynet.model", "b2b2c");
		//System.setProperty("skynet.mysql.path", "/usr/bin/mysql");
		
		//run(new JSPTask());
		//run(new FullTaskWithoutDBImport());
		//run(new FullTask());
		run(new JavaTask());
		//run(new ReactTask());
		//run(new MySQLGenTask());
		//Double a= null;
		//testDouble(a);
		
	}
	public static void testDouble(double a){
		
		
	}
	public static void run(CodeGenTask task) throws Exception{
		
		
		
		task.doStart();
		task.doTask();
		task.end();
		
	}

}
