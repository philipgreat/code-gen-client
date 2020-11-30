package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.MODEL;

public class Q02_GasProduct extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
            .query(MODEL.gasProduct()).list_of("merchant").pagination().with_string("merchant id").with_string("search key")
                .comments("查询卖家的所有现有产品")
                .do_it_as()
                .where(MODEL.gasProduct().merchant().eq("${merchant id}"),
                        MODEL.gasProduct().gasProductCacheList().searchText().like("${search key}").optional())

            .query(MODEL.gasProduct()).list_of("merchant by trade time").with_string("merchant id")
                .comments("按照交易的时间降序,列出买家的产品列表")
                .do_it_as()
                .where(MODEL.gasProduct().gasLineItemList().mainOrder().seller().eq("${merchant id}"))
                .order_by(MODEL.gasProduct().gasLineItemList().mainOrder().id()).desc()
                .order_by(MODEL.gasProduct().id()).desc()


       ;
    }
}
