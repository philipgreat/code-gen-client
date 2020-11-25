package cla.edg.project.xt20;

import cla.edg.project.xt20.workprocessor.*;
import cla.poc.workflow.WorkProcessorBuilder;

public class MainWorkProcessor {
    public WorkProcessorBuilder getBuilder() {
        return WorkProcessorBuilder.start()
            .basePackage(Main.TARGET_BASE_PACKAGE_NAME)
            .import_from(new WP01_Example());
    }
}
