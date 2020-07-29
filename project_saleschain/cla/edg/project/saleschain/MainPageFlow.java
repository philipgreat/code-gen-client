package cla.edg.project.saleschain;

import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.project.saleschain.pageflow.*;
import cla.edg.project.saleschain.query.Q1_Page;
import cla.edg.project.saleschain.query.Q2_Product;
import cla.edg.project.saleschain.query.Q3_Brand;
import cla.edg.project.saleschain.query.Q4_Supplier;


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
                .import_from(new P1_HomePageFlow())
                .import_from(new P2_DemandPageFlow())
                .import_from(new P3_KnowledgeBasePageFlow())
                .import_from(new P4_DomesticTrailPageFlow())
                .import_from(new P5_UserProfilePageFlow())
                .import_from(new P6_CRPageFlow())
                .import_from(new X1_MiscPageFlow())

                //.import_from(new HomepageQuery())
                .import_from(new Q1_Page())
                .import_from(new Q2_Product())
                .import_from(new Q3_Brand())
                .import_from(new Q4_Supplier())
            ;
    }
}
