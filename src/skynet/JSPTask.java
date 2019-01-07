package skynet;

public class JSPTask extends CodeGenTask {
	static  String TASK_NAME="jsp";
	public void doStart(){
		super.doStart();
		//log("mysql task source file will be: "+ getSourceSQLFilePath());		
	}
	public void doTask() throws Exception{
		super.doTask();
		doSingleTask("jsp");
	}
}
