package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.CheckStatus;
import cla.edg.project.xt20.gen.dbquery.MODEL;

public class Q06_1_Seller extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script

            .query(MODEL.merchant()).list_of("supplier").pagination().with_string("merchant id").with_string("search key")
                .comments("查询一个买家对应的所有供应商")
                .do_it_as()
                .where(MODEL.merchant().supplyRelationshipListAsSupplier().customer().eq("${merchant id}"),
                        MODEL.merchant().organizationIdentityList().name().like("${search key}").optional())
                .order_by(MODEL.merchant().name()).asc_by_pinyin()
                .wants(MODEL.merchant().organizationIdentityList())

            .query(MODEL.merchant()).list_of("bottle hold by buyer").pagination().with_string("buyer id").with_string("seller id")
                .comments("查询被买家持瓶的卖家")
                .do_it_as()
                .where(MODEL.merchant().customerCylinderListAsSeller().customer().eq("${buyer id}"),
                        MODEL.merchant().id().eq("${seller id}").optional())
                .wants(MODEL.merchant().organizationIdentityList(),
                        MODEL.merchant().customerCylinderListAsSeller().cylinder())


            .query(MODEL.merchant()).list_of("need buyer confirm BIC").pagination().with_string("buyer id").with_string("seller id")
                .comments("根据买家ID, 查询有哪些卖家有'待确认客户持瓶'的事情要处理")
                .do_it_as()
                .where(MODEL.merchant().id().eq("${seller id}").optional(),
                        MODEL.merchant().customerCylinderListAsSeller().customer().eq("${buyer id}"),
                        MODEL.merchant().customerCylinderListAsSeller().status().in(CheckStatus.WAITING_BUYER_CONFIRM))
                .wants(MODEL.merchant().customerCylinderListAsSeller().cylinder(),
                        MODEL.merchant().organizationIdentityList())


        ;
    }
}
