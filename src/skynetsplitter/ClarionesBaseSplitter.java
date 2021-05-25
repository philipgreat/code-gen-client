package skynetsplitter;

import clariones.tool.builder.GenrationResult;
import setup.ProjectSetup;
import skynet.*;

import java.io.File;
import java.util.Date;
import java.util.List;

public abstract class ClarionesBaseSplitter {

    protected static final int SECOND_IN_MS = 1000;

    protected void doCodeGeneration(String mode) throws Exception {
        Date dStart = new Date();
        doRealCodeGeneration(mode);
        Date dEnd = new Date();
        System.out.println("运行时间 " + (dEnd.getTime()-dStart.getTime())/1000.0 +"秒. " + dStart+" ~ "+dEnd);
    }
    protected void doRealCodeGeneration(String mode) throws Exception {
        String modelName = getModelName();
        String projectFolder = getProjectFolderName();
        System.setProperty("skynet.output.basefolder", getWorkSpaceFolder(projectFolder));
        System.setProperty("skynet.output.basefolder.specs", getFormSpecOutpurFolder(projectFolder));
        // 生成项目相关脚本, 例如 page-flow, event-ripple, graph-query 的脚本
        System.setProperty(
                "skynet.output.basefolder.scripts", getProjectScriptOutputFolder(projectFolder, modelName));

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
                .ofEnv();


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
        if (mode.equals("project-script")){
            genProjectScript();
            return;
        }
    }

    public void genProjectScript() throws Exception {
        String modelName = getModelName();
        ProjectSetup setup = new ProjectSetup();
        // 生成到哪里
        String outputBaseFolder = "/works/jobs/"+getProjectFolderName()+"/workspace";
        setup.setProjectFolder(outputBaseFolder);
        // 项目名称
        setup.setPackageName("com.doublechaintech."+ modelName);
        List<GenrationResult> list = setup.runJob();
        // 执行
        String baseFolder = outputBaseFolder+"/code-gen-client/project_"+ modelName;
        setup.saveToFiles(new File(baseFolder), list);
        // 完成
        return;
    }
    protected abstract String getProjectFolderName();

    protected abstract String getModelName();

    protected void run(CodeGenTask task) throws Exception {

        task.doStart();
        task.doTask();
        task.end();
    }

    protected String getProjectScriptOutputFolder(String projectFolder, String modelName) {
        // /works/jobs/project_script/workspace/project-script/project_yrzx/cla/edg/project/yrzx/gen
        // return String.format("/works/jobs/project_script/workspace/project-script/project_%s",
        // projectFolder);
        return String.format(
                "/works/jobs/%s/workspace/code-gen-client/project_%s", projectFolder, modelName);
    }

    protected String getFormSpecOutpurFolder(String projectFolder) {
        return String.format(
                "/works/jobs/%s/workspace/web-code-generator/sky/WEB-INF/src", projectFolder);
    }

    protected String getWorkSpaceFolder(String projectFolder) {
        return String.format("/works/jobs/%s/workspace", projectFolder);
    }
}
