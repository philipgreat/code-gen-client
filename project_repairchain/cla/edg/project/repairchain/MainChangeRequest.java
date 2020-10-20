package cla.edg.project.repairchain;

import cla.edg.project.repairchain.changerequest.*;
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

                .import_from(new CR01_Example())
                .import_from(new CR02_Factory())
                .import_from(new CR03_Employee())
                .import_from(new CR04_QrCode())
                .import_from(new CR05_RepairTask())
                .import_from(new CR06_Machine())

                .getChangeRequestSpec();
    }
}
