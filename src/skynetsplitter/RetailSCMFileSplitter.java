package skynetsplitter;

import skynet.CodeGenTask;
import skynet.FullTask;
import skynet.FullTaskWithoutDBImport;
import skynet.JSPTask;
import skynet.JavaTask;
import skynet.MySQLGenTask;
import skynet.ReactTask;


public class RetailSCMFileSplitter {
	
	
	public static void main(String[] args) throws Exception {
		//System.setProperty("skynet.model", "cis");
		//System.setProperty("skynet.model", "decoration_docs");
		System.setProperty("skynet.model", "retailscm");
		run(new MySQLGenTask());
		run(new JavaTask());
		//run(new ReactTask());
		//Double a= null;
		//testDouble(a);
		//run(new ReactTask());
		//System.setProperty("skynet.experiment", "yes");
		//run(new FullTask());
		//run(new FullTask());
		//System.setProperty("skynet.output.basefolder", "/works/jobs/ja_le_le/workspace");
		//System.setProperty("skynet.mysql.path", "/usr/local/mysql/bin/mysql");
		//System.setProperty("skynet.mysqldump.path", "/usr/local/mysql/bin/mysqldump");
		// System.setProperty("skynet.mysql.path", "/usr/bin/mysql");
		//System.setProperty("skynet.mysqldump.path", "/usr/bin/mysqldump");

		//System.setProperty("skynet.model", "mini");
		//System.setProperty("skynet.model", "b2b2c");
		//run(new JSPTask());
		//run(new FullTaskWithoutDBImport());
		
	}
	public static void testDouble(double a){
		
		
	}
	public static void run(CodeGenTask task) throws Exception{
		
		
		
		task.doStart();
		task.doTask();
		task.end();
		
	}

}