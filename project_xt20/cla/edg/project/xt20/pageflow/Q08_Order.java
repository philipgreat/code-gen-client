package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.MODEL;
import cla.edg.project.xt20.gen.dbquery.OrderStatus;
import cla.edg.project.xt20.gen.dbquery.ShippingStatus;

public class Q08_Order extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
            .query(MODEL.mainOrder()).list_of("seller finished").pagination().with_string("merchant id")
                .comments("查询卖家的已经完成的订单")
                .do_it_as()
                .where(MODEL.mainOrder().status().in(OrderStatus.CANCELLED, OrderStatus.COMPLETED),
                        MODEL.mainOrder().seller().eq("${merchant id}"))
                // 默认排序: .order_by....
                .run_by(this::wantsWhenLoadOrderList)

            .query(MODEL.mainOrder()).list_of("buyer finished").pagination().with_string("merchant id")
                .comments("查询买家的已经完成的订单")
                .do_it_as()
                .where(MODEL.mainOrder().status().in(OrderStatus.CANCELLED, OrderStatus.COMPLETED),
                        MODEL.mainOrder().buyer().eq("${merchant id}"))
                // 默认排序: .order_by....
                .run_by(this::wantsWhenLoadOrderList)

        ;
    }

    private PageFlowScript wantsWhenLoadOrderList(PageFlowScript script) {
        return script.wants(MODEL.mainOrder().status(),
                MODEL.mainOrder().buyer().organizationIdentityList(),
                MODEL.mainOrder().creator().personInformation(),
                MODEL.mainOrder().shippingType()
                );
    }
}
