package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.MODEL;

public class Q06_1_Seller extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script

            .query(MODEL.merchant()).list_of("supplier").pagination().with_string("merchant id").with_string("search key")
                .comments("查询一个买家对应的所有供应商")
                .do_it_as()
                .where(MODEL.merchant().supplyRelationshipListAsCustomer().customer().eq("${merchant id}"),
                        MODEL.merchant().organizationIdentityList().name().like("${search key}").optional())
                .order_by(MODEL.merchant().name()).asc_by_pinyin()
                .wants(MODEL.merchant().organizationIdentityList())



        ;
    }
}
