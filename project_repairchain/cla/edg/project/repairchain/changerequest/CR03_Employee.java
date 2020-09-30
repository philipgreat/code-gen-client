package cla.edg.project.repairchain.changerequest;

import cla.edg.project.repairchain.gen.dbquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class CR03_Employee implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("add employee by agent").zh_CN("添加人员")
                .step("A").zh_CN("添加员工")
                    .contains_event("employee basic info").zh_CN("人员信息").as("A")
                        .has_field("factory id").zh_CN("工厂")
                            .fill_by_request("factory id")
                            .hidden()
                        .has_field("agent id").zh_CN("代理")
                            .fill_by_request("agent id").optional()
                            .hidden()
                        .has_field("factory").zh_CN("工厂")
                            .fill_by_request("factory id", MODEL.factory().name())
                            .display()
                        .has_field("mobile").zh_CN("手机号")
                            .which_type_of(FieldType.MOBILE)
                            .place_holder("请输入员工的手机号")
                        .has_field("work position").zh_CN("岗位")
                            .which_model_of(MODEL.workPosition()).values_can_select_from_query_by(null)
                        .has_field("leader").zh_CN("直接上级")
                            .which_model_of(MODEL.employee())
                            .values_can_select_from_query_by("${factory id}")
                            .optional()
                            .tips_title("?")
                            .tips_content("如果没有上级,可以不选")




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
