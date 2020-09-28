package cla.edg.project.repairchain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.repairchain.gen.dbquery.MODEL;
import cla.edg.project.repairchain.gen.dbquery.MaintenanceTaskStatus;
import cla.edg.project.repairchain.gen.dbquery.OnJobStatus;
import cla.edg.project.repairchain.gen.dbquery.WorkPosition;

public class Q06_Employee extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
            return script
                    .find(MODEL.employee()).which("is admin of machine").with_string("machine id")
                        .comments("找到指定机器所在工厂的一个Admin")
                        .do_it_as()
                        .where(MODEL.employee().workPosition().eq(WorkPosition.ADMIN),
                                MODEL.employee().factory().machineList().id().eq("${machine id}"),
                                MODEL.employee().status().eq(OnJobStatus.ACTIVE))

                    .find(MODEL.employee()).which("is maintenance manger of machine").with_string("machine id")
                        .comments("找到指定机器所在工厂的一个 maintenance manager")
                        .do_it_as()
                        .where(MODEL.employee().workPosition().eq(WorkPosition.MAINTENANCE_MANAGER),
                                MODEL.employee().factory().machineList().id().eq("${machine id}"),
                                MODEL.employee().status().eq(OnJobStatus.ACTIVE))

                    .find(MODEL.employee()).which("selected when report done").with_string("task id")
                        .comments("找到指定task中, report-done 时指定的manager")
                        .do_it_as()
                        .where(MODEL.employee().maintenanceTaskAssignmentList().maintenanceTask().eq("${task id}"),
                                MODEL.employee().maintenanceTaskAssignmentList().createOnStatus().eq(MaintenanceTaskStatus.PROCESSING),
                                MODEL.employee().status().eq(OnJobStatus.ACTIVE))

                    .find(MODEL.employee()).which("selected when submit task").with_string("task id")
                        .comments("找到指定task中, submit 时指定的manager")
                        .do_it_as()
                        .where(MODEL.employee().maintenanceTaskAssignmentList().maintenanceTask().eq("${task id}"),
                                MODEL.employee().maintenanceTaskAssignmentList().createOnStatus().eq(MaintenanceTaskStatus.SUBMITTED),
                                MODEL.employee().status().eq(OnJobStatus.ACTIVE))

                ;
    }
}
