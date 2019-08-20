package skynet;

public class FullTask extends MySQLGenTask {
	public void doTask() throws Exception{
		
		doSingleTask("dict");
		doSingleTask("jsp");
		doSingleTask("java");
		
		super.doTask();
		
	}
}
