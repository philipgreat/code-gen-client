package cla.edg.project.repairchain.changerequest;

import cla.edg.project.repairchain.gen.dbquery.MODEL;
import com.terapico.changerequest.builder.ChangeRequestSpecBuilder;
import com.terapico.changerequest.builder.ChangeRequestSpecFactory;
import com.terapico.changerequest.builder.FieldType;

import java.lang.reflect.Field;

public class CR05_RepairTask implements ChangeRequestSpecFactory {
    public ChangeRequestSpecBuilder makeSequel(ChangeRequestSpecBuilder builder) {
        return builder.change_request("repair application").zh_CN("报修单")
                .step("step 1").zh_CN("第一步")
                    .contains_event("machine info").zh_CN("设备信息")
                        .has_field("machine name").zh_CN("设备")
                            .disabled()
                            .fill_by_request("machine id", MODEL.machine().name())
                        .has_field("machine number").zh_CN("编号")
                            .disabled()
                            .fill_by_request("machine id", MODEL.machine().machineIdentifier())
                        .has_field("machine model").zh_CN("型号")
                            .disabled()
                            .fill_by_request("machine id", MODEL.machine().modelName())
                        .has_field("machine location").zh_CN("位置")
                            .disabled()
                            .fill_by_request("machine id", MODEL.machine().machineLocation())
                    .contains_event("fault info").zh_CN("故障信息")
                        .has_field("repair now")
                            .value(true)
                            .hidden()
                        .has_field("work job id").zh_CN("工单")
                            .optional()
                            .fill_by_request("work job id")
                            .hidden()
                        .has_field("machine id").zh_CN("设备ID")
                            .hidden()
                            .fill_by_request("machine id")
                        .has_field("fault type").zh_CN("故障类别")
                            .which_model_of(MODEL.failureType())
                            .values_can_select_from_query_by(null)
                        .has_field("fault tags").zh_CN("故障特征")
                            .which_model_of(MODEL.failureBehave())
                            .values_can_check_from_query_by(null)
                            .range(0,1000)
                        .has_field("machine state").zh_CN("设备状态")
                            .which_model_of(MODEL.machineStatus())
                            .values_can_select_from_query_by(null)
                        .has_field("required time").zh_CN("维修时间")
                            .which_type_of(FieldType.DATE_TIME)
                            .optional()
                            .hidden()
                        .has_field("fault detail").zh_CN("故障现象")
                            .which_type_of(FieldType.MULTI_TEXT)
                        .has_field("images").zh_CN("现场图片")
                            .which_type_of(FieldType.IMAGES)
//                        .has_field("video").zh_CN("现场记录")
//                            .which_type_of(FieldType.VIDEO)
                        .has_field("send to").zh_CN("负责人")
                            .which_model_of(MODEL.employee())
                            .values_can_select_from_query_by("${machine id}")

                .change_request("appointment application").zh_CN("预约单")
                    .contains_event("machine info")
                    .contains_event("fault info").zh_CN("故障信息")
                        .has_field("repair now").value(false)
                        .has_field("required time").unhidden()

                .change_request("update repair application").zh_CN("完善报修单")
                    .contains_event("machine info")
                    .contains_event("fault info").zh_CN("故障信息")

                .change_request("application audit").zh_CN("任务审核")
                    .step("A").zh_CN("审核意见")
                    .contains_event("review result")
                        .has_field("review type")
                            .value("application audit")
                            .hidden()
                        .has_field("task title").zh_CN("工单")
                            .fill_by_request("work job id", MODEL.maintenanceTask().title())
                            .display()
                        .has_field("task id").zh_CN("工单")
                            .fill_by_request("work job id")
                            .disabled()
                        .has_field("review result").zh_CN("审核意见")
                            .values_canbe("pass", "同意").or("fail", "待完善")
                            .defaule_value("pass")
                        .has_field("comments").zh_CN("批注")
                            .which_type_of(FieldType.MULTI_TEXT).optional()
                            .place_holder("请填写批注")
                            .tips_title("?")
                            .tips_content("如果审核不通过,请注明原因")
                        .has_field("send to").zh_CN("维修主管")
                            .which_model_of(MODEL.employee()).optional()
                            .values_can_select_from_query_by("${task id}")
                            .tips_title("通过时需要")
                            .tips_content("如果审核不通过,系统会自动选择责任人; 如果通过,请选择维修负责人")

                .change_request("assign worker").zh_CN("分派维修工")
                    .step("A").zh_CN("审核意见")
                    .contains_event("assign worker")
                        .has_field("task title").zh_CN("工单")
                            .fill_by_request("work job id", MODEL.maintenanceTask().title())
                            .display()
                        .has_field("task id").zh_CN("工单")
                            .fill_by_request("work job id")
                            .disabled()
                        .has_field("review result").zh_CN("审核意见")
                            .values_canbe("pass", "同意派单").or("fail", "待完善").or("cannot_repair", "无法维修")
                            .defaule_value("pass")
                        .has_field("assign to").zh_CN("维修人员")
                            .which_model_of(MODEL.employee()).optional()
                            .values_can_check_from_query_by("${task id}")
                        .has_field("comments").zh_CN("批注")
                            .which_type_of(FieldType.MULTI_TEXT).optional()
                            .place_holder("请填写批注")


                .change_request("confirm work").zh_CN("接单")
                    .step("A").zh_CN("接单")
                    .contains_event("work job confirmation")
                        .has_field("task id").zh_CN("工单").range(1, 48)
                        .has_field("confirm type").zh_CN("确认类型")
                            .values_canbe("accept","接单").or("start","开始维修").or("finish", "修理完成")

                .change_request("work record").zh_CN("工作记录")
                    .step("A").zh_CN("修理记录")
                    .contains_event("task work record").zh_CN("工作记录")
                        .has_field("task id").zh_CN("工单")
                            .fill_by_request("work job id")
                            .disabled()
                        .has_field("reason").zh_CN("故障原因分析")
                            .which_type_of(FieldType.MULTI_TEXT)
                            .range(1,500)
                            .place_holder("请填写故障原因分析")
                        .has_field("treatment").zh_CN("故障处理方法")
                            .which_type_of(FieldType.MULTI_TEXT)
                            .range(1,500)
                            .place_holder("请填写故障处理方法")

                .change_request("audit repair").zh_CN("审核修理结果")
                    .step("A").zh_CN("审核修理结果")
                    .contains_event("assign worker").as("A")
                        .has_field("review result").zh_CN("审核意见")
                            .values_canbe("pass", "修理完成").or("fail", "待完善").or("cannot_repair", "无法维修")

                .change_request("repairing feedback").zh_CN("维修反馈")
                    .step("A").zh_CN("修理结果反馈")
                    .contains_event("repair feedback").as("A")
                        .has_field("task title").zh_CN("工单")
                            .fill_by_request("work job id", MODEL.maintenanceTask().title())
                            .display()
                        .has_field("task id").zh_CN("工单")
                            .fill_by_request("work job id")
                            .disabled()
                        .has_field("repair result").zh_CN("修理结果")
                            .values_canbe("pass", "已修好").or("fail", "未修好")
                            .defaule_value("pass")
                        .has_field("assign to").zh_CN("负责人")
                            .which_model_of(MODEL.employee()).optional()
                            .values_can_select_from_query_by("${task id}")
                        .has_field("comments").zh_CN("备注")
                            .which_type_of(FieldType.MULTI_TEXT).optional()
                            .place_holder("请填写备注")








                .change_request("add plan job").zh_CN("新建计划任务")
                    .step("A").zh_CN("接单")
                    .contains_event("bind info")

                .change_request("start plan job").zh_CN("执行任务")
                    .contains_event("bind info")

                .change_request("cancel plan job").zh_CN("取消任务")
                    .contains_event("bind info")

                .change_request("update plan job").zh_CN("更新任务")
                .contains_event("bind info")

                .change_request("report damage").zh_CN("报告损毁")
                    .contains_event("bind info")



                ;
    }

}
