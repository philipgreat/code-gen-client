package cla.edg.project.saleschain.workprocessor;

import cla.poc.workflow.WorkProcessorBuilder;
import cla.poc.workflow.WorkProcessorScript;

public class DemandWorkProcessor implements WorkProcessorScript {
    @Override
    public WorkProcessorBuilder makeSequel(WorkProcessorBuilder builder) {
        return builder.processing("demand proposal").zh_CN("需求处理流程")
                .once_started()
                .split_to("wait_user_connect", "wait_supplier_connect")

            .in_status("wait user connect").zh_CN("等待用户对接")
                .on_event("confirm").zh_CN("用户确认").by_role("user")
                    .go_to("user connected")

                .as_role("user")
                    .can_do("user confirm connect")

            .in_status("user connected").zh_CN("用户已对接")
                .once_enter()
                    .go_to("connected")

            .in_status("wait supplier connect").zh_CN("等待供应商对接")
                .on_event("confirm").zh_CN("供应商确认").by_role("supplier")
                    .go_to("supplier connected").zh_CN("已对接")

                .on_event("reject").zh_CN("供应商拒绝").by_role("supplier")
                    .go_to("cancelled").zh_CN("已取消")

                .as_role("supplier")
                    .can_do("supplier confirm connect", "supplier reject connect")

            .in_status("supplier connected").zh_CN("供应商已对接")
                .once_enter()
                    .go_to("connected")

            .in_status("connected")
                .can_enter_when()
                    .must_have("user connected").all_success()
                    .must_have("supplier connected").all_success()

                .once_enter()
                    .split_to("wait_user_deal", "wait_supplier_deal")

            .in_status("wait_user_deal")
                .on_event("confirm").by_role("user").go_to("user deal")

                .as_role("user")
                    .can_do("user confirm deal")

            .in_status("user deal").zh_CN("用户成交")
                .once_enter().go_to("deal")

            .in_status("wait supplier deal")
                .on_event("confirm").by_role("supplier")
                    .go_to("supplier deal")

                .as_role("supplier")
                    .can_do("supplier confirm deal")

            .in_status("supplier deal").zh_CN("供应商成交")
                .once_enter().go_to("deal")

            .in_status("deal").zh_CN("已成交")
                .can_enter_when()
                    .must_have("user deal").all_success()
                    .must_have("supplier deal").all_success()

                .on_event("platform finalize")
                    .go_to("closed")



            .in_status("closed").zh_CN("已关闭")
                .nothing_to()
            .in_status("cancelled").zh_CN("已取消")
                .nothing_to()
        ;
    }
}
