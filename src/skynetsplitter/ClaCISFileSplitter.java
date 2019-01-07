package skynetsplitter;

import skynet.CodeGenTask;
import skynet.*;


public class ClaCISFileSplitter {
	
	
	public static void main(String[] args) throws Exception {
		System.setProperty("skynet.model", "cis");
		System.setProperty("skynet.output.basefolder", "/works/jobs/v2_ja_le_le/workspace");
		System.setProperty("skynet.mysql.path", "/usr/local/mysql/bin/mysql");
		System.setProperty("skynet.mysqldump.path", "/usr/local/mysql/bin/mysqldump");
		// System.setProperty("skynet.mysql.path", "/usr/bin/mysql");
		//System.setProperty("skynet.mysqldump.path", "/usr/bin/mysqldump");

		//System.setProperty("skynet.model", "mini");
		//System.setProperty("skynet.model", "b2b2c");
//		run(new JSPTask());
//		run(new FullTaskWithoutDBImport());
		//run(new ReactTask());
		run(new FullTask());
//		run(new MySQLInitDataTask());
//		run(new ReactTask());
//		run(new MySQLGenTask());
//		run(new JavaTask());
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
