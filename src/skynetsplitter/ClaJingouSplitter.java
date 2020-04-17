package skynetsplitter;

import skynet.*;

public class ClaJingouSplitter {

	public static void main(String[] args) throws Exception {
		System.setProperty("skynet.model", "hfgw");
		// System.setProperty("skynet.model", "pulupulu");
		System.setProperty("skynet.output.basefolder", "/Users/jackytian/git");
		System.setProperty("skynet.output.basefolder.specs",
				"/Users/jackytian/git/web-code-generator/sky/WEB-INF/src");
		System.setProperty("skynet.mysql.path", "/usr/local/bin/mysql");
		System.setProperty("skynet.mysqldump.path", "/usr/local/mysql/bin/mysqldump");
		// System.setProperty("skynet.mysql.path", "/usr/bin/mysql");
		// System.setProperty("skynet.mysqldump.path", "/usr/bin/mysqldump");

		// System.setProperty("skynet.model", "mini");modeling/_systemtypes.xml
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

//		String mode = "nothing";6c24a3e86e4bff454efa84fead14d9fa1effaa93
//		 String mode = "all";
		 String mode = "all";
//		 String mode = "bigdata";
//		 String mode = "java";
//		 String mode = "data";
//		String mode = "form";

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

		if ("bigdata".equals(mode)) {
			run(new BigdataTask());
		}

		if ("ui".equals(mode)){
			run(new ReactTask());
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
