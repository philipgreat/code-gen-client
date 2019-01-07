package skynetsplitter;

import skynet.CodeGenContext;
import skynet.CodeGenTask;
import skynet.FullTask;
import skynet.FullTaskWithoutDBImport;
import skynet.JSPTask;
import skynet.JavaTask;
import skynet.MySQLGenTask;
import skynet.ReactTask;


public class B2CSplitter {
	
	
	public static void main(String[] args) throws Exception {
		CodeGenContext context = CodeGenContext.start();
		context.withModel("b2c").withEnglish();
		
		System.out.println(context.forEnglish());
		
		//run(new ReactTask());
		
		//run(new FullTask());
		
		
		//run(new JSPTask());
		//run(new FullTaskWithoutDBImport());
		//run(new ReactTask());
		//run(new FullTask());
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