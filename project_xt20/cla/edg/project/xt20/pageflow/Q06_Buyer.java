package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.MODEL;

public class Q06_Buyer extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script

            .query(MODEL.merchant()).list_of("buyer of merchant for bottle").pagination().with_string("merchant id")
                .comments("查询一个卖家对应的所有买家")
                .do_it_as()
                .where(MODEL.merchant().supplyRelationshipListAsCustomer().supplier().eq("${merchant id}"))
                .wants(MODEL.merchant().customerCylinderListAsCustomer().cylinder(), MODEL.merchant().organizationIdentityList())


       ;
    }
}
