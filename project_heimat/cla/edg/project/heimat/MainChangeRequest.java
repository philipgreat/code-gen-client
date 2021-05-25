package cla.edg.project.heimat;

import cla.edg.project.heimat.changerequest.*;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;

import java.util.*;

public class MainChangeRequest implements ChangeRequestSpecFactory {

    protected Map<String, String> envVars = new HashMap<>();
    public MainChangeRequest withEnv(Map<String, String> envVars) {
        this.envVars.putAll(envVars);
        return this;
    }

    public String config(String var){
        return envVars.get(var);
    }

    @Override
    public Map<String, Map<String, Object>> getSpec() {
        return getScript();
    }

    private Map<String, Map<String, Object>> getScript() {
        String prjName = envVars.get("project_name");
        if (prjName == null) {
            prjName = Main.TARGET_PROJECT_NAME;
        }
        return ChangeRequestSpecBuilder.for_project(prjName)
                .config(envVars)
                .request_base("you_should_handle_CR_here")

                .import_from(new CR01_Example())

                .getChangeRequestSpec();
    }
}
