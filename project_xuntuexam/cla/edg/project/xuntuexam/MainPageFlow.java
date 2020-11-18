package cla.edg.project.xuntuexam;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.project.xuntuexam.pageflow.*;



public class MainPageFlow extends BasePageFlowDescriptionScript {
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
                .import_from(new P01_Example())

                .import_from(new Q01_Competition())
                .import_from(new Q02_ExamResult())
                .import_from(new Q03_ExamPaper())
            ;
    }
}
