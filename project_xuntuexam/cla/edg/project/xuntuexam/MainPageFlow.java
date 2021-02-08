package cla.edg.project.xuntuexam;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.project.xuntuexam.pageflow.*;

import java.util.Map;


public class MainPageFlow extends BasePageFlowDescriptionScript {
    protected PageFlowScript SCRIPT;
    public MainPageFlow withEnv(Map<String, String> envVars) {

        SCRIPT = $("wxapp client").need_login()
                .base_on()
                .base_package_name(envVars.get("base_package_name"))
                .project_name(envVars.get("project_name"))
                .parent_class_name(envVars.get("parent_class_name"))
                .parent_class_package(envVars.get("parent_class_package"))
                .bean_name(envVars.get("bean_name"))
                .resource_base_folder(envVars.get("resource_base_folder"))
                .addTag("transaction_config", envVars.get("transaction_config"))
                .addTag("change_request", "true");

        return this;
    }

    @Override
    public PageFlowScript getScript() {
        return SCRIPT.request("heart beat").comments("服务器心跳检查")
                .got_toast_page()
                .import_from(new P01_Example())

                .import_from(new Q01_Competition())
                .import_from(new Q02_ExamResult())
                .import_from(new Q03_ExamPaper())
            ;
    }
}
