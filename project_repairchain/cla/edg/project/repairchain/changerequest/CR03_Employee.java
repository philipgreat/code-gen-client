package cla.edg.project.repairchain.changerequest;

import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class CR03_Employee implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("add employee by agent").zh_CN("添加人员")
                .step("step 1").zh_CN("第一步")
                    .contains_event("employee basic info").zh_CN("人员信息")
                        .has_field("name").zh_CN("名字")
                            .range(1, 40)



            .change_request("bind with mobile").zh_CN("验证手机号")
                .contains_event("bind mobile").zh_CN("验证手机号")
                    .has_field("m1").display()
                        .value("请您验证手机号, 方便系统为您分派任务,并及时联系到您")
                    .has_field("mobile").zh_CN("手机号")
                        .with_style(UIStyle.INPUT_VERIFY_CODE).by_url("wxappService/sendVerifyCode/:mobile/")
                    .has_field("vcode").zh_CN("验证码")
                        .range(4,8)

                ;
    }

}
