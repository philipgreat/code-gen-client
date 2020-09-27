package cla.edg.project.repairchain.workprocessor;

import cla.poc.workflow.WorkProcessorBuilder;
import cla.poc.workflow.WorkProcessorScript;

public class WP01_MaintainenceWork implements WorkProcessorScript {
    @Override
    public WorkProcessorBuilder makeSequel(WorkProcessorBuilder builder) {
        return builder.processing("maintenance work").zh_CN("工单处理流程")
                .once_started().go_to("need process")

            .in_status("need process").zh_CN("待处理")
                .comments("待处理. 操作工提交了报修单,等待生产侧的主管审核. 如果超时要升级")
                .comments("在进入此状态时, 系统需要(根据超时级别)计算哪些人需要收到此报告, 以完成审核.")
                .comments("这些人都会收到一个 TODO_TASK. TODO_TASK 要求自动发送通知, 所以这些人都会收到通知")
                .comments("同时计算一个超时+提醒时间, 如果时间到了, 还需要处理条件 escalation 的对应事件:")
                .comments("escalation: 之前的TODO_TASK都撤销, 标记升级")
                .on_event("timeout").zh_CN("超时")
                    .when("has higher employee").zh_CN("有上级").reach_condition("escalation")
                    .when("no higher employee").zh_CN("没有上级").go_to("intervention manually")
                .on_event("U manager reviewed").zh_CN("生产主管审核")
                    .when("not pass").zh_CN("待完善").go_to("need improve")
                    .when_success().go_to("submitted")

                .when_condition("escalation").zh_CN("紧急程度提升").go_to("need process")

                .as_role("line worker").zh_CN("操作工").can_do_nothing()
                .as_role("line leader").zh_CN("生产经理").can_do("review application")
                .as_role("repair leader").zh_CN("维修经理").can_do_nothing()
                .as_role("repair worker").zh_CN("维修工").can_do_nothing()

            .in_status("need improve").zh_CN("待完善")
                .comments("这个状态表示需要提交人完善信息, 重置超时及类别")
                .on_event("improved").zh_CN("已完善")
                    .go_to("need process")

                .as_role("line worker").can_do("update application")

            .in_status("submitted").zh_CN("已报修")
                .comments("已报修. 等待维修侧的主管来审核及派单, 如果超时了要提醒并升级, 如果不能修要标明")
                .comments("这个状态表示生产部门已经通过了维修请求的检查, 要求维修部门尽快处理")
                .comments("系统需要(根据超时级别)计算哪些人需要收到此报告, 以完成审核和派发")
                .on_event("timeout").zh_CN("超时")
                    .when("has higher employee").zh_CN("还有上级").reach_condition("escalation")
                    .when("no higher employee").zh_CN("没有上级了").go_to("intervention manually")
                .on_event("repair leader reviewed").zh_CN("维修主管审核")
                    .when("need improve").zh_CN("内容待完善").go_to("need improve")
                    .when("cannot repair").zh_CN("无法修理").go_to("cannot repair")
                    .when_success().split_to("assigned")

                .when_condition("escalation").zh_CN("重要程度提升").go_to("submitted")

                .as_role("line worker").can_do_nothing()
                .as_role("line leader").can_do_nothing()
                .as_role("repair leader").can_do("assign worker")
                .as_role("repair worker").can_do_nothing()

            .in_status("assigned").zh_CN("已派单")
                .comments("已派单. 等待工人接单,超时了要有提醒")
                .on_event("timeout").zh_CN("超时")
                    .when("timeout").reach_condition("timeout")
                .on_event("accepted").zh_CN("确认接单")
                    .go_to("checking")

                .when_condition("timeout").zh_CN("接单超时").go_to("assigned")

                .as_role("repair worker").can_do("accept")

            .in_status("checking").zh_CN("故障检查")
                .comments("维修前对具体故障进行检查,定位原因, 确定维修方案")
                .on_event("start repairing").zh_CN("开始维修").go_to("in repairing")
                .on_event("cannot repair").zh_CN("无法修理").go_to("need review")
                .on_event("need reassign").zh_CN("需要重新派单").go_to("submitted")
                .on_event("repairing report").zh_CN("维修记录").stay_here()

                .as_role("repair worker")
                    .can_do("start repair")
                    .can_do("report cannot repair")
                    .can_do("repairing report")


            .in_status("in repairing").zh_CN("维修中")
                .comments("处理中. 等待工人完成维修,超时了要有提醒")
                .on_event("timeout").zh_CN("超时")
                    .when("timeout").reach_condition("timeout")
                .on_event("repairing report").zh_CN("维修记录").stay_here()
                .on_event("report done").zh_CN("修理报告完成").reach_condition("report done")


                .when_condition("timeout").zh_CN("处理超时").go_to("in repairing")
                .when_condition("report done").go_to("need review")

                .as_role("repair worker")
                    .can_do("report result")
                    .can_do("repairing report")


            .in_status("need review").zh_CN("待主管核验")
                .comments("待审核. 等待维修侧主管审核维修记录, 如果超时要升级. 如果确实不能维修, 要标明")
                .can_enter_when()
                    .if_have("checking").all_success()
                    .if_have("in repairing").all_success()

                .on_event("timeout").zh_CN("超时")
                    .when("has higher employee").zh_CN("有上级").reach_condition("escalation")
                    .when("no higher employee").zh_CN("没有上级").go_to("intervention manually")
                .on_event("review done").zh_CN("核验完毕")
                    .when("need rework").zh_CN("待返工").reach_condition("reject by repair manager")
                    .when("cannot repair").zh_CN("无法修理").go_to("cannot repair")
                    .when_success().go_to("need confirm")

                .when_condition("reject by repair manager").zh_CN("维修主管审核失败").go_to("in repairing")
                .when_condition("escalation").zh_CN("紧迫程度提升").go_to("need review")

                .as_role("line worker").can_do_nothing()
                .as_role("line leader").can_do_nothing()
                .as_role("repair leader").can_do("review repair report")
                .as_role("repair worker").can_do_nothing()


            .in_status("need confirm").zh_CN("待确认")
                .on_event("confirmed").zh_CN("确认修复").go_to("fixed")
                .on_event("not fix").zh_CN("未修复").go_to("need process")

                .as_role("line worker").can_do("confirm fixed", "disagree fixed")
                .as_role("line leader").can_do_nothing()
                .as_role("repair leader").can_do_nothing()
                .as_role("repair worker").can_do_nothing()

            .in_status("fixed").zh_CN("已修复")
                .comments("已修复. 结单,写日志等.")
                .nothing_to()
            .in_status("cannot repair").zh_CN("无法维修")
                .comments("无法维修. 改状态, 发通知")
                .nothing_to()
            .in_status("intervention manually").zh_CN("待人工处理")
                .comments("有争议. 改状态, 发通知")
                .nothing_to()

        ;
    }
}
