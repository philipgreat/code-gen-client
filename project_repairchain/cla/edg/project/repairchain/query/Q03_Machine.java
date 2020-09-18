package cla.edg.project.repairchain.query;

import cla.edg.modelbean.LogicalOperator;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.repairchain.gen.dbquery.MODEL;
import cla.edg.project.repairchain.gen.dbquery.OnJobStatus;
import cla.edg.project.repairchain.gen.dbquery.QrCodeStatus;

import java.io.File;

public class Q03_Machine extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
            return script
                    .query(MODEL.machine()).which("bound in factory").pagination().with_string("factory id")
                        .comments("查询某个工厂下的所有已绑定二维码设备.")
                        .do_it_as()
                        .where(MODEL.machine().factory().eq("${factory id}"),
                                EXISTS(MODEL.machine().qrCodeList().not_null()
                                        .and(MODEL.machine().qrCodeList().status().eq(QrCodeStatus.ACTIVE)))
                        )
                        .order_by(MODEL.machine().id()).desc()

                    .query(MODEL.machine()).which("not bound in factory").pagination().with_string("factory id")
                        .comments("查询某个工厂下的所有未绑定二维码设备.")
                        .do_it_as()
                        .where(MODEL.machine().factory().eq("${factory id}"),
                                NOT_EXISTS(MODEL.machine().qrCodeList().not_null()
                                        .and(MODEL.machine().qrCodeList().status().eq(QrCodeStatus.ACTIVE)))
                        )
                        .order_by(MODEL.machine().id()).desc()

                ;
    }


}
