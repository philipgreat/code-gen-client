package skynetsplitter;

//import cla.edg.project.xt20.JackyMain;

import skynet.*;

public class JackyXt20Splitter {

    private static final int SECOND_IN_MS = 1000;

    public static void main(String[] args) throws Exception {

//        JackyMain.main(args);
        String modelName = "cmes";
        System.setProperty("skynet.output.basefolder", "/Users/jackytian/git");

//        DBUtil.main(null);
//        if (true){
//            return ;
//        }
        CodeGenContext.start()
                .skipMysqlImport()
                .withModel(modelName)
                .mysqlExecPath("/usr/local/opt/mysql-client/bin/mysql")
                .mysqlDumpExecPath("/usr/local/opt/mysql-client/bin/mysqldump")
                // .withEnglish()
                .ofEnv()
        ;
//      String mode = "view";
        String mode = "all";
//	String mode = "java";
//        String mode = "springcloud";
//	String mode = "form";
//	String mode = "data";
//	String mode = "query";
//	String mode = "admin-ui";

        if (mode.equals("view")) {
            run(new ViewTask());
        }

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
        if (mode.equals("bigdata")) {
            run(new BigdataTask());
        }

        if (mode.equals("springcloudjsp")) {
            run(new SpringCloudTask());
        }

        if (mode.equals("springcloud")) {
            run(new SpringCloudJspTask());
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
        return String.format("/works/jobs/%s/workspace/code-gen-client/project_%s", projectFolder, modelName);
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
