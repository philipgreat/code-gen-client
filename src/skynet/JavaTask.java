package skynet;

public class JavaTask extends CodeGenTask {
	public void doTask() throws Exception{
		super.doTask();
		doSingleTask("dict");
		doSingleTask("java");
		
	}
}
