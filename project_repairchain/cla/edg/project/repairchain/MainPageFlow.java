package cla.edg.project.repairchain;

import cla.edg.pageflow.PageFlowBuilder;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.project.repairchain.pageflow.*;
import cla.edg.project.repairchain.query.*;

import java.util.Map;


public class MainPageFlow extends PageFlowBuilder {
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
                .import_from(new P01_LoadFromFile())
                .import_from(new P02_CrRequestFixing())
                .import_from(new P03_PersonalUser())
                .import_from(new P04_Machine())
                .import_from(new P05_WorkJobs())

                .import_from(new Q01_PersonalUser())
                .import_from(new Q02_Factory())
                .import_from(new Q03_Machine())
                .import_from(new Q04_Task())
                .import_from(new Q05_QrCode())
                .import_from(new Q06_Employee())
                .import_from(new Q07_Misc())
            ;
    }
}
