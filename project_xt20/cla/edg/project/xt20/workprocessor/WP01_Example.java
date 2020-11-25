package cla.edg.project.xt20.workprocessor;

import cla.poc.workflow.WorkProcessorBuilder;
import cla.poc.workflow.WorkProcessorScript;

public class WP01_Example implements WorkProcessorScript {
    @Override
    public WorkProcessorBuilder makeSequel(WorkProcessorBuilder builder) {
        return builder.processing("some work").zh_CN("工作处理流程")
                .once_started().go_to("need process")
                // 等价于
                //  .in_status("start").zh_CN("开始")
                //      .on_event("enter").zh_CN("进入")
                //          .when("ok").zh_CN("成功").reach_condition("ok")
                //      .when_condition("ok").zh_CN("成功").go_to("need process")

                .in_status("need process").zh_CN("待处理")
                    .comments("这句注释会出现在第一行")
                    .comments("然后会加一个空行")
                    .comments("然后是后面这些注释的内容")
                    .comments("每个占一行")
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
                    .can_enter_when()
                        .has_no_any("checking")
                        .has_no_any("in repairing")
                        .must_have("work delivered").all_success()

                    .on_event("improved").zh_CN("已完善")
                        .go_to("need process")

                    .as_role("line worker").can_do("update application")
            ;
        }

}
