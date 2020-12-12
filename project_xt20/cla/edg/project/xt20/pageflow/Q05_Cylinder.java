package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.ActionType;
import cla.edg.project.xt20.gen.dbquery.CylinderArea;
import cla.edg.project.xt20.gen.dbquery.MODEL;

public class Q05_Cylinder extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
            .query(MODEL.merchantCylinder()).list_of("merchant").with_string("merchant id")
                .comments("查询卖家手中的气瓶持有情况")
                .do_it_as()
                .where(MODEL.merchantCylinder().merchant().eq("${merchant id}"), MODEL.merchantCylinder().cylinderArea().id().not_null())
                .wants(MODEL.merchantCylinder().cylinder().gasContainer(),
                        MODEL.gasCylinder().fillMedium(), MODEL.gasCylinder().nominalPressure(),
                        MODEL.merchantCylinder().cylinderArea())

            .query(MODEL.merchantCylinderRecord()).list_of("full bic history").pagination().with_string("merchant id")
                .comments("查询商户的指定类型的 实瓶 盘库记录")
                .do_it_as()
                .where(MODEL.merchantCylinderRecord().merchant().eq("${merchant id}"),
                        MODEL.merchantCylinderRecord().action().eq(ActionType.CYLINDER_SET),
                        MODEL.merchantCylinderRecord().cylinderArea().eq(CylinderArea.PRODUCT))
                .wants(MODEL.merchantCylinderRecord().action(), MODEL.merchantCylinderRecord().actor().personInformation())
            .query(MODEL.merchantCylinderRecord()).list_of("empty bic history").pagination().with_string("merchant id")
                .comments("查询商户的指定类型的 空瓶 盘库记录")
                .do_it_as()
                .where(MODEL.merchantCylinderRecord().merchant().eq("${merchant id}"),
                        MODEL.merchantCylinderRecord().action().eq(ActionType.CYLINDER_SET),
                        MODEL.merchantCylinderRecord().cylinderArea().eq(CylinderArea.EMPTY))
                .wants(MODEL.merchantCylinderRecord().action(), MODEL.merchantCylinderRecord().actor().personInformation())


            .query(MODEL.merchantCylinder()).list_of("empty for merchant").with_string("merchant id")
                .comments("查询某个商家的所有空瓶记录,(方便开始盘点)")
                .do_it_as()
                .where(MODEL.merchantCylinder().merchant().eq("${merchant id}"),
                        MODEL.merchantCylinder().cylinderArea().eq(CylinderArea.EMPTY))
            .query(MODEL.merchantCylinder()).list_of("full for merchant").with_string("merchant id")
                .comments("查询某个商家的所有实瓶记录,(方便开始盘点)")
                .do_it_as()
                .where(MODEL.merchantCylinder().merchant().eq("${merchant id}"),
                        MODEL.merchantCylinder().cylinderArea().eq(CylinderArea.PRODUCT))


            .query(MODEL.customerCylinder()).list_of("need buyer confirm for seller").with_string("buyer id").with_string("seller id")
                .comments("查询买家持有的某个卖家的待确认盘瓶记录")
                .do_it_as()
                .where(MODEL.customerCylinder().customer().eq("${buyer id}"),
                        MODEL.customerCylinder().seller().eq("${seller id}"))
                .wants(MODEL.customerCylinder().seller().supplyRelationshipListAsSupplier(),
                        MODEL.customerCylinder().cylinder())

            .query(MODEL.customerCylinderRecord()).list_of("history").pagination().with_string("merchant id")
                .comments("查询商户的 客户持瓶盘库 的历史记录")
                .do_it_as()
                .where(MODEL.customerCylinderRecord().action().eq(ActionType.CUSTOMER_CONFIRM_CYLINDER_SET),
                        MODEL.customerCylinderRecord().seller().eq("${merchant id}"))
                .wants(MODEL.customerCylinderRecord().action(),
                        MODEL.customerCylinderRecord().actor(),
                        MODEL.customerCylinderRecord().customer().organizationIdentityList())


            .query(MODEL.customerCylinder()).list_of("seller").with_string("buyer id").with_string("seller id")
                .comments("查询买家持有的卖家的气瓶")
                .do_it_as()
                .where(MODEL.customerCylinder().customer().eq("${buyer id}"),
                        MODEL.customerCylinder().seller().eq("${seller id}"))



        ;
    }
}
