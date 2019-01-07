package skynet;

public class WxaRenderTask extends CodeGenTask {
	public void doTask() throws Exception{
		super.doTask();
		doSingleTask("dict");
		doSingleTask("wxa_render");
		
	}
}
