package skynet;

public class AndroidTask extends CodeGenTask {
	static  String TASK_NAME="android";
	public void doStart(){
		super.doStart();
		//log("mysql task source file will be: "+ getSourceSQLFilePath());		
	}
	public void doTask() throws Exception{
		doSingleTask(TASK_NAME);
	}
}
