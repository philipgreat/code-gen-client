package skynetsplitter;

import skynet.*;

public class ClaMoyiV3Splitter {

	public static void main(String[] args) throws Exception {

		String modelName = "moyi";
		String projectFolder = modelName + "_v3";
		System.setProperty("skynet.output.basefolder", getWorkSpaceFolder(projectFolder));
		System.setProperty("skynet.output.basefolder.specs", getFormSpecOutpurFolder(projectFolder));
		// 生成项目相关脚本, 例如 page-flow, event-ripple, graph-query 的脚本
		System.setProperty("skynet.output.basefolder.scripts", getProjectScriptOutputFolder(modelName, projectFolder));

		CodeGenContext.start()
				// .skipMysqlImport()
				.withModel(modelName)
				.mysqlExecPath("/usr/local/mysql/bin/mysql")
				.mysqlDumpExecPath("/usr/local/mysql/bin/mysqldump")
				// .withEnglish()
				.ofEnv();

//		 String mode = "all";
		 String mode = "react";
//		 String mode = "java";
		// String mode = "form";
//		 String mode = "data";
//		String mode = "query";

		if (mode.equals("all")) {
			run(new FullTask());
			run(new PrepareDBQueryScriptTask());
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
		if (mode.equals("react")) {
			run(new ReactTask());
		}
		if (mode.equals("query")) {
			run(new PrepareDBQueryScriptTask());
			// run(new BigdataTask());
		}
	}

	public static void run(CodeGenTask task) throws Exception {

		task.doStart();
		task.doTask();
		task.end();

	}

	private static String getProjectScriptOutputFolder(String projectName, String projectFolder) {
		return String.format("/works/jobs/project_script/workspace/project-script/project_%s", projectName);
	}

	private static String getFormSpecOutpurFolder(String projectFolder) {
		return String.format("/works/jobs/%s/workspace/web-code-generator/sky/WEB-INF/src", projectFolder);
	}

	private static String getWorkSpaceFolder(String projectFolder) {
		return String.format("/works/jobs/%s/workspace", projectFolder);
	}

	
}
