package skynetsplitter;

import skynet.CodeGenTask;
import skynet.FullTask;
import skynet.FullTaskWithoutDBImport;
import skynet.JSPTask;
import skynet.JavaTask;
import skynet.MySQLGenTask;
import skynet.ReactTask;


public class SystemSelfTestFileSplitter {
	
	
	public static void main(String[] args) throws Exception {
		System.setProperty("skynet.model", "st");
		System.setProperty("skynet.output.basefolder", "/space/jobs/skynet/workshop");
		System.setProperty("skynet.mysql.path", "/usr/local/bin/mysql");
		System.setProperty("skynet.mysqldump.path", "/usr/bin/mysqldump");
		System.setProperty("skynet.mysql.path", "/usr/bin/mysql");
		//System.setProperty("skynet.mysqldump.path", "/usr/bin/mysqldump");

		//System.setProperty("skynet.model", "mini");
		//System.setProperty("skynet.model", "b2b2c");


		//System.setProperty("skynet.model", "mini");
		//System.setProperty("skynet.model", "b2b2c");
		//run(new JSPTask());
		//run(new FullTaskWithoutDBImport());
		//run(new ReactTask());
//		run(new FullTask());
		//run(new ReactTask());
		//run(new MySQLGenTask());
		run(new JavaTask());
		//run(new JavaTask());
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