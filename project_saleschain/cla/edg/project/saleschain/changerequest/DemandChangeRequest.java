package cla.edg.project.saleschain.changerequest;

import cla.edg.project.saleschain.gen.graphquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class DemandChangeRequest implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("post demand").zh_CN("需求提供")
                    .has_field("type").zh_CN("类型")
                        .which_model_of(MODEL.demandType())
                        .values_can_select_from_query_by(null)
                    .has_field("unit type").zh_CN("单位性质")
                        .which_model_of(MODEL.unitType())
                        .values_can_select_from_query_by(null)
                    .has_field("unit name").zh_CN("单位名称")
                        .place_holder("请输入需求方的单位名称")
                        .range(1,48)
                    .has_field("research group").zh_CN("课题组")
                        .place_holder("如有课题组,请输入")
                        .optional()
                        .range(0,99)
                    .has_field("contact name").zh_CN("联系人")
                        .range(1,40)
                    .has_field("contact mobile").zh_CN("联系电话")
                        .which_type_of(FieldType.MOBILE)
                    .has_field("content").zh_CN("需求详情")
                        .place_holder("请尽量细致的说明需要的物品细节")
                        .which_type_of(FieldType.MULTI_TEXT)


                .change_request("user confirm connect").zh_CN("用户确认对接")
                    .contains_event("confirmation")
                    .has_field("confirm type").zh_CN("确认类型")
                        .value("user_confirm_connect")
                        .range(1,30)
                        .hidden()
                    .has_field("proposal").zh_CN("需求推荐")
                        .which_model_of(MODEL.demandProposal())
                        .hidden()
                        .fill_by_request("proposal id")
                    .has_field("title").zh_CN("标题")
                         .fill_by_request("proposal id", MODEL.demandProposal().title())
                        .disabled()
                    .has_field("amount").zh_CN("成交金额")
                        .which_type_of(FieldType.MONEY)
                        .defaule_value("0")
                        .place_holder("请输入成交金额")
                        .tips_content("奖励相关的总成交金额")
                        .hidden()
                    .has_field("confirm time").zh_CN("时间")
                        .which_type_of(FieldType.DATE)
                        .optional()
                    .has_field("comments").zh_CN("备注")
                        .which_type_of(FieldType.MULTI_TEXT)
                        .optional()

                .change_request("supplier confirm connect").zh_CN("供应商确认对接")
                    .contains_event("confirmation")
                    .has_field("confirm type")
                        .value("supplier_confirm_connect")

                .change_request("user confirm deal").zh_CN("用户确认成交")
                    .contains_event("confirmation")
                    .has_field("confirm type")
                        .value("user_confirm_deal")
                    .has_field("amount")
                        .unhidden()

                .change_request("supplier confirm deal").zh_CN("供应商确认成交")
                    .contains_event("confirmation")
                    .has_field("confirm type")
                        .value("supplier_confirm_deal")
                    .has_field("amount")
                        .unhidden()

                .change_request("supplier reject connect").zh_CN("供应商取消对接")
                    .contains_event("confirmation")
                    .has_field("confirm type")
                        .value("supplier_reject_connect")


                .change_request("platform finalize reward").zh_CN("平台最终核定奖励")
                    .has_field("proposal").zh_CN("需求推荐")
                        .which_model_of(MODEL.demandProposal())
                    .has_field("amount").zh_CN("成交金额")
                        .which_type_of(FieldType.MONEY)
                        .defaule_value(0)
                        .place_holder("请输入成交金额")
                        .tips_content("需要核发奖励的总成交金额")
                   .has_field("reward ratio").zh_CN("奖励比例")
                        .which_type_of(FieldType.MONEY)
                        .defaule_value(3)
                        .range(0.00, 100.00)
                        .place_holder("请输入奖励百分比,不需要百分号")
                        .tips_content("不需要输入百分号")

                ;
    }

}
