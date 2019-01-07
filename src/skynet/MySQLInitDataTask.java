package skynet;

public class MySQLInitDataTask extends MySQLGenTask {
	/*
	static  String TASK_NAME="mysql_init";
	public void doStart(){
		super.doStart();
		log("mysql task source file will be: "+ getInitDataFilePath());		
	}
	
	protected String getInitDataFilePath() {
		String home = SystemConfig.getSkyHome();
		return home + "/data-initial/" + System.getProperty("skynet.model")+".xml";
	}
	protected String getSourceSQLFilePath(){
		String sourcePath = super.getDestPath(TASK_NAME);
		return sourcePath+getModel()+"_core_src/META-INF/"+getModel()+"_init_sql.sql";
		
	}
	public void doTask() throws Exception{
		doSingleTask(TASK_NAME);
		importNewData();
	}
	*/
	
	
}
