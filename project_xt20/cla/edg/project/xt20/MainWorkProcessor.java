package cla.edg.project.xt20;

import cla.edg.project.xt20.workprocessor.*;
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
            .basePackage(prjName)
            .import_from(new WP01_Example())
//            .import_from(new WP02_Order())
                ;
    }
}
