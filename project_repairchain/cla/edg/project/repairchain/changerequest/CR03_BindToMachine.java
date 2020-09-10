package cla.edg.project.repairchain.changerequest;

import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;

public class CR03_BindToMachine implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("bind to machine").zh_CN("添加工厂")
                .step("step 1").zh_CN("第一步")
                    .contains_event("add factory").zh_CN("添加工厂")
                        .has_field("name").zh_CN("名字")
                            .range(1, 40)
                ;
    }

}
