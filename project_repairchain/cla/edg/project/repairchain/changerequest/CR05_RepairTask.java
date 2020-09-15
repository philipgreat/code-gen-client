package cla.edg.project.repairchain.changerequest;

import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;

public class CR05_RepairTask implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("repair application").zh_CN("报修单")
                .step("step 1").zh_CN("第一步")
                    .contains_event("bind info").zh_CN("绑定")
                        .has_field("name").zh_CN("名字")
                            .range(1, 40)



                .change_request("appointment application").zh_CN("预约单")
                    .contains_event("bind info")

                .change_request("update repair application").zh_CN("完善报修单")
                    .contains_event("bind info")

                .change_request("add plan job").zh_CN("新建计划任务")
                    .contains_event("bind info")


                .change_request("repairing report").zh_CN("维修报告")
                    .contains_event("bind info")


                .change_request("repairing feedback").zh_CN("维修反馈")
                    .contains_event("bind info")

                .change_request("repairing audit").zh_CN("任务审核")
                    .contains_event("bind info")

                .change_request("start plan job").zh_CN("执行任务")
                    .contains_event("bind info")

                .change_request("cancel plan job").zh_CN("取消任务")
                    .contains_event("bind info")

                .change_request("update plan job").zh_CN("更新任务")
                    .contains_event("bind info")
                ;
    }

}
