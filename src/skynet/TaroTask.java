package skynet;

public class TaroTask extends CodeGenTask {
	public void doTask() throws Exception{
		super.doTask();
		doSingleTask("dict");
		doSingleTask("taro");
	}
}
