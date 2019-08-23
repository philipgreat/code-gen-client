package skynetsplitter;

import skynet.*;

public class ClaYourongSplitter {

	public static void main(String[] args) throws Exception {
		System.setProperty("skynet.model", "yourong");
		// System.setProperty("skynet.model", "pulupulu");
		System.setProperty("skynet.output.basefolder", "/works/jobs/yourong_v2/workspace");
		System.setProperty("skynet.output.basefolder.specs",
//				"/works/jobs/yourong_v2/workspace/code-gen-client/src");
				"/works/jobs/yourong_v2/workspace/web-code-generator/sky/WEB-INF/src");
		// 生成项目相关脚本, 例如 page-flow, event-ripple, graph-query 的脚本
		System.setProperty("skynet.output.basefolder.scripts",
				"/works/jobs/yourong_v2/workspace/eclipsews/ProjectScript/src");
		System.setProperty("skynet.mysql.path", "/usr/local/mysql/bin/mysql");
		System.setProperty("skynet.mysqldump.path", "/usr/local/mysql/bin/mysqldump");
		// System.setProperty("skynet.mysql.path", "/usr/bin/mysql");
		// System.setProperty("skynet.mysqldump.path", "/usr/bin/mysqldump");

		// System.setProperty("skynet.model", "mini");
		// System.setProperty("skynet.model", "b2b2c");
		// run(new JSPTask());
		// run(new FullTaskWithoutDBImport());
		// run(new ReactTask());
		// run(new FullTask());
		// run(new MySQLInitDataTask());
		// run(new ReactTask());
		// run(new MySQLGenTask());
		// run(new JavaTask());
		// run(new JavaTask());
		// run(new UiFormTask());
		// run(new UiFormGenTask());
		// Double a= null;
		// testDouble(a);

//		String mode = "nothing";
//		 String mode = "all";
//		 String mode = "java";
//		 String mode = "form";
//		 String mode = "data";
//		 String mode = "jsp";
		 String mode = "query";
		 
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
		if (mode.equals("jsp")) {
			run(new JSPTask());
		}
		if (mode.equals("query")) {
			run(new PrepareQueryScriptTask());
		}
	}

	public static void testDouble(double a) {

	}

	public static void run(CodeGenTask task) throws Exception {

		task.doStart();
		task.doTask();
		task.end();

	}

}
