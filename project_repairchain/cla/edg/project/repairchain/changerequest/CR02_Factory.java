package cla.edg.project.repairchain.changerequest;

import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class CR02_Factory implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("add factory").zh_CN("添加工厂")
                .step("step 1").zh_CN("第一步")
                    .contains_event("factory basic info").zh_CN("添加工厂")
                        .has_field("name").zh_CN("名字")
                            .range(1, 40)


                .change_request("update factory").zh_CN("更新工厂信息")
                    .contains_event("factory basic info")


                .change_request("add machine by agent").zh_CN("更新工厂信息")
                    .contains_event("machine basic info")
                        .has_field("name").zh_CN("名字")
                            .range(1, 40)
                ;
    }

}
