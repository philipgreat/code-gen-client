package skynet;

public class FullTaskWithoutDBImport extends CodeGenTask {

	public FullTaskWithoutDBImport() {
		
	}
	
	
	public void doTask() throws Exception{
		super.doTask();
		doSingleTask("dict");
		doSingleTask("jsp");
		doSingleTask("java");
		
		
		
	}
}
