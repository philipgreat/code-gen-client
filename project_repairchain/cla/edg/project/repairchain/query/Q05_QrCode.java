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
                            MODEL.qrCode().status().code().eq(QrCodeStatus.ACTIVE))

                ;
    }


}
