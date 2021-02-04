package skynetsplitter;

import skynet.*;

public class ClaRepairchainSplitter {

    private static final int SECOND_IN_MS = 1000;

    public static void main(String[] args) throws Exception {

        String modelName = "repairchain";
        String projectFolder = "repairchain_v1";
        System.setProperty("skynet.output.basefolder", getWorkSpaceFolder(projectFolder));
        System.setProperty("skynet.output.basefolder.specs", getFormSpecOutpurFolder(projectFolder));
        // 生成项目相关脚本, 例如 page-flow, event-ripple, graph-query 的脚本
        System.setProperty("skynet.output.basefolder.scripts", getProjectScriptOutputFolder(projectFolder, modelName));

//        DBUtil.main(null);
//        if (true){
//            return ;
//        }
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
//	String mode = "admin-ui";

        if (mode.equals("all")) {
            run(new FullTask());
            Thread.sleep(3 * SECOND_IN_MS);
            run(new MySQLGenTask());
            run(new PrepareDBQueryScriptTask());
            run(new ReactTask());
        }
        if (mode.equals("java")) {
            run(new JavaTask());
            run(new PrepareDBQueryScriptTask());
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
        if (mode.equals("admin-ui")) {
            run(new ReactTask());
        }
    }


    public static void run(CodeGenTask task) throws Exception {

        task.doStart();
        task.doTask();
        task.end();

    }

    private static String getProjectScriptOutputFolder(String projectFolder, String modelName) {
        // /works/jobs/project_script/workspace/project-script/project_yrzx/cla/edg/project/yrzx/gen
        // return String.format("/works/jobs/project_script/workspace/project-script/project_%s", projectFolder);
        return String.format("/works/jobs/%s/workspace/code-gen-client/project_%s", projectFolder,modelName);
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
