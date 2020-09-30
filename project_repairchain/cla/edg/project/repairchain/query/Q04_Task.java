package cla.edg.project.repairchain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.repairchain.gen.dbquery.*;

public class Q04_Task extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
            return script
                .query(MODEL.todoTask()).list_of("my opening").pagination().with_string("user id")
                    .comments("查询我当前的待办事项列表")
                    .do_it_as()
                    .where(MODEL.todoTask().responsibleEmployee().personalUser().eq("${user id}"),
                            MODEL.employee().status().code().eq(OnJobStatus.ACTIVE),
                            MODEL.todoTask().finished().eq(false))

                .query(MODEL.todoTask()).list_of("opening in maintenance task").with_string("task id")
                    .comments("查询维护任务的所有 TODO")
                    .do_it_as()
                    .where(MODEL.todoTask().taskObjectType().eq(MODEL.maintenanceTask().getInternalType()),
                            MODEL.todoTask().taskObjectId().eq("${task id}"),
                            MODEL.todoTask().finished().eq(false))

                .query(MODEL.todoTask()).list_of("opening in task for employee").with_string("task id").with_string("employee").with_string("type")
                    .comments("查询对应维护任务的,指定Employee的 TODO")
                    .do_it_as()
                    .where(MODEL.todoTask().taskObjectType().eq(MODEL.maintenanceTask().getInternalType()),
                            MODEL.todoTask().taskObjectId().eq("${task id}"),
                            MODEL.todoTask().finished().eq(false),
                            MODEL.todoTask().responsibleEmployee().eq("${employee}"),
                            MODEL.todoTask().type().eq("${type}").optional())

                .query(MODEL.todoTask()).list_of("opening in maintenance task with type").with_string("task id").with_string("type")
                    .comments("查询维护任务的所有 TODO")
                    .do_it_as()
                    .where(MODEL.todoTask().taskObjectType().eq(MODEL.maintenanceTask().getInternalType()),
                            MODEL.todoTask().taskObjectId().eq("${task id}"),
                            MODEL.todoTask().type().eq("${type}"),
                            MODEL.todoTask().finished().eq(false))

                .query(MODEL.maintenanceTaskAssignment()).list_of("opening in task").with_string("task id")
                    .comments("找出指定任务中, 未结束的 任务分配")
                    .do_it_as()
                    .where(MODEL.maintenanceTaskAssignment().maintenanceTask().eq("${task id}"),
                            MODEL.maintenanceTaskAssignment().finished().eq(false),
                            MODEL.maintenanceTaskAssignment().valid().eq(true))
                    .wants(MODEL.maintenanceTaskAssignment().employee().personalUser())

                .query(MODEL.maintenanceTaskAssignment()).list_of("task").with_string("task id")
                    .comments("找出指定任务中, 所有有效的 任务分配")
                    .do_it_as()
                    .where(MODEL.maintenanceTaskAssignment().maintenanceTask().eq("${task id}"),
                            MODEL.maintenanceTaskAssignment().valid().eq(true))
                    .wants(MODEL.maintenanceTaskAssignment().employee().personalUser())

                .query(MODEL.employee()).list_of("assigned in task").with_string("task id")
                    .comments("找出指定任务中, 曾经指定过任务, 并且最终有效的用户")
                    .do_it_as()
                    .where( MODEL.employee().maintenanceTaskAssignmentList().maintenanceTask().eq("${task id}"),
                            MODEL.employee().maintenanceTaskAssignmentList().valid().eq(true),
                            MODEL.employee().status().code().eq(OnJobStatus.ACTIVE))
                    .wants(MODEL.employee().maintenanceTaskAssignmentList(),
                            MODEL.employee().personalUser(),
                            MODEL.employee().workPosition())

                .find(MODEL.regularMaintainPlan()).which("for machine").with_string("machine id")
                    .comments("统计一台设备有多少个计划任务")
                    .do_it_as().count()
                    .run_by(this::whereActiveForMachine)


                .query(MODEL.regularMaintainPlan()).which("for machine").pagination().with_string("machine id")
                    .comments("查询一个设备的定期计划任务")
                    .do_it_as()
                    .run_by(this::whereActiveForMachine)

                .query(MODEL.maintenanceTask()).list_of("machine").pagination().with_string("machine id")
                    .comments("查询机器设备相关的所有工单")
                    .do_it_as()
                    .where(MODEL.maintenanceTask().machine().eq("${machine id}"))
                    .run_by(this::wantedForMaintenanceTaskList)

                .find(MODEL.maintenanceTask()).which("opening for machine").with_string("user id").with_string("machine id")
                    .comments("统计当前设备相关的未关闭任务")
                    .do_it_as().count()
                    .where(MODEL.maintenanceTask().maintenanceTaskAssignmentList().employee().personalUser().eq("${user id}"),
                            MODEL.maintenanceTask().maintenanceTaskAssignmentList().finished().eq(false),
                            MODEL.maintenanceTask().machine().eq("${machine id}"))


                .query(MODEL.employee()).which("can response for machine task").with_string("machine id").with_string("work position")
                    .comments("查询能够为某个设备的任务负责的人, 依据是它的职位")
                    .do_it_as()
                    .where(MODEL.employee().workPosition().code().eq("${work position}"),
                            MODEL.employee().factory().machineList().id().eq("${machine id}"),
                            MODEL.employee().status().code().eq(OnJobStatus.ACTIVE))
                    .order_by(MODEL.employee().personalUser().name()).asc_by_pinyin()
                    .wants(MODEL.employee().personalUser(), MODEL.employee().workPosition())


                .query(MODEL.maintenanceTask()).list_of("need action by user").pagination().with_string("user id").with_string("factory id").with_string("machine id")
                    .comments("查询当前用户需要处理的工单, 以工厂或者机器设备为过滤条件")
                    .do_it_as()
                    .where(MODEL.maintenanceTask().maintenanceTaskAssignmentList().employee().personalUser().eq("${user id}"),
                            MODEL.maintenanceTask().maintenanceTaskAssignmentList().finished().eq(false),
                            MODEL.maintenanceTask().machine().eq("${machine id}").optional(),
                            MODEL.maintenanceTask().factory().eq("${factory id}").optional())
                    .run_by(this::wantedForMaintenanceTaskList)

                .query(MODEL.maintenanceTask()).list_of("in process by user").pagination().with_string("user id").with_string("factory id").with_string("machine id")
                    .comments("查询用户参与的,但是不需要立即处理的工单, 以工厂或者机器设备为过滤条件")
                    .do_it_as()
                    .where(MODEL.maintenanceTask().maintenanceTaskAssignmentList().employee().personalUser().eq("${user id}"),
                            MODEL.maintenanceTask().status().not_in(MaintenanceTaskStatus.FINISHED_AS_REPAIRED, MaintenanceTaskStatus.FINISHED_AS_DAMAGED, MaintenanceTaskStatus.PROCESS_MANUALLY),
                            NOT_EXISTS(MODEL.maintenanceTask().maintenanceTaskAssignmentList().finished().eq(false)
                                    .and(MODEL.maintenanceTask().maintenanceTaskAssignmentList().valid().eq(true))
                            ),
                            MODEL.maintenanceTask().machine().eq("${machine id}").optional(),
                            MODEL.maintenanceTask().factory().eq("${factory id}").optional())
                    .run_by(this::wantedForMaintenanceTaskList)

                .query(MODEL.maintenanceTask()).list_of("in process for machine").pagination().with_string("user id").with_string("machine id")
                    .comments("查询用户参与的,但是不需要立即处理的工单, 以工厂或者机器设备为过滤条件")
                    .do_it_as()
                    .where(
                            MODEL.maintenanceTask().status().not_in(MaintenanceTaskStatus.FINISHED_AS_REPAIRED, MaintenanceTaskStatus.FINISHED_AS_DAMAGED, MaintenanceTaskStatus.PROCESS_MANUALLY),
                            NOT_EXISTS(MODEL.maintenanceTask().maintenanceTaskAssignmentList().finished().eq(false)
                                    .and(MODEL.maintenanceTask().maintenanceTaskAssignmentList().valid().eq(true),
                                        MODEL.maintenanceTask().maintenanceTaskAssignmentList().employee().personalUser().eq("${user id}"))
                            ),
                            MODEL.maintenanceTask().machine().eq("${machine id}").optional())
                    .run_by(this::wantedForMaintenanceTaskList)

                .query(MODEL.maintenanceTask()).list_of("user which closed").pagination().with_string("user id").with_string("factory id").with_string("machine id")
                    .comments("查询用户参与的,正常关闭的工单, 以工厂或者机器设备为过滤条件")
                    .do_it_as()
                    .where(MODEL.maintenanceTask().maintenanceTaskAssignmentList().employee().personalUser().eq("${user id}"),
                            MODEL.maintenanceTask().status().eq(MaintenanceTaskStatus.FINISHED_AS_REPAIRED),
                            MODEL.maintenanceTask().machine().eq("${machine id}").optional(),
                            MODEL.maintenanceTask().factory().eq("${factory id}").optional())
                    .run_by(this::wantedForMaintenanceTaskList)

                .query(MODEL.maintenanceTask()).list_of("user which abnormal").pagination().with_string("user id").with_string("factory id").with_string("machine id")
                    .comments("查询用户参与的,正常关闭的工单, 以工厂或者机器设备为过滤条件")
                    .do_it_as()
                    .where(MODEL.maintenanceTask().maintenanceTaskAssignmentList().employee().personalUser().eq("${user id}"),
                            MODEL.maintenanceTask().status().in(MaintenanceTaskStatus.FINISHED_AS_DAMAGED, MaintenanceTaskStatus.PROCESS_MANUALLY),
                            MODEL.maintenanceTask().machine().eq("${machine id}").optional(),
                            MODEL.maintenanceTask().factory().eq("${factory id}").optional())
                    .run_by(this::wantedForMaintenanceTaskList)



                .query(MODEL.maintenanceTaskTreatment()).list_of("maintenance task").with_string("task id")
                    .comments("加载维修任务的相关 处置记录")
                    .do_it_as()
                    .where(MODEL.maintenanceTaskTreatment().task().eq("${task id}"))
                    .wants(MODEL.maintenanceTaskTreatment().executor().personalUser())


                .find(MODEL.maintenanceTaskAssignment()).which("opening in task").with_string("task id").with_string("type").with_string("user id")
                    .comments("找到一个 工单 的, 类型和用户 匹配的 assignment")
                    .do_it_as()
                    .where(MODEL.maintenanceTaskAssignment().maintenanceTask().eq("${task id}"),
                            MODEL.maintenanceTaskAssignment().createOnStatus().eq("${type}").optional(),
                            MODEL.maintenanceTaskAssignment().finished().eq(false),
                            MODEL.maintenanceTaskAssignment().employee().personalUser().eq("${user id}"))

                .query(MODEL.maintenanceTaskAssignment()).which("opening in task by type").with_string("task id").with_string("type")
                    .comments("找到某个 工单 的, 类型和用户 匹配的 assignment")
                    .do_it_as()
                    .where(MODEL.maintenanceTaskAssignment().maintenanceTask().eq("${task id}"),
                            MODEL.maintenanceTaskAssignment().finished().eq(false),
                            MODEL.maintenanceTaskAssignment().createOnStatus().eq("${type}").optional())

                .query(MODEL.maintenanceTaskAssignment()).which("opening in task by employee").with_string("task id").with_string("employee").with_string("type")
                    .comments("找到某个 工单 的, 类型和用户 匹配的 assignment")
                    .do_it_as()
                    .where(MODEL.maintenanceTaskAssignment().maintenanceTask().eq("${task id}"),
                            MODEL.maintenanceTaskAssignment().finished().eq(false),
                            MODEL.maintenanceTaskAssignment().employee().eq("${employee}"),
                            MODEL.maintenanceTaskAssignment().createOnStatus().eq("${type}").optional())

                .query(MODEL.workPosition()).list_of("user have on machine").with_string("user id").with_string("machine id")
                    .comments("查询用户对于指定设备, 有哪些work position")
                    .do_it_as()
                    .where(MODEL.workPosition().employeeList().personalUser().eq("${user id}"),
                            MODEL.workPosition().employeeList().maintenanceTaskAssignmentList().maintenanceTask().machine().eq("${machine id}"))
                ;
    }



    private PageFlowScript wantedForMaintenanceTaskList(PageFlowScript script) {
        return script.wants(MODEL.maintenanceTask().status(),
                MODEL.maintenanceTask().regularMaintainPlan(),
                MODEL.maintenanceTask().repairApplication().submitter().personalUser(),
                MODEL.maintenanceTask().machine().factory(),
                MODEL.maintenanceTask().type()
                );
    }

    private PageFlowScript whereOpeningForMachine(PageFlowScript script) {
        return script.where(MODEL.maintenanceTask().machine().eq("${machine id}"),
                MODEL.maintenanceTask().status().code().not_in(MaintenanceTaskStatus.FINISHED_AS_DAMAGED, MaintenanceTaskStatus.FINISHED_AS_REPAIRED))
                .wants(MODEL.maintenanceTask().type(),
                        MODEL.maintenanceTask().status(),
                        MODEL.maintenanceTask().repairApplication().submitter().personalUser(),
                        MODEL.maintenanceTask().repairApplication().submitter().workPosition(),
                        MODEL.maintenanceTask().regularMaintainPlan()
                );
    }

    private PageFlowScript whereActiveForMachine(PageFlowScript script) {
        return script.where(MODEL.regularMaintainPlan().machine().eq("${machine id}"),
                MODEL.regularMaintainPlan().activeStatus().code().eq(ActiveStatus.ACTIVE));
    }


}
