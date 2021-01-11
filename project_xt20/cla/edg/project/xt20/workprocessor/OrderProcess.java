package cla.edg.project.xt20.workprocessor;

import cla.poc.workflow.WorkProcessorBuilder;
import cla.poc.workflow.WorkProcessorScript;

public class OrderProcess implements WorkProcessorScript {
    @Override
    public WorkProcessorBuilder makeSequel(WorkProcessorBuilder builder) {
        return builder.processing("order").zh_CN("订单处理流程")
                .once_started().go_to("processing")
                .in_status("processing").zh_CN("待处理")
                    .on_event("seller create order").zh_CN("代客下单")
                        .go_to("waiting buyer confirm")
                    .on_event("buyer create order").zh_CN("买家下单")
                        .when("not enough item inventory").zh_CN("库存不够")
                        .go_to("waiting seller confirm")
                        .when("success")
                        .go_to("submitted")
                .in_status("waiting buyer confirm").zh_CN("待买家确认")
                    .on_event("confirm timeout").zh_CN("买家确认超时")
                        .go_to("buyer confirm timeout")
                    .on_event("buyer confirm").zh_CN("买家确认")
                        .when("item quantity increase").zh_CN("买家增加了数量").go_to("waiting seller confirm")
                        .when("success").go_to("submitted")
                    .on_event("seller force confirm").zh_CN("商家代客户确认订单")
                        .go_to("submitted")
                .in_status("buyer confirm timeout").zh_CN("买家确认超时")
                    .on_event("seller force confirm").zh_CN("商家代客户确认订单")
                        .go_to("submitted")
                    .on_event("buyer confirm").zh_CN("买家确认")
                        .when("item quantity increase").zh_CN("买家增加了数量").go_to("waiting seller confirm")
                        .when("success").go_to("submitted")
                .in_status("waiting seller confirm").zh_CN("待审核")
                    .on_event("seller confirm").zh_CN("商家确认订单")
                    .go_to("submitted")
                .in_status("submitted").zh_CN("已提交")
                    .once_enter()
                        .when("delivery").zh_CN("送货上门")
                        .go_to("waiting seller delivery")
                        .when("pick up").zh_CN("自提")
                        .go_to("waiting buyer pick up")
                .in_status("waiting seller delivery").zh_CN("待卖家发货")
                    .on_event("seller delivery").zh_CN("配送单发货")
                    .go_to("seller shipping")
                .in_status("seller shipping").zh_CN("正在配送")
                    .on_event("item shipped").when("all item shipped")
                    .go_to("completed")
                .in_status("waiting buyer pick up").zh_CN("待买家自提")
                    .on_event("pick up done").go_to("completed")
                .in_status("completed").zh_CN("完成")
            ;
        }

}
