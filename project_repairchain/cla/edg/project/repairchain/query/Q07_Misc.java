package cla.edg.project.repairchain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.repairchain.gen.dbquery.MODEL;
import cla.edg.project.repairchain.gen.dbquery.MaintenanceTaskStatus;
import cla.edg.project.repairchain.gen.dbquery.OnJobStatus;
import cla.edg.project.repairchain.gen.dbquery.WorkPosition;

public class Q07_Misc extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
            return script
                    .query(MODEL.systemAnnouncement()).list_of("activating").with_date("now")
                        .comments("查询现在有效的公告")
                        .do_it_as()
                        .where(MODEL.systemAnnouncement().startTime().before("${now}"), MODEL.systemAnnouncement().endTime().after("${now}"))


                    .query(MODEL.machineStartStopRecord()).list_of("machine").pagination().with_string("machine id")
                        .comments("查找机器的启停记录")
                        .do_it_as()
                        .where(MODEL.machineStartStopRecord().machine().eq("${machine id}"))
                        .wants(MODEL.machineStartStopRecord().reporter().personalUser())

                    .query(MODEL.workPosition()).list_of("user in factory").with_string("user id").with_string("factory id")
                        .comments("查找用户在某个工厂中的所有角色")
                        .do_it_as()
                        .where(MODEL.workPosition().employeeList().personalUser().eq("${user id}"),
                                MODEL.workPosition().employeeList().factory().eq("${factory id}"),
                                MODEL.workPosition().employeeList().status().eq(OnJobStatus.ACTIVE))

                ;
    }
}
