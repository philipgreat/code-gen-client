package cla.edg.project.saleschain;

import cla.edg.project.saleschain.changerequest.*;
import cla.edg.project.saleschain.query.Q1_Page;
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

                .import_from(new DemoChangeRequest())
                .import_from(new ContentChangeRequest())
                .import_from(new DemandChangeRequest())
                .import_from(new AccountChangeRequest())
                .import_from(new DomesticTrialChangeRequest())

                .getChangeRequestSpec();
    }
}
