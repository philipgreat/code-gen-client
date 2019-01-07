package skynet;

public class ReactTask extends CodeGenTask {
	static  String TASK_NAME="react";
	public void doStart(){
		super.doStart();
		//log("mysql task source file will be: "+ getSourceSQLFilePath());		
	}
	public void doTask() throws Exception{
		super.doTask();
		doSingleTask("react");
	}
}
