package cla.edg.project.xt20;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.project.xt20.pageflow.*;

import java.util.Map;


public class MainPageFlow extends BasePageFlowDescriptionScript {
    protected PageFlowScript SCRIPT;


    @Override
    public PageFlowScript getScript() {
        return SCRIPT.request("heart beat").comments("服务器心跳检查")
                .got_toast_page()
                .import_from(new P01_Example())

                .import_from(new Q01_Guide())
                .import_from(new Q02_GasProduct())
                .import_from(new Q03_Users())
                .import_from(new Q04_Employee())
                .import_from(new Q05_Cylinder())
                .import_from(new Q06_Buyer())
                .import_from(new Q07_Delivery())

                .import_from(new Q99_Misc())
            ;
    }

    public MainPageFlow withEnv(Map<String, String> envVars) {

        SCRIPT = $("wxapp client").need_login()
                .base_on()
                .base_package_name(envVars.get("base_package_name"))
                .project_name(envVars.get("project_name"))
                .parent_class_name(envVars.get("parent_class_name"))
                .parent_class_package(envVars.get("parent_class_package"))
                .bean_name(envVars.get("bean_name"))
                .resource_base_folder(envVars.get("resource_base_folder"))
                .addTag("change_request", "true");
        return this;
    }
}
