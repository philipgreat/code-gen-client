package cla.edg.project.xt20.workprocessor;

import cla.poc.workflow.WorkProcessorBuilder;
import cla.poc.workflow.WorkProcessorScript;

public class WP02_Order implements WorkProcessorScript {
    @Override
    public WorkProcessorBuilder makeSequel(WorkProcessorBuilder builder) {
        return builder.processing("order").zh_CN("订单处理流程")
                .once_started().go_to("processing")


                .in_status("processing").zh_CN("处理中")
                    .on_event("seller add to card").zh_CN("代客下单").go_to("wait buyer confirm")

                .in_status("wait buyer confirm").zh_CN("待客户确认")
                    .on_event("timeout").zh_CN("超时").go_to("buyer confirm timeout")

                .in_status("buyer confirm timeout").zh_CN("客户确认超时")
                    .on_event("seller force confirm").zh_CN("代客户确认").go_to("submitted")
            ;
        }

}
