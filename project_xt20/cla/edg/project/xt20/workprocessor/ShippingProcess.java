package cla.edg.project.xt20.workprocessor;

import cla.poc.workflow.WorkProcessorBuilder;
import cla.poc.workflow.WorkProcessorScript;

public class ShippingProcess implements WorkProcessorScript {
    @Override
    public WorkProcessorBuilder makeSequel(WorkProcessorBuilder builder) {
        return builder.processing("shipping").zh_CN("运单处理流程")
                .once_started().go_to("created")
                .in_status("created").zh_CN("已新建")
                    .once_enter()
                        .when("delivery").zh_CN("送货上门")
                        .go_to("waiting seller delivery")
                        .when("pickup").zh_CN("自提")
                        .go_to("waiting buyer pick up")
                .in_status("waiting seller delivery").zh_CN("待配送")
                    .on_event("seller delivery").zh_CN("卖家发货")
                    .go_to("seller shipping")
                .in_status("waiting buyer pick up").zh_CN("待自提")
                    .on_event("pick up done").zh_CN("完成自提")
                    .go_to("completed")
                .in_status("seller shipping").zh_CN("正在配送")
                    .on_event("buyer confirm").go_to("buyer received")
                .in_status("buyer received").zh_CN("已签收")
                    .on_event("back factory").zh_CN("回厂")
                    .go_to("completed")
                .in_status("completed").zh_CN("完成")
            ;
        }

}
