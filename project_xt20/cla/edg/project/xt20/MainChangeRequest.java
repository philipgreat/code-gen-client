package cla.edg.project.xt20;

import cla.edg.project.xt20.changerequest.*;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;

import java.util.Map;

public class MainChangeRequest implements ChangeRequestSpecFactory {

    @Override
    public Map<String, Map<String, Object>> getSpec() {
        return getScript();
    }

    private Map<String, Map<String, Object>> getScript() {
        return ChangeRequestSpecBuilder.for_project(Main.TARGET_PROJECT_NAME)
                .request_base("you_should_handle_CR_here")

                .import_from(new CR00_AllTBD())
                .import_from(new CR01_Users())
                .import_from(new CR02_OrganizationRelated())
                .import_from(new CR03_CreateProduct())

                .getChangeRequestSpec();
    }
}
