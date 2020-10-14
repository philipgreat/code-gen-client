package cla.edg.project.repairchain;

import cla.edg.pageflow.PageFlowBuilder;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.project.repairchain.pageflow.*;
import cla.edg.project.repairchain.query.*;


public class MainPageFlow extends PageFlowBuilder {
    private static final PageFlowScript SCRIPT = $("wxapp client").need_login()
            .base_on()
                .base_package_name(Main.TARGET_BASE_PACKAGE_NAME)
                .project_name(Main.TARGET_PROJECT_NAME)
                .parent_class_name(getClassName(Main.TARGET_PAGEFLOW_JAVA_PARENT_CLASS_FULL_NAME))
                .parent_class_package(getPackageName(Main.TARGET_PAGEFLOW_JAVA_PARENT_CLASS_FULL_NAME))
                .bean_name(Main.TARGET_PAGEFLOW_JAVA_BEAN_NAME)
                .addTag("change_request", "true");


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
