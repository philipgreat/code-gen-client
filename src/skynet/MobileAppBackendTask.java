package skynet;

public class MobileAppBackendTask extends CodeGenTask {
	public void doTask() throws Exception{
		super.doTask();
		doSingleTask("dict");
		doSingleTask("mobile_app_backend");
	}

}
