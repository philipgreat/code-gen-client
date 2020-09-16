package cla.edg.project.repairchain.changerequest;

import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;

public class CR03_Employee implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("add employee by agent").zh_CN("添加人员")
                .step("step 1").zh_CN("第一步")
                    .contains_event("employee basic info").zh_CN("人员信息")
                        .has_field("name").zh_CN("名字")
                            .range(1, 40)



            .change_request("bind with mobile").zh_CN("绑定手机号")
                .contains_event("employee basic info")
                ;
    }

}
