package cla.edg.project.repairchain.workprocessor;

import cla.poc.workflow.WorkProcessorBuilder;
import cla.poc.workflow.WorkProcessorScript;

public class WP01_RepairApplication implements WorkProcessorScript {
    @Override
    public WorkProcessorBuilder makeSequel(WorkProcessorBuilder builder) {
        return builder.processing("repair application").zh_CN("报修单处理流程")
                .once_started().go_to("need process")

            .in_status("need process").zh_CN("待处理")
                .on_event("timeout").zh_CN("超时")
                    .when("has higher employee").zh_CN("有上级").go_to("U escalation")
                    .when("no higher employee").zh_CN("没有上级").go_to("intervention manually")
                .on_event("U manager reviewed").zh_CN("生产主管审核")
                    .when("not pass").zh_CN("待完善").go_to("need improve")
                    .when_success().go_to("submitted")

                .as_role("reporter").zh_CN("操作工").can_do_nothing()
                .as_role("line manager").zh_CN("生产经理").can_do("review application")
                .as_role("repair manager").zh_CN("维修经理").can_do_nothing()
                .as_role("repair worker").zh_CN("维修工").can_do_nothing()

            .in_status("U escalation").zh_CN("紧急程度提升")
                .once_enter().go_to("need process")

            .in_status("need improve").zh_CN("待完善")
                .on_event("improved").zh_CN("已完善")
                    .go_to("need process")

                .as_role("reporter").can_do("update application")
                .as_role("line manager").can_do_nothing()
                .as_role("repair manager").can_do_nothing()
                .as_role("repair worker").can_do_nothing()

            .in_status("submitted").zh_CN("已报修")
                .on_event("timeout").zh_CN("超时")
                    .when("has higher employee").zh_CN("还有上级").go_to("M escalation")
                    .when("no higher employee").zh_CN("没有上级了").go_to("intervention manually")
                .on_event("M manager reviewed").zh_CN("维修主管审核")
                    .when("need improve").zh_CN("内容待完善").go_to("need improve")
                    .when("cannot repair").zh_CN("无法修理").go_to("cannot repair")
                    .when_success().go_to("assigned")

                .as_role("reporter").can_do_nothing()
                .as_role("line manager").can_do_nothing()
                .as_role("repair manager").can_do("review submitted application","assign worker","report damage")
                .as_role("repair worker").can_do_nothing()


            .in_status("M escalation").zh_CN("重要程度提升")
                .once_enter().go_to("submitted")

            .in_status("assigned").zh_CN("已派单")
                .on_event("timeout").zh_CN("超时")
                    .go_to("accepting timeout")
                .on_event("accepted").zh_CN("确认接单")
                    .go_to("processing")

                .as_role("reporter").can_do_nothing()
                .as_role("line manager").can_do_nothing()
                .as_role("repair manager").can_do_nothing()
                .as_role("repair worker").can_do("accept")

            .in_status("accepting timeout").zh_CN("工人未响应")
                .once_enter().go_to("assigned")

            .in_status("processing").zh_CN("维修中")
                .on_event("timeout").zh_CN("超时")
                    .go_to("processing timeout")
                .on_event("report done").zh_CN("修理报告完成")
                    .go_to("need review")

                .as_role("reporter").can_do_nothing()
                .as_role("line manager").can_do_nothing()
                .as_role("repair manager").can_do_nothing()
                .as_role("repair worker").can_do("report result")

            .in_status("processing timeout").zh_CN("未及时完成")
                .once_enter().go_to("processing")

            .in_status("need review").zh_CN("待主管核验")
                .on_event("timeout").zh_CN("超时")
                    .when("has higher employee").zh_CN("有上级").go_to("T escalation")
                    .when("no higher employee").zh_CN("没有上级").go_to("intervention manually")
                .on_event("review done").zh_CN("核验完毕")
                    .when("need rework").zh_CN("待返工").go_to("processing")
                    .when("cannot repair").zh_CN("无法修理").go_to("cannot repair")
                    .when_success().go_to("need confirm")

                .as_role("reporter").can_do_nothing()
                .as_role("line manager").can_do_nothing()
                .as_role("repair manager").can_do("review repair report")
                .as_role("repair worker").can_do_nothing()

            .in_status("T escalation").zh_CN("紧迫程度提升")
                .once_enter().go_to("need review")

            .in_status("need confirm").zh_CN("待确认")
                .on_event("confirmed").zh_CN("确认修复").go_to("fixed")
                .on_event("not fix").zh_CN("未修复").go_to("need process")

                .as_role("reporter").can_do("confirm fixed", "disagree fixed")
                .as_role("line manager").can_do_nothing()
                .as_role("repair manager").can_do_nothing()
                .as_role("repair worker").can_do_nothing()

            .in_status("fixed").zh_CN("已修复")
                .nothing_to()
            .in_status("cannot repair").zh_CN("已修复")
                .nothing_to()
            .in_status("intervention manually").zh_CN("待人工处理")
                .nothing_to()

        ;
    }
}
