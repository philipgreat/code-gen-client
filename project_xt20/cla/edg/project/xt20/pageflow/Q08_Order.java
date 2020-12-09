package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.MODEL;
import cla.edg.project.xt20.gen.dbquery.OrderStatus;

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


            .query(MODEL.mainOrder()).list_of("waiting add to delivery task").pagination().with_string("seller id").with_string("search key")
                .comments("按照卖家ID查询其待加入配送任务的订单, search key 的目标是收货人信息")
                .do_it_as()
                .where(MODEL.mainOrder().seller().eq("${seller id}"),
                        MODEL.mainOrder().buyerContactName().like("${search key}").optional()
                        .or(MODEL.mainOrder().buyerContactPhone().like("${search key}").optional()),
                        MODEL.mainOrder().gasShippingGroupList().deliverTask().is_null()
                ).order_by(MODEL.mainOrder().id()).asc()
                .run_by(this::wantsWhenLoadOrderForDeliver)

            .find(MODEL.mainOrder()).which("for arrange deliver").with_string("order id")
                .comments("根据ID查询订单,收集其相关信息用于调度安排")
                .do_it_as()
                .where(MODEL.mainOrder().id().eq("${order id}"))
                .run_by(this::wantsWhenLoadOrderForDeliver)

            .query(MODEL.mainOrder()).list_of("added in deliver task").with_string("task id")
                .comments("查询出所有已经加入指定配送任务的所有订单")
                .do_it_as()
                .where(MODEL.mainOrder().gasShippingGroupList().deliverTask().id().eq("${task id}"))
                .run_by(this::wantsWhenLoadOrderForDeliver)
        ;
    }

    private PageFlowScript wantsWhenLoadOrderForDeliver(PageFlowScript script) {
        return script.wants(MODEL.mainOrder().status(),
                MODEL.mainOrder().buyer().organizationIdentityList(),
                MODEL.mainOrder().creator().personInformation(),
                MODEL.mainOrder().shippingType(),
                MODEL.mainOrder().gasShippingGroupList(),
                MODEL.mainOrder().gasShippingGroupList().gasLineItem(),
                MODEL.mainOrder().gasShippingGroupList().gasLineItem().cylinder(),
                MODEL.mainOrder().gasShippingGroupList().gasLineItem().cylinder().gasContainer()
                );
    }

    private PageFlowScript wantsWhenLoadOrderList(PageFlowScript script) {
        return script.wants(MODEL.mainOrder().status(),
                MODEL.mainOrder().buyer().organizationIdentityList(),
                MODEL.mainOrder().creator().personInformation(),
                MODEL.mainOrder().shippingType()
        );
    }
}
