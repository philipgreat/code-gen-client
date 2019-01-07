package skynetsplitter;

import skynet.CodeGenTask;
import skynet.FullTask;
import skynet.FullTaskWithoutDBImport;
import skynet.JSPTask;
import skynet.JavaTask;
import skynet.MySQLGenTask;
import skynet.POJOWorkTask;
import skynet.ReactTask;


public class MiniFileSplitter {
	
	
	public static void main(String[] args) throws Exception {
		System.setProperty("skynet.model", "mini");
		//System.setProperty("skynet.env", "xp");
		
		//System.setProperty("skynet.mysql.path", "/usr/bin/mysql");
		//System.setProperty("skynet.mysqldump.path", "/usr/bin/mysqldump");

		//System.setProperty("skynet.model", "mini");
		//System.setProperty("skynet.model", "b2b2c");
		run(new ReactTask());
		//run(new FullTaskWithoutDBImport());
		//run(new POJOWorkTask());
		//run(new FullTask());
		//run(new MySQLGenTask());
		//run(new JSPTask());
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
