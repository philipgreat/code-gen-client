package cla.edg.project.xuntuexam;

import cla.edg.project.xuntuexam.workprocessor.*;
import cla.poc.workflow.WorkProcessorBuilder;

import java.util.HashMap;
import java.util.Map;

public class MainWorkProcessor {
    protected Map<String, String> envVars = new HashMap<>();
    public MainWorkProcessor withEnv(Map<String, String> envVars) {
        this.envVars.putAll(envVars);
        return this;
    }

    public WorkProcessorBuilder getBuilder() {
        String prjName = envVars.get("base_package_name");
        if (prjName == null){
            prjName = Main.TARGET_BASE_PACKAGE_NAME;
        }
        return WorkProcessorBuilder.start()
            .basePackage(Main.TARGET_BASE_PACKAGE_NAME)
            .import_from(new WP01_Example());
    }
}
