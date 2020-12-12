package cla.edg.project.xt20.changerequest;

import cla.edg.project.xt20.gen.dbquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;
import com.terapico.changerequest.builder.UIStyle;

public class CR00_AllTBD implements ChangeRequestSpecFactory {
    protected boolean debug = false;
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        if (!debug) {
            return builder;
        }
        return builder.change_request("confirm join").zh_CN("确认加入")
                .step("A").zh_CN("第一步")
                    .contains_event("tbd").zh_CN("待定义")
                        .has_field("tbd").zh_CN("字段待定义")
                            .range(1,4)
                            .place_holder("事件待定义,随便输点什么")

            .change_request("update company info").zh_CN("商户基础信息")
                .step("A").zh_CN("商户基础信息").contains_event("tbd")


            .change_request("copy product").zh_CN("复制产品")
                .step("A").zh_CN("复制产品").contains_event("tbd")
            .change_request("update product info").zh_CN("修改产品")
                .step("A").zh_CN("修改产品").contains_event("tbd")

            .change_request("audit order").zh_CN("完成审核")
                .step("A").zh_CN("完成审核").contains_event("tbd")
            .change_request("create handover task").zh_CN("创建交接单")
                .step("A").zh_CN("创建交接单").contains_event("tbd")
            .change_request("send to customer audit").zh_CN("提交客户审核")
                .step("A").zh_CN("提交客户审核").contains_event("tbd")
            .change_request("update delivery info").zh_CN("修改配送信息")
                .step("A").zh_CN("修改配送信息").contains_event("tbd")

            .change_request("edit buyer colleague").zh_CN("备注")
                .step("A").zh_CN("备注").contains_event("tbd")
            .change_request("buyer BIC confirm").zh_CN("确认")
                .step("A").zh_CN("确认").contains_event("tbd")

            .change_request("custom product when quote").zh_CN("自定义")
                .step("A").zh_CN("自定义").contains_event("tbd")
            .change_request("more supplier product").zh_CN("信息反馈")
                .step("A").zh_CN("信息反馈").contains_event("tbd")
            .change_request("buyer update order").zh_CN("修改订单")
                .step("A").zh_CN("修改订单").contains_event("tbd")
            .change_request("confirm quote").zh_CN("同意代下")
                .step("A").zh_CN("同意代下").contains_event("tbd")
            .change_request("buyer update delivery info").zh_CN("完善配送")
                .step("A").zh_CN("完善配送").contains_event("tbd")
            .change_request("confirm delivery task").zh_CN("确认交接")
                .step("A").zh_CN("确认交接").contains_event("tbd")

            .change_request("buyer delivery info").zh_CN("配送信息")
                .step("A").zh_CN("配送信息").contains_event("tbd")
            .change_request("create split order").zh_CN("提交新单")
                .step("A").zh_CN("提交新单").contains_event("tbd")



            .change_request("update merchant info when view buyer").zh_CN("完善信息")
                .step("A").zh_CN("完善信息").contains_event("tbd")
//            .change_request("create delivery task").zh_CN("创建配送任务")
//                .step("A").zh_CN("创建配送任务").contains_event("tbd")
//            .change_request("update delivery task").zh_CN("编辑配送任务")
//                .step("A").zh_CN("编辑配送任务").contains_event("tbd")
            .change_request("confirm as customer").zh_CN("代客确认")
                .step("A").zh_CN("代客确认").contains_event("tbd")
            .change_request("custom product when quote by product").zh_CN("自定义")
                .step("A").zh_CN("自定义").contains_event("tbd")
            .change_request("update merchant info when quote").zh_CN("完善信息")
                .step("A").zh_CN("完善信息").contains_event("tbd")
            .change_request("update personal info").zh_CN("更新个人信息")
                .step("A").zh_CN("更新个人信息").contains_event("tbd")
            .change_request("buyer ").zh_CN("审核加入")
                .step("A").zh_CN("审核加入").contains_event("tbd")








                ;
    }

}
