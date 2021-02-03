package cla.edg.project.xt20;

import cla.edg.project.xt20.changerequest.*;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;

import java.util.HashMap;
import java.util.Map;

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

                .import_from(new CR00_AllTBD())
                .import_from(new CR01_Users())
                .import_from(new CR02_OrganizationRelated())
                .import_from(new CR03_CreateProduct())
                .import_from(new CR04_Order())

                .getChangeRequestSpec();
    }
}
