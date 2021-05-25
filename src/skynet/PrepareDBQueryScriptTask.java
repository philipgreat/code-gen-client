package skynet;

public class PrepareDBQueryScriptTask extends CodeGenTask {
	public void doTask() throws Exception{
		super.doTask();
//		doSingleTask("ui_form_spec");
		doSingleTask("prepare_db_query_script");
	}

//	@Override
	protected String getDestPath(String name) {
		return System.getProperty("skynet.output.basefolder.scripts");
	}
}
