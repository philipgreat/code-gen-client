package skynetsplitter;

import skynet.CodeGenTask;
import skynet.JavaTask;
import skynet.MySQLGenTask;
import skynet.TaroTask;

public class ClaExamSplitter {

	public static void main(String[] args) throws Exception {
		String project = "exam";
		System.setProperty("skynet.model", project);
		// System.setProperty("skynet.model", "pulupulu");
		System.setProperty("skynet.output.basefolder", "/Users/kalaliu/temp/");
		System.setProperty("skynet.output.basefolder.specs",
				"/Users/kalaliu/githome/web-code-generator/sky/WEB-INF/src");
		System.setProperty("skynet.mysql.path", "/usr/local/bin/mysql");
		System.setProperty("skynet.mysqldump.path", "/usr/local/mysql/bin/mysqldump");
		System.setProperty("codegen.taro.output", "/Users/kalaliu/work/nice-router-taro/src");

//		run(new JavaTask());
		run(new MySQLGenTask());
		run(new TaroTask());
	}

	public static void testDouble(double a) {

	}

	public static void run(CodeGenTask task) throws Exception {

		task.doStart();
		task.doTask();
		task.end();

	}

}
