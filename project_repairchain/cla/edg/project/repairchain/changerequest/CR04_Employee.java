package cla.edg.project.repairchain.changerequest;

import cla.edg.project.repairchain.gen.dbquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class CR04_Employee implements ChangeRequestSpecFactory {
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
                            //.values_can_select_from_query_by("${factory id}")
                            .values_can_select_from_query_by("wxappService/queryLeader/${factory id}/:keyword/+/")
//                            .values_can_check_from_query_by("wxappService/queryLeader/${factory id}/:keyword/+/")
                            .optional()
                            .tips_title("?")
                            .tips_content("如果没有上级,可以不选")

            .change_request("change employee mobile").zh_CN("变更手机号")
                .step("A").zh_CN("变更手机号")
                    .contains_event("change employee mobile").zh_CN("人员信息").as("A")
                        .has_field("employee id").zh_CN("ID")
                            .fill_by_request("employee id").optional()
                            .hidden()
                        .has_field("old mobile").zh_CN("原手机号")
                            .fill_by_request("employee id", MODEL.employee().mobile())
                            .disabled()
                        .has_field("old vcode").zh_CN("验证手机")
                            .with_style(UIStyle.INPUT_VERIFY_CODE)
                            .place_holder("请输入验证码")
                        .has_field("new mobile").zh_CN("新手机号")
                            .which_type_of(FieldType.MOBILE)
                            .with_style(UIStyle.INPUT_VERIFY_CODE)
                            .place_holder("请输入新的手机号")
                        .has_field("vcode").zh_CN("验证码")
                            .place_holder("请输入验证码")

            .change_request("employee transfer").zh_CN("工作交接")
                .step("A").zh_CN("工作交接")
                    .contains_event("employee transfer").zh_CN("工作交接").as("A")
                        .has_field("from employee").zh_CN("ID")
                            .fill_by_request("employee id").optional()
                            .hidden()
                        .has_field("employee name").zh_CN("员工姓名")
                            .fill_by_request("employee id", MODEL.employee().title())
                            .range(1,40)
                            .disabled()
                        .has_field("to employee").zh_CN("接手员工")
                            .which_model_of(MODEL.employee())
                            .values_can_select_from_query_by("${from employee}")
                            .optional()


            .change_request("bind with mobile").zh_CN("验证手机号")
                .contains_event("bind mobile").zh_CN("验证手机号")
                    .has_field("m1").display()
                        .value("请输入真实的姓名,方便同事找到您")
                    .has_field("name").zh_CN("姓名")
                        .place_holder("请输入姓名")
                        .range(1,40)
                    .has_field("m2").display()
                        .value("请您验证手机号, 方便系统及时联络您")
                    .has_field("mobile").zh_CN("手机号")
                        .with_style(UIStyle.INPUT_VERIFY_CODE).by_url("wxappService/sendVerifyCode/:mobile/")
                    .has_field("vcode").zh_CN("验证码")
                        .range(4,8)

            .change_request("update employee info").zh_CN("更新人员信息")
                .contains_event("update employee info").zh_CN("更新人员信息")
                    .has_field("user id").zh_CN("用户ID")
                        .fill_by_request("user id")
                        .hidden()
                    .has_field("employee id").zh_CN("员工ID")
                        .fill_by_request("employee id")
                        .disabled()
                    .has_field("name").zh_CN("姓名")
                        .range(1,40)
                        .fill_by_request("user id", MODEL.personalUser().name())
                    .has_field("avatar").zh_CN("照片")
                        .which_type_of(FieldType.IMAGE)
                        .fill_by_request("user id", MODEL.personalUser().avatar())

                ;
    }

}
