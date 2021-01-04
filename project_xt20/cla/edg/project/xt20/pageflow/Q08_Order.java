package cla.edg.project.xt20.pageflow;

import cla.edg.modelbean.EnumAttribute;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.MODEL;
import cla.edg.project.xt20.gen.dbquery.OrderStatus;

public class Q08_Order extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
            .query(MODEL.mainOrder()).list_of("seller need process").pagination().with_string("merchant id").with_string("buyer id")
                .comments("查询从卖家视角,需要处理的订单")
                .run_by(spt->queryForSeller(script, OrderStatus.PROCESSING, OrderStatus.BUYER_CONFIRM_TIMEOUT,
                        OrderStatus.WAITING_SELLER_CONFIRM, OrderStatus.WAITING_SELLER_DELIVERY, OrderStatus.SUBMITTED))
            .query(MODEL.mainOrder()).list_of("seller wait process").pagination().with_string("merchant id").with_string("buyer id")
                .comments("查询从卖家视角,等待买家处理的订单")
                .run_by(spt->queryForSeller(script, OrderStatus.WAITING_BUYER_CONFIRM, OrderStatus.BUYER_CONFIRM_TIMEOUT))
            .query(MODEL.mainOrder()).list_of("seller shipping").pagination().with_string("merchant id").with_string("buyer id")
                .comments("查询从卖家视角,运输中订单")
                .run_by(spt->queryForSeller(script, OrderStatus.WAITING_BUYER_PICK_UP, OrderStatus.SELLER_SHIPPING))
            .query(MODEL.mainOrder()).list_of("seller finished").pagination().with_string("merchant id").with_string("buyer id")
                .comments("查询卖家的已经完成的订单")
                .run_by(spt->queryForSeller(script, OrderStatus.CANCELLED, OrderStatus.COMPLETED))


            .query(MODEL.mainOrder()).list_of("buyer need process").pagination().with_string("merchant id")
                .comments("查询从买家视角来看,需要处理的订单")
                .run_by(spt->queryForBuyer(script, OrderStatus.PROCESSING, OrderStatus.WAITING_BUYER_CONFIRM, OrderStatus.BUYER_CONFIRM_TIMEOUT))
            .query(MODEL.mainOrder()).list_of("buyer wait process").pagination().with_string("merchant id")
                .comments("查询从买家视角来看,等待买家处理(不含运输)的订单")
                .run_by(spt->queryForBuyer(script, OrderStatus.SUBMITTED, OrderStatus.WAITING_SELLER_CONFIRM, OrderStatus.WAITING_SELLER_DELIVERY))
            .query(MODEL.mainOrder()).list_of("buyer shipping").pagination().with_string("merchant id")
                .comments("查询从买家视角来看,运输中的订单")
                .run_by(spt->queryForBuyer(script, OrderStatus.SELLER_SHIPPING, OrderStatus.WAITING_BUYER_PICK_UP))
            .query(MODEL.mainOrder()).list_of("buyer finished").pagination().with_string("merchant id")
                .comments("查询买家的已经完成的订单")
                .run_by(spt->queryForBuyer(script, OrderStatus.CANCELLED, OrderStatus.COMPLETED))



            .query(MODEL.mainOrder()).list_of("waiting add to delivery task").pagination().with_string("seller id").with_string("search key")
                .comments("按照卖家ID查询其待加入配送任务的订单, search key 的目标是收货人信息")
                .do_it_as()
                .where(MODEL.mainOrder().seller().eq("${seller id}"),
                        MODEL.mainOrder().buyerContactName().like("${search key}").optional()
                        .or(MODEL.mainOrder().buyerContactPhone().like("${search key}").optional()),
                        MODEL.mainOrder().status().in(OrderStatus.WAITING_SELLER_DELIVERY, OrderStatus.SELLER_SHIPPING),
                        MODEL.mainOrder().gasShippingGroupList().deliverTask().is_null()
                ).order_by(MODEL.mainOrder().id()).asc()
                .run_by(this::wantsWhenLoadOrderForDeliver)

            .find(MODEL.mainOrder()).which("for arrange deliver").with_string("order id")
                .comments("根据ID查询订单,收集其相关信息用于调度安排")
                .do_it_as()
                .where(MODEL.mainOrder().id().eq("${order id}"))
                .run_by(this::wantsWhenLoadOrderForDeliver)

            .find(MODEL.mainOrder()).which("for detail").with_string("order id")
                .comments("根据ID查询订单,收集其相关信息用于展示详情")
                .do_it_as()
                .where(MODEL.mainOrder().id().eq("${order id}"))
                .run_by(this::wantsWhenLoadOrderForDetail)

            .query(MODEL.mainOrder()).list_of("added in deliver task").with_string("task id")
                .comments("查询出所有已经加入指定配送任务的所有订单")
                .do_it_as()
                .where(MODEL.mainOrder().gasShippingGroupList().deliverTask().id().eq("${task id}"))
                .run_by(this::wantsWhenLoadOrderForDeliver)


            .query(MODEL.orderOperationRecord()).list_of("order").with_string("order id")
                .comments("查询订单的执行记录")
                .do_it_as()
                .where(MODEL.orderOperationRecord().mainOrder().eq("${order id}"))
        ;
    }

    private PageFlowScript queryForSeller(PageFlowScript script, Object ... status) {
        return script.do_it_as()
                .where(MODEL.mainOrder().seller().eq("${merchant id}"),
                        MODEL.mainOrder().buyer().eq("${buyer id}").optional(),
                        MODEL.mainOrder().status().in(status))
                .run_by(this::wantsWhenLoadOrderList);
    }
    private PageFlowScript queryForBuyer(PageFlowScript script, Object ... status) {
        return script.do_it_as()
                .where(MODEL.mainOrder().buyer().eq("${merchant id}"),
                        MODEL.mainOrder().status().in(status))
                .run_by(this::wantsWhenLoadOrderList);
    }


    private PageFlowScript wantsWhenLoadOrderForDetail(PageFlowScript script) {
        return script.wants(MODEL.mainOrder().status(),
                MODEL.mainOrder().shippingType(),
                MODEL.mainOrder().userCommentsList(),
                MODEL.mainOrder().gasLineItemList(),
                MODEL.mainOrder().orderOperationRecordList().action(),
                MODEL.mainOrder().handoverDistrict().city().province(),
                MODEL.mainOrder().gasShippingGroupList().gasLineItem().product(),
                MODEL.mainOrder().gasShippingGroupList().gasLineItem().cylinder().gasContainer(),
                MODEL.mainOrder().gasShippingGroupList().deliveryReceiptList(),
                MODEL.mainOrder().gasShippingGroupList().deliverTask(),
                MODEL.mainOrder().buyer().organizationIdentityList(),
                MODEL.mainOrder().creator().personInformation()
        );
    }
    private PageFlowScript wantsWhenLoadOrderForDeliver(PageFlowScript script) {
        return script.wants(MODEL.mainOrder().status(),
                MODEL.mainOrder().shippingType(),
                MODEL.mainOrder().buyer().organizationIdentityList(),
                MODEL.mainOrder().buyer().individualIdentityList(),
                MODEL.mainOrder().creator().personInformation(),
                MODEL.mainOrder().gasShippingGroupList().gasLineItem().product(),
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
