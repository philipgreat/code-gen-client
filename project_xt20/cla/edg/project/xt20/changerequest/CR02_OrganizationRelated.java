package cla.edg.project.xt20.changerequest;

import cla.edg.project.xt20.gen.dbquery.MODEL;
import cla.edg.project.xt20.gen.dbquery.MerchantType;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class CR02_OrganizationRelated implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder
        .change_request("buyer update merchant info").zh_CN("更新信息")
            .step("A").zh_CN("完善企业信息")
            .contains_event("organization info").zh_CN("商户信息")
                .has_field("organization id").zh_CN("企业ID")
                    .optional()
                    .fill_by_request("organization identity id")
                    .hidden()
                .has_field("employee id").zh_CN("提交人")
                    .optional()
                    .fill_by_request("employee id")
                    .hidden()
                .has_field("order id").zh_CN("相关订单")
                    .optional()
                    .fill_by_request("order id")
                    .hidden()
                .has_field("name").zh_CN("企业简称")
                    .place_holder("请输入您企或品牌的简称")
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().name())
                    .range(1,40)
                .has_field("agency social code").zh_CN("信用代码")
                    .place_holder("输入企业名搜索选择")
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().agencySocialCode())
                    .values_can_select_from_query_by("wxappService/customerSelectMerchantCreditNo/+/")
                    .range(18,18).optional()
                .has_field("contact name").zh_CN("联系人")
                    .place_holder("请输入联系人姓名")
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().contactName())
                    .range(1,20)
                .has_field("contact mobile").zh_CN("联系电话")
                    .place_holder("请输入联系电话").optional()
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().mobile())
                    .range(0,20)
                .has_field("address").zh_CN("单位地址")
                    .place_holder("请输入单位所在地址")
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().address())
                    .range(1,100).optional()
                .has_field("logo").zh_CN("单位logo")
                    .which_type_of(FieldType.IMAGE).optional()
                    .place_holder("不大于2M")
                    .tips_content("不大于2M")
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().logo())
                .has_field("comment").zh_CN("备注")
                    .which_type_of(FieldType.MULTI_TEXT).input_at_next_line()
                    .optional()
                    .fill_by_request("organization identity id", MODEL.organizationIdentity().comment())
                    .range(0,200)



        .change_request("seller update merchant info").zh_CN("完善信息")
        .step("A").zh_CN("完善企业信息")
            .contains_event("organization info")
                .has_field("agency social code")
                    .must_have()

        .change_request("update merchant info when invite").zh_CN("完善信息")
        .step("A").zh_CN("完善企业信息")
            .contains_event("organization info")
                .has_field("agency social code")
                    .must_have()

        .change_request("update merchant info from seller home").zh_CN("完善信息")
        .step("A").zh_CN("完善企业信息")
            .contains_event("organization info")
                .has_field("agency social code")
                    .must_have()

        .change_request("update merchant info when inbound").zh_CN("完善信息并入库")
            .step("A").zh_CN("完善信息并入库")
            .contains_event("organization info")
                .has_field("agency social code")
                    .must_have()
            .contains_event("inbound info").zh_CN("入库信息")
                .has_field("merchant id").zh_CN("ID")
                    .fill_by_request("merchant id")
                .has_field("product id").zh_CN("产品ID")
                    .fill_by_request("product id")
                    .disabled()
                .has_field("product name").zh_CN("产品名称")
                    .fill_by_request("product id", MODEL.gasProduct().name())
                    .display()
                .has_field("number").zh_CN("入库数量")
                    .which_type_of(FieldType.INTEGER)
                    .fill_by_request("number")
                    .disabled()
                .has_field("operation").zh_CN("入库类型")
                    .values_canbe("produce", "生产入库").or("buy","外购入库")
                    .fill_by_request("scene code")

        .change_request("buyer update info in home").zh_CN("完善信息")
            .step("A").zh_CN("完善信息")
            .contains_event("organization info")
                .has_field("agency social code")
                .must_have()

        .change_request("seller register").zh_CN("1/3 商户信息")
            .step("A").zh_CN("商户注册")
            .contains_event("organization info")
                .has_field("agency social code")
                .must_have()



        .change_request("admin transfer").zh_CN("转移管理员")
        .step("A").zh_CN("转移管理员")
            .contains_event("admin transfer").zh_CN("管理员变更")
                .has_field("merchant id").zh_CN("企业ID")
                    .fill_by_request("merchant id")
                    .hidden()
                .has_field("merchant name").zh_CN("企业名称")
                    .fill_by_request("merchant id", MODEL.merchant().name())
                    .display()
                .has_field("current admin").zh_CN("当前管理员")
                    .fill_by_request("personal id", MODEL.personalUser().name())
                    .display()

                .has_field("new admin").zh_CN("新管理员")
                    .which_model_of(MODEL.employee())
                    .values_can_select_from_query_by("wxappService/customerViewSelectColleague/${merchant id}/admin_transfer/+/")


        .change_request("update supplier").zh_CN("编辑备注")
            .step("A").zh_CN("编辑备注").contains_event("update supplier")
                .has_field("merchant").zh_CN("用户")
                    .fill_by_request("merchant id")
                    .hidden()
                .has_field("supplier").zh_CN("供应商ID")
                    .fill_by_request("supplier id")
                    .hidden()
                .has_field("supplier name").zh_CN("供应商")
                    .fill_by_request("supplier id", MODEL.merchant().name())
                    .display()

                .has_field("comment").zh_CN("备注")
                    .fill_by_request("relation id", MODEL.supplyRelationship().customerComment())
                    .optional()
                    .range(0,40)



        .change_request("update merchant off time").zh_CN("设置企业下班时间")
            .step("A").zh_CN("设置企业下班时间")
            .contains_event("update merchant off time").zh_CN("设置企业下班时间")
                .has_field("merchant id").zh_CN("企业ID")
                    .fill_by_request("merchant id")
                    .hidden()
                .has_field("off time").zh_CN("下班时间")
                    .fill_by_request("merchant id", MODEL.merchant().offTime())
                    .which_model_of(MODEL.offTime())
                    .values_can_select_from_query_by(null)

        .change_request("update merchant delivery limit").zh_CN("设置单次配送最大量")
            .step("A").zh_CN("设置单次配送最大量")
            .contains_event("update merchant delivery limit").zh_CN("设置单次配送最大量")
                .has_field("merchant id").zh_CN("企业ID")
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
                    .which_type_of(FieldType.MULTI_TEXT).input_at_next_line()

        .change_request("audit join apply").zh_CN("审批加入+姓名")
            .step("A").zh_CN("批准加入")
            .contains_event("employee approve")

        .change_request("update colleague info").zh_CN("备注")
            .step("A").zh_CN("备注")
            .contains_event("employee approve")

        .change_request("seller add buyer").zh_CN("添加客户")
            .step("A").zh_CN("添加客户")
            .contains_event("seller add buyer").zh_CN("添加客户")
                .has_field("employee id").zh_CN("邀请人")
                    .fill_by_request("employee id")
                    .hidden()
                .has_field("buyer type").zh_CN("用户类型")
                    .values_canbe(MerchantType.PERSONAL.getLiteralName(), "个人用气用户").or(MerchantType.ORGANIZATION.getLiteralName(), "企业用气用户")
                    .defaule_value(MerchantType.ORGANIZATION.getLiteralName())


                .has_field("name").zh_CN("客户简称")
                    .range(1, 100)
                    .place_holder("请输入客户简称")
                .has_field("prompt 1")
                    .value("个人用户可不填信用代码")
                    .display()
                .has_field("agency social code").zh_CN("信用代码")
                    .range(18,18).optional()
                    .values_can_select_from_query_by("wxappService/customerSelectMerchantCreditNo/+/")
                    .place_holder("输入企业名搜索选择")
                    .optional()
                .has_field("mobile").zh_CN("用户手机号")
                    .which_type_of(FieldType.MOBILE)
                    .optional()
                    .place_holder("请输入客户手机号码")
                .has_field("comment").zh_CN("备注")
                    .range(0,100).optional()
                    .which_type_of(FieldType.MULTI_TEXT).input_at_next_line()
                    .place_holder("请输入备注信息")

        .change_request("add buyer for quote").zh_CN("添加客户")
            .step("A").zh_CN("添加客户")
            .contains_event("seller add buyer")

        .change_request("update buyer info when confirm quote").zh_CN("完善信息")
            .step("A").zh_CN("完善信息")
            .contains_event("organization info")

        .change_request("update buyer info when order").zh_CN("完善信息")
            .step("A").zh_CN("完善信息")
            .contains_event("organization info")

        .change_request("update merchant info when quote").zh_CN("完善信息")
            .step("A").zh_CN("完善信息")
            .contains_event("organization info")


        .change_request("seller update customer comment").zh_CN("修改备注")
            .step("A").zh_CN("完善信息")
            .contains_event("update comment").zh_CN("客户备注")
                .has_field("relation id")
                    .fill_by_request("relation id")
                    .hidden()
                .has_field("comment").zh_CN("备注")
                    .which_type_of(FieldType.MULTI_TEXT).input_at_next_line()
                    .fill_by_request("relation id", MODEL.supplyRelationship().customerComment())
                    .range(0, 200).optional()




        .change_request("fulfill individual identity").zh_CN("完善个人认证信息")
            .step("A").zh_CN("完善信息")
            .contains_event("update individual identity").zh_CN("个人认证信息")
                .has_field("identity id").zh_CN("ID")
                    .fill_by_request("individual identity id")
                    .range(1,48)
                    .hidden()
                .has_field("name").zh_CN("名称")
                    .fill_by_request("individual identity id", MODEL.individualIdentity().name())
                    .range(0,40)
                .has_field("identity mobile").zh_CN("认证号码")
                    .fill_by_request("individual identity id", MODEL.individualIdentity().identityMobile())
                    .which_type_of(FieldType.MOBILE)
                    .disabled()
                .has_field("mobile").zh_CN("联系电话")
                    .fill_by_request("individual identity id", MODEL.individualIdentity().mobile())
                    .range(0,20).optional()
                .has_field("contact name").zh_CN("联系人")
                    .fill_by_request("individual identity id", MODEL.individualIdentity().contactName())
                    .range(1,20).optional()
                .has_field("address").zh_CN("地址")
                    .fill_by_request("individual identity id", MODEL.individualIdentity().address())
                    .range(0,200).optional()
                .has_field("comment").zh_CN("备注")
                    .which_type_of(FieldType.MULTI_TEXT).input_at_next_line().optional()
                    .fill_by_request("organization identity id", MODEL.individualIdentity().comment())
                    .range(0,200)

        .change_request("update individual identity").zh_CN("更新认证信息")
            .step("A").zh_CN("完善信息")
            .contains_event("update individual identity")



        .change_request("buyer perfect entity info").zh_CN("完善信息信息")
            .step("A").zh_CN("完善信息")
            .contains_event("entity info").zh_CN("基本信息")
                .has_field("personal user id").zh_CN("用户ID")
                    .fill_by_request("current user id")
                    .hidden()
                // 以下为展示信息
                .has_field("entity type").zh_CN("用户类型")
                    .values_canbe(MerchantType.PERSONAL.getLiteralName(), "个人用气用户").or(MerchantType.ORGANIZATION.getLiteralName(), "企业用气用户")
                    .defaule_value(MerchantType.ORGANIZATION.getLiteralName())
                .has_field("name").zh_CN("名称")
                    .place_holder("请输入您的单位名称")
                    .range(1,40)

                .has_field("prompt 1")
                    .value("个人用户可不填信用代码")
                    .display()
                .has_field("agency social code").zh_CN("信用代码")
                    .place_holder("请输入您的单位信用代码")
                    .values_can_select_from_query_by("wxappService/customerSelectMerchantCreditNo/+/")
                    .range(18,18).optional()
                .has_field("contact name").zh_CN("联系人")
                    .place_holder("请输入联系人姓名")
                    .range(1,20)
                .has_field("contact mobile").zh_CN("联系电话")
                    .place_holder("请输入联系电话")
                    .range(0,20).optional()
                    .fill_by_request("current user mobile")
                .has_field("address").zh_CN("地址")
                    .place_holder("请输入所在地址")
                    .range(1,100).optional()
                .has_field("logo").zh_CN("单位logo")
                    .which_type_of(FieldType.IMAGE).optional()

                .has_field("comment").zh_CN("备注")
                    .which_type_of(FieldType.MULTI_TEXT).input_at_next_line()
                    .optional()
                    .range(0,200)
                ;

    }

}
