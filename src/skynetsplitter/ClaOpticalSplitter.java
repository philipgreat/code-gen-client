package skynetsplitter;

import skynet.*;

public class ClaOpticalSplitter {

    private static final int SECOND_IN_MS = 1000;

    public static void main(String[] args) throws Exception {

        String modelName = "optical";
        String projectFolder = "optical_v1";
        System.setProperty("skynet.output.basefolder", getWorkSpaceFolder(projectFolder));
        System.setProperty("skynet.output.basefolder.specs", getFormSpecOutpurFolder(projectFolder));
        // 生成项目相关脚本, 例如 page-flow, event-ripple, graph-query 的脚本
        System.setProperty("skynet.output.basefolder.scripts", getProjectScriptOutputFolder(modelName));

        CodeGenContext.start()
                // .skipMysqlImport()
                .withModel(modelName)
                .mysqlExecPath("/usr/local/mysql/bin/mysql")
                .mysqlDumpExecPath("/usr/local/mysql/bin/mysqldump")
                // .withEnglish()
                .ofEnv()
        ;


        String mode = "all";
//	String mode = "java";
//	String mode = "form";
//	String mode = "data";
//	String mode = "query";
//	String mode = "test";

        if (mode.equals("all")) {
            run(new FullTask());
            Thread.sleep(10 * SECOND_IN_MS);
            run(new MySQLGenTask());
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
        if (mode.equals("query")) {
            run(new PrepareDBQueryScriptTask());
//			run(new BigdataTask());
        }
        if (mode.equals("test")) {
            run(new MobileAppBackendTask());
        }
    }


    public static void run(CodeGenTask task) throws Exception {

        task.doStart();
        task.doTask();
        task.end();

    }

    private static String getProjectScriptOutputFolder(String projectFolder) {
        // /works/jobs/project_script/workspace/project-script/project_yrzx/cla/edg/project/yrzx/gen
        return String.format("/works/jobs/project_script/workspace/project-script/project_%s", projectFolder);
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
