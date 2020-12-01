package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.MODEL;

public class Q06_Buyer extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script

            .query(MODEL.merchant()).list_of("buyer of merchant for bottle").pagination().with_string("merchant id").with_string("search key")
                .comments("查询一个卖家对应的所有买家,连同其持瓶情况")
                .do_it_as()
                .where(MODEL.merchant().supplyRelationshipListAsCustomer().supplier().eq("${merchant id}"),
                        MODEL.merchant().organizationIdentityList().name().like("${search key}").optional())
                .wants(MODEL.merchant().customerCylinderListAsCustomer().cylinder(), MODEL.merchant().organizationIdentityList())

            .query(MODEL.merchant()).list_of("buyer of merchant for management").pagination().with_string("merchant id").with_string("search key")
                .comments("查询一个卖家对应的所有买家,便于管理")
                .do_it_as()
                .where(MODEL.merchant().supplyRelationshipListAsCustomer().supplier().eq("${merchant id}"),
                        MODEL.merchant().organizationIdentityList().name().like("${search key}").optional())
                .wants(MODEL.merchant().customerCylinderListAsCustomer().cylinder(), MODEL.merchant().organizationIdentityList())


        ;
    }
}
