package cla.edg.project.saleschain.changerequest;

import cla.edg.project.saleschain.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;

public class AccountChangeRequest implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("withdraw application").zh_CN("余额提现")
                    .has_field("amount").zh_CN("提现金额")
                        .which_type_of(FieldType.MONEY)
                        .range(1, 10000)
                        .place_holder("提现金额")
                    .has_field("receiver name").zh_CN("收款人姓名")
                        .range(1,40)
                        .tips_content("注意:请和预留在收款机构的姓名一致")
                    .has_field("mobile").zh_CN("手机号码")
                        .which_type_of(FieldType.MOBILE)
                        .tips_content("注意:请和预留在收款机构的手机号一致")
                    .has_field("id card no").zh_CN("证件号")
                        .range(5,21)
                        .tips_content("注意:请和预留在收款机构的证件一致")
                    .has_field("bank name").zh_CN("收款银行行名称")
                        .range(0,99).optional()
                        .tips_content("银行名称,例如 招商银行. 如果不是提现到银行,可不填")
                    .has_field("band account").zh_CN("银行账号")
                        .range(0,64).optional()
                        .tips_content("银行卡号,例如 6216xxxx. 如果不是提现到银行,可不填")
                    .has_field("alipay id").zh_CN("支付宝账号")
                        .range(0,99).optional()
                        .tips_content("如果提现到银行,可不填.")

                .change_request("post feedback").zh_CN("意见反馈")
                    .has_field("title").zh_CN("标题")
                        .range(1,100)
                    .has_field("content").zh_CN("反馈内容")
                        .range(1,1000)
                        .which_type_of(FieldType.MULTI_TEXT)

                .change_request("submit withdraw result").zh_CN("提交提现处理结果")
                    .has_field("application").zh_CN("提现申请")
                        .which_model_of(MODEL.withdrawApplication())
                        .values_can_select_from_query_by(null)
                    .has_field("result").zh_CN("处理结果")
                        .values_canbe(true, "成功").or(false, "失败")
                ;
    }

}
