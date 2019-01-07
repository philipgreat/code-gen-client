package skynet;

public class MySQLPatchTask extends MySQLGenTask {
	public void doTask() throws Exception{
		
		importNewData();
	}
	protected String getSourceSQLFilePath(){
		String sourcePath = super.getDestPath(TASK_NAME);
		
		return sourcePath+"sql/mysql_"+getModel()+"_patch.sql";
		
	}
}
