package cla.edg.project.xt20.workprocessor;

import cla.poc.workflow.WorkProcessorBuilder;
import cla.poc.workflow.WorkProcessorScript;

public class ShippingProcess implements WorkProcessorScript {
    @Override
    public WorkProcessorBuilder makeSequel(WorkProcessorBuilder builder) {
        return builder.processing("shipping").zh_CN("运单处理流程")
                .once_started().go_to("created")
                .in_status("created").zh_CN("创建")
                    .once_enter()
                        .when("delivery").zh_CN("送货上门")
                        .go_to("waiting seller delivery")
                        .when("pick up").zh_CN("自提")
                        .go_to("waiting buyer pick up")
                .in_status("waiting seller delivery").zh_CN("待卖家发货")
                    .on_event("seller delivery").zh_CN("配送单发货")
                    .go_to("seller shipping")
                .in_status("seller shipping").zh_CN("正在配送")
                    .on_event("item shipped")
                    .go_to("completed")
                .in_status("waiting buyer pick up").zh_CN("待自提")
                    .on_event("buyer picked up")
                    .go_to("completed")
                .in_status("completed").zh_CN("完成")
            ;
        }

}
