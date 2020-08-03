package cla.edg.project.saleschain.changerequest;

import cla.edg.project.saleschain.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;

public class AccountChangeRequest implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("with draw application").zh_CN("余额提现")
                    .has_field("amount").zh_CN("提现金额")
                        .which_type_of(FieldType.MONEY)
                        .range(1, 10000)
                        .place_holder("提现金额")
                    .has_field("mobile").zh_CN("手机号码")
                        .which_type_of(FieldType.MOBILE)
                    .has_field("bank name").zh_CN("开户行名称")
                        .range(0,99).optional()
                    .has_field("band id").zh_CN("银行账号")
                        .range(0,64).optional()
                    .has_field("alipay id").zh_CN("支付宝账号")
                        .range(0,99).optional()

                .change_request("post feedback").zh_CN("意见反馈")
                    .has_field("title").zh_CN("标题")
                        .range(1,100)
                    .has_field("content").zh_CN("反馈内容")
                        .range(1,1000)
                        .which_type_of(FieldType.MULTI_TEXT)
                ;
    }

}
