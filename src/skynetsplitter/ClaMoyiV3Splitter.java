package skynetsplitter;

import skynet.*;

public class ClaMoyiV3Splitter {

    public static void main(String[] args) throws Exception {
    	
    	String modelName = "moyi";
    	String projectFolder = modelName+"_v3";
		System.setProperty("skynet.output.basefolder", getWorkSpaceFolder(projectFolder));
		System.setProperty("skynet.output.basefolder.specs", getFormSpecOutpurFolder(projectFolder));
		// 生成项目相关脚本, 例如 page-flow, event-ripple, graph-query 的脚本
		System.setProperty("skynet.output.basefolder.scripts", getProjectScriptOutputFolder(projectFolder));

		CodeGenContext.start()
			// .skipMysqlImport()
			.withModel(modelName)
			.mysqlExecPath("/usr/local/mysql/bin/mysql")
			.mysqlDumpExecPath("/usr/local/mysql/bin/mysqldump")
			// .withEnglish()
			.ofEnv()
			;
		
//	 System.setProperty("skynet.model", "moyi");
////	System.setProperty("skynet.model", "pulupulu");
//	System.setProperty("skynet.output.basefolder", "/works/jobs/moyi_v3/workspace");
//	System.setProperty("skynet.output.basefolder.specs", "/works/jobs/moyi_v3/workspace/web-code-generator/sky/WEB-INF/src");
//	System.setProperty("skynet.mysql.path", "/usr/local/mysql/bin/mysql");
//	System.setProperty("skynet.mysqldump.path", "/usr/local/mysql/bin/mysqldump");
	// System.setProperty("skynet.mysql.path", "/usr/bin/mysql");
	// System.setProperty("skynet.mysqldump.path", "/usr/bin/mysqldump");

	// System.setProperty("skynet.model", "mini");
	// System.setProperty("skynet.model", "b2b2c");
	// run(new JSPTask());
	// run(new FullTaskWithoutDBImport());
	// run(new ReactTask());
//	run(new FullTask());
//	 run(new MySQLInitDataTask());
	// run(new ReactTask());
//	 run(new MySQLGenTask());
//	 run(new JavaTask());
//	 run(new JavaTask());
//	run(new UiFormTask());
//	run(new UiFormGenTask());
	// Double a= null;
	// testDouble(a);
	
//	String mode = "all";
//	String mode = "java";
//	String mode = "form";
	String mode = "data";
//	String mode = "query";
	
		if (mode.equals("all")) {
			run(new FullTask());
			run(new UiFormTask());
			run(new UiFormGenTask());
		}
		if (mode.equals("java")) {
			run(new JavaTask());
		}
		if (mode.equals("form")) {
			run(new UiFormTask());
			run(new UiFormGenTask());
		}
		if (mode.equals("data")) {
			run(new MySQLGenTask());
		}
		if (mode.equals("query")) {
			run(new PrepareDBQueryScriptTask());
//			run(new BigdataTask());
		}
    }


    public static void run(CodeGenTask task) throws Exception {

	task.doStart();
	task.doTask();
	task.end();

    }

    private static String getProjectScriptOutputFolder(String projectFolder) {
		return String.format("/works/jobs/%s/workspace/event-driven-generation/src", projectFolder);
	}

	private static String getFormSpecOutpurFolder(String projectFolder) {
		return String.format("/works/jobs/%s/workspace/web-code-generator/sky/WEB-INF/src", projectFolder);
	}

	private static String getWorkSpaceFolder(String projectFolder) {
		return String.format("/works/jobs/%s/workspace", projectFolder);
	}

	public static void testDouble(double a) {

	}
}
