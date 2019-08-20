package skynetsplitter;

import skynet.CodeGenTask;
import skynet.*;

public class ClaJingouSplitter {

	public static void main(String[] args) throws Exception {
		System.setProperty("skynet.model", "jingou");
		// System.setProperty("skynet.model", "pulupulu");
		System.setProperty("skynet.output.basefolder", "/works/jobs/jingou_v1/workspace");
		System.setProperty("skynet.output.basefolder.specs",
				"/works/jobs/jingou_v1/workspace/web-code-generator/sky/WEB-INF/src");
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
		 String mode = "all";
//		 String mode = "java";
//		 String mode = "form";
		// String mode = "data";

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
	}

	public static void testDouble(double a) {

	}

	public static void run(CodeGenTask task) throws Exception {

		task.doStart();
		task.doTask();
		task.end();

	}

}
