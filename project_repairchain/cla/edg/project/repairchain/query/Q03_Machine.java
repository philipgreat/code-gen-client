package cla.edg.project.repairchain.query;

import cla.edg.modelbean.LogicalOperator;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.repairchain.gen.dbquery.MODEL;
import cla.edg.project.repairchain.gen.dbquery.OnJobStatus;
import cla.edg.project.repairchain.gen.dbquery.QrCodeStatus;

import java.io.File;
import java.util.function.Function;

public class Q03_Machine extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {

        return script
                    .query(MODEL.machine()).which("bound in factory").pagination().with_string("factory id")
                        .comments("查询某个工厂下的所有已绑定二维码设备.")
                        .do_it_as()
                        .where(MODEL.machine().factory().eq("${factory id}"),
                                MODEL.machine().qrCodeList().status().eq(QrCodeStatus.BOUND))
                        .run_by(this::wantsForMachineList)
                        .order_by(MODEL.machine().id()).desc()

                    .query(MODEL.machine()).which("not bound in factory").pagination().with_string("factory id")
                        .comments("查询某个工厂下的所有未绑定二维码设备.")
                        .do_it_as()
                        .where(MODEL.machine().factory().eq("${factory id}"),
                                NOT_EXISTS(MODEL.machine().qrCodeList().status().eq(QrCodeStatus.BOUND)
                                        .and(MODEL.machine().factory().eq("${factory id}"))
                                ).or(MODEL.machine().qrCodeList().id().is_null())
                        )
                        .run_by(this::wantsForMachineList)
                        .order_by(MODEL.machine().id()).desc()


                    .query(MODEL.machine()).which("has start stop record for user").pagination().with_string("user id").with_string("factory id")
                        .comments("查询用户可查看的启停记录对应的机器")
                        .do_it_as()
                        .where(MODEL.machine().factory().employeeList().personalUser().eq("${user id}"),
                                MODEL.machine().factory().eq("${factory id}").optional(),
                                MODEL.machine().machineRunningRecordList().id().not_null())
                        .run_by(this::wantsForMachineList)

                    .find(MODEL.machine()).which("bind with qrcode").with_string("qrcode id")
                        .comments("根据qrcode ID查找绑定的设备")
                        .do_it_as()
                        .where(MODEL.machine().qrCodeList().eq("${qrcode id}"))
                        .run_by(this::wantsForMachineList)

                    .find(MODEL.machine()).which("can operate by user").with_string("user id").with_string("machine id")
                        .comments("根据用户ID和machine, 查找他是否可以操作这个机器")
                        .do_it_as()
                        .where(MODEL.machine().factory().employeeList().personalUser().eq("${user id}"),
                                MODEL.machine().id().eq("${machine id}"))
                ;
    }

    protected  PageFlowScript wantsForMachineList(PageFlowScript script){
        return script.wants(MODEL.machine().factory(),
                MODEL.machine().machineStatus())

                ;
    }

}
