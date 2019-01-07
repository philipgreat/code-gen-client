package skynet;

public class UiFormGenTask extends CodeGenTask {
	public void doTask() throws Exception{
		super.doTask();
		doSingleTask("dict");
//		doSingleTask("ui_form_spec");
		doSingleTask("ui_form_gen");
	}

//	@Override
//	protected String getDestPath(String name) {
//		return System.getProperty("skynet.output.basefolder.specs");
//	}
}
