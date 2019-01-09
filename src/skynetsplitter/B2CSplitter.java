package skynetsplitter;

import skynet.CodeGenContext;
import skynet.CodeGenTask;
import skynet.FullTask;
import skynet.JavaTask;


public class B2CSplitter {
	
	
	public static void main(String[] args) throws Exception {
		CodeGenContext context = CodeGenContext.start();
		
		
		
		String models[]= {"pim","ugc","cms","oms","payment","search","inventory","iam"};
		//String models[]= {"oms"};
		
		for(String model:models) {
			context.withModel(model).withEnglish();
			//run(new JavaTask());
			//run(new FullTask());
			//run(new ReactTask());
		}
		
		for(String model:models) {
			logln("cd ~/githome/"+model+"-biz-suite/&& commit \"Regenerated microservices code and tested\" && cd ..");
			//run(new FullTask());
			//run(new ReactTask());
		}
		
		//System.out.println(context.forEnglish());
		
		//run(new ReactTask());
		
		//run(new FullTask());
		
		
		//run(new JSPTask());
		//run(new FullTaskWithoutDBImport());
		//run(new ReactTask());
		//run(new FullTask());
		//run(new MySQLGenTask());

		//run(new JavaTask());
		//run(new JavaTask());

		//Double a= null;
		//testDouble(a);
		
	}
	private static void logln(String string) {
		// TODO Auto-generated method stub
		System.out.println(string);
	}
	public static void testDouble(double a){
		
		
	}
	public static void run(CodeGenTask task) throws Exception{
		
		
		
		task.doStart();
		task.doTask();
		task.end();
		
	}

}