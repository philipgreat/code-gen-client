package cla.edg.project.xt20.changerequest;

import cla.edg.project.xt20.gen.dbquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class CR02_OrganizationRelated implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("seller register").zh_CN("商户注册")
        .step("A").zh_CN("商户注册")
            .contains_event("organization info").zh_CN("商户注册")
                .has_field("id").zh_CN("ID")
                    .optional()
                    .fill_by_request("organization identity id")
                    .hidden()
                .has_field("name").zh_CN("单位名称")
                    .place_holder("请输入您的单位名称")
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().name())
                    .range(1,40)
                .has_field("agency social code").zh_CN("信用代码")
                    .place_holder("请输入您的单位信用代码")
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().agencySocialCode())
                    .range(18,18).optional()
                .has_field("contact name").zh_CN("联系人")
                    .place_holder("请输入联系人姓名")
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().contactName())
                    .range(1,20)
                .has_field("contact mobile").zh_CN("联系电话")
                    .place_holder("请输入联系电话")
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().mobile())
                    .which_type_of(FieldType.MOBILE)
                .has_field("address").zh_CN("单位地址")
                    .place_holder("请输入单位所在地址")
                    .fill_by_request("merchant id", MODEL.organizationIdentity().address())
                    .range(1,100)
                .has_field("logo").zh_CN("单位logo")
                    .which_type_of(FieldType.IMAGE)
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().logo())




        .change_request("seller update merchant info").zh_CN("完善信息")
        .step("A").zh_CN("完善组织信息")
            .contains_event("organization info")
                .has_field("agency social code")
                    .must_have()

        .change_request("update merchant info when invite").zh_CN("完善信息")
        .step("A").zh_CN("完善组织信息")
            .contains_event("organization info")
                .has_field("agency social code")
                    .must_have()

        .change_request("update merchant info from seller home").zh_CN("完善信息")
        .step("A").zh_CN("完善组织信息")
            .contains_event("organization info")
                .has_field("agency social code")
                    .must_have()

        .change_request("update merchant info when inbound").zh_CN("完善信息并入库")
            .step("A").zh_CN("完善信息并入库")
            .contains_event("organization info")
                .has_field("agency social code")
                    .must_have()

        .change_request("buyer update info in home").zh_CN("完善信息")
            .step("A").zh_CN("完善信息")
            .contains_event("organization info")
                .has_field("agency social code")
                .must_have()

        .change_request("buyer update merchant info").zh_CN("更新信息")
            .step("A").zh_CN("完善信息")
            .contains_event("organization info")
                .has_field("agency social code")
                .optional()



        .change_request("buyer admin transfer").zh_CN("转移管理员")
        .step("A").zh_CN("转移管理员")
            .contains_event("admin transfer").zh_CN("管理员变更")
                .has_field("merchant id").zh_CN("组织ID")
                    .fill_by_request("merchant id")
                    .hidden()
                .has_field("merchant name").zh_CN("组织名称")
                    .fill_by_request("merchant id", MODEL.merchant().name())
                    .display()
                .has_field("new admin").zh_CN("新管理员")
                    .which_model_of(MODEL.personalUser())
                    .values_can_select_from_query_by("wxappService/customerViewSelectColleague/${merchant id}/admin_transfer/+/")

        .change_request("company admin transfer").zh_CN("转移管理员")
        .step("A").zh_CN("转移管理员")
            .contains_event("admin transfer").zh_CN("管理员变更")



        .change_request("update merchant off time").zh_CN("设置商户下班时间")
            .step("A").zh_CN("设置商户下班时间")
            .contains_event("update merchant off time").zh_CN("设置商户下班时间")
                .has_field("merchant id").zh_CN("组织ID")
                    .fill_by_request("merchant id")
                    .hidden()
                .has_field("off time").zh_CN("下班时间")
                    .fill_by_request("merchant id", MODEL.merchant().offTime())
                    .which_model_of(MODEL.offTime())
                    .values_can_select_from_query_by(null)

        .change_request("update merchant delivery limit").zh_CN("设置单次配送最大量")
            .step("A").zh_CN("设置单次配送最大量")
            .contains_event("update merchant delivery limit").zh_CN("设置单次配送最大量")
                .has_field("merchant id").zh_CN("组织ID")
                    .fill_by_request("merchant id")
                    .hidden()
                .has_field("delivery limit").zh_CN("最大值")
                    .fill_by_request("merchant id", MODEL.merchant().deliveryLimit())


        .change_request("approve join buyer").zh_CN("批准加入")
            .step("A").zh_CN("批准加入")
            .contains_event("employee approve").zh_CN("批准加入")
                .has_field("employee id").zh_CN("被批准的岗位")
                    .fill_by_request("employee id")
                    .hidden()
                .has_field("name").zh_CN("姓名")
                    .optional()
                    .fill_by_request("personal id", MODEL.personalUser().name())
                    .range(1,40)
                    .place_holder("请输入姓名")
                .has_field("mobile").zh_CN("手机号")
                    .optional()
                    .fill_by_request("personal id", MODEL.personalUser().mobile())
                    .which_type_of(FieldType.MOBILE)
                    .place_holder("请输入电话")
                .has_field("employee comment").zh_CN("员工备注")
                    .optional()
                    .fill_by_request("employee id", MODEL.employee().comment())
                    .place_holder("请输入备注")
                .has_field("approve comment").zh_CN("说明")
                    .optional()
                    .place_holder("如有其他说明,请在此填写")
                    .which_type_of(FieldType.MULTI_TEXT)

        .change_request("audit join apply").zh_CN("审批加入+姓名")
            .step("A").zh_CN("批准加入")
            .contains_event("employee approve")

        .change_request("update colleague info").zh_CN("备注")
            .step("A").zh_CN("备注")
            .contains_event("employee approve")

                ;
    }

}
