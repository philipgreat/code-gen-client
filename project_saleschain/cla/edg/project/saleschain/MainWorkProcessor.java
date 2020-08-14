package cla.edg.project.saleschain;

import cla.edg.project.saleschain.workprocessor.DemandWorkProcessor;
import cla.poc.workflow.WorkProcessorBuilder;

public class MainWorkProcessor {
    public WorkProcessorBuilder getBuilder() {
        return WorkProcessorBuilder.start()
            .basePackage(Main.TARGET_BASE_PACKAGE_NAME)
            .import_from(new DemandWorkProcessor());
    }
}
