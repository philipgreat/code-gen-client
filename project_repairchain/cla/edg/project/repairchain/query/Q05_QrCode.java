package cla.edg.project.repairchain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.repairchain.gen.dbquery.MODEL;
import cla.edg.project.repairchain.gen.dbquery.QrCodeStatus;

public class Q05_QrCode extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
            return script
                .find(MODEL.qrCode()).which("currently bind to machine").with_string("machine id")
                    .comments("查找设备当前绑定的二维码")
                    .do_it_as()
                    .where(MODEL.qrCode().machine().eq("${machine id}"),
                            MODEL.qrCode().status().code().eq(QrCodeStatus.BOUND))


                .find(MODEL.qrCode()).which("belong to agent").with_string("agent id")
                    .comments("统计代理商手中的二维码")
                    .do_it_as().count_by(MODEL.qrCode().status())
                    .where(MODEL.qrCode().agent().eq("${agent id}"))


                .query(MODEL.qrCode()).which("belong to agent").pagination().with_string("agent id").with_string("search key")
                    .comments("查询代理商手中的二维码")
                    .do_it_as()
                    .where(MODEL.qrCode().agent().eq("${agent id}"),
                            MODEL.qrCode().value().like("${search key}")
                            .or(MODEL.qrCode().machine().name().like("${search key}"),
                                    MODEL.qrCode().machine().modelName().like("${search key}"),
                                    MODEL.qrCode().machine().factory().name().like("${search key}")
                            )
                    )
                    .wants(MODEL.qrCode().agent(), MODEL.qrCode().machine().factory(), MODEL.qrCode().status())


                ;
    }


}
