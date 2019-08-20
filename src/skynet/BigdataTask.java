package skynet;

public class BigdataTask extends CodeGenTask {
	static  String TASK_NAME="bigdata";
	public void doStart() throws Exception{
		super.doStart();	
	}
	public void doTask() throws Exception{
		doSingleTask(TASK_NAME);
	}
}
