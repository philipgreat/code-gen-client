package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.*;

public class Q07_Delivery extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script

//            .query(MODEL.deliveryReceipt()).list_of("need confirm").pagination()
//                    .with_string("merchant id").with_string("search key")
//                .comments("查询商户的待交接运单")
//                .do_it_as()
//                .where(MODEL.deliveryReceipt().seller().eq("${merchant id}"),
//                        MODEL.deliveryReceipt().status().in(DeliveryReceiptStatus.BUYER_CONFIRM_TIMEOUT, DeliveryReceiptStatus.WAITING_BUYER_CONFIRM),
//                        MODEL.deliveryReceipt().gasShippingGroup().buyerContactName().like("${search key}")
//                            .or(MODEL.deliveryReceipt().gasShippingGroup().buyerContactPhone().like("${search key}"),
//                                    MODEL.deliveryReceipt().gasShippingGroup().handoverAddress().like("${search key}"))
//                )
//                .wants(MODEL.deliveryReceipt().buyer(), MODEL.deliveryReceipt().seller(),
//                        MODEL.deliveryReceipt().gasShippingGroup())
            .query(MODEL.deliverTask()).list_of("delivery receipt confirm").pagination().with_string("merchant id").with_string("search key")
                .comments("根据筛选条件,查询并合并成 待创建交接单 列表")
                .do_it_as()
                .where(MODEL.deliverTask().gasShippingGroupList().seller().eq("${merchant id}"),
                        MODEL.deliverTask().gasShippingGroupList().shippingStatus().in(ShippingStatus.SELLER_SHIPPING),
                        MODEL.deliverTask().gasShippingGroupList().buyerContactName().like("${search key}")
                        .or(MODEL.deliverTask().gasShippingGroupList().handoverAddress().like("${search key}"),
                                MODEL.deliverTask().gasShippingGroupList().buyerContactPhone().like("${search key}")
                                )
                )
                .wants(MODEL.deliverTask().gasShippingGroupList().buyer().organizationIdentityList(),
                        MODEL.deliverTask().gasShippingGroupList().shippingStatus(),
                        MODEL.deliverTask().gasShippingGroupList().gasLineItem().cylinder())


            .query(MODEL.deliverTask()).list_of("seller with status").pagination().with_string("merchant id").with_list("status")
                .comments("查询卖家的待执行运单")
                .do_it_as()
                .where(MODEL.deliverTask().merchant().eq("${merchant id}"),MODEL.deliverTask().status().in("${status}"))
                .wants(MODEL.deliverTask().status(), MODEL.deliverTask().deliverStaff().personInformation())

            .query(MODEL.deliverTask()).list_of("confirm bottle return").pagination().with_string("merchant id")
                .comments("查询待'回瓶确认'的运单")
                .do_it_as()
                .where(MODEL.deliverTask().merchant().eq("${merchant id}"),MODEL.deliverTask().status().in(DeliverTaskStatus.RETURNING))
                .wants(MODEL.deliverTask().status(), MODEL.deliverTask().deliverStaff().personInformation(),
                        MODEL.deliverTask().gasShippingGroupList().deliveryReceiptList(),
                        MODEL.deliverTask().gasShippingGroupList().gasLineItem().cylinder().gasContainer())

            .query(MODEL.deliverTask()).list_of("bottle returned").pagination().with_string("merchant id")
                .comments("查询待'已回厂'的运单")
                .do_it_as()
                .where(MODEL.deliverTask().merchant().eq("${merchant id}"),MODEL.deliverTask().status().in(DeliverTaskStatus.COMPLETED))
                .wants(MODEL.deliverTask().status(), MODEL.deliverTask().deliverStaff().personInformation(),
                        MODEL.deliverTask().bottleBackList().cylinder().gasContainer(),
                        MODEL.deliverTask().productBackList().proudct())



            .query(MODEL.mainOrder()).list_of("buyer need receipt").pagination().with_string("buyer id").with_string("seller id").with_string("search key")
                .comments("查询买家的,需要处理 '交接单确认' 的订单")
                .do_it_as()
                .where(MODEL.mainOrder().buyer().eq("${buyer id}"),
                        MODEL.mainOrder().seller().eq("${seller id}").optional(),
                        MODEL.mainOrder().gasShippingGroupList().deliveryReceiptList().status().in(DeliveryReceiptStatus.WAITING_BUYER_CONFIRM, DeliveryReceiptStatus.BUYER_CONFIRM_TIMEOUT),
                        MODEL.mainOrder().seller().name().like("${search key}")
                        .or(MODEL.mainOrder().seller().organizationIdentityList().name().like("${search key}"),
                                MODEL.mainOrder().buyerContactName().like("${search key}"),
                                MODEL.mainOrder().sellerContactName().like("${search key}"),
                                MODEL.mainOrder().buyerContactPhone().like("${search key}"),
                                MODEL.mainOrder().sellerContactPhone().like("${search key}")
                        )
                )
                .wants(MODEL.mainOrder().seller().organizationIdentityList(),
                        MODEL.mainOrder().creator().personInformation())



            .find(MODEL.deliverTask()).which("by id").with_string("task id")
                .comments("根据ID查询配送任务")
                .do_it_as()
                .where(MODEL.deliverTask().id().eq("${task id}"))
                .wants(MODEL.deliverTask().deliverStaff().personInformation(),
                        MODEL.deliverTask().status(),
                        MODEL.deliverTask().productBackList().proudct().cylinder().gasContainer(),
                        MODEL.deliverTask().bottleBackList().cylinder().gasContainer(),
                        MODEL.deliverTask().gasShippingGroupList().gasLineItem().cylinder().gasContainer(),
                        MODEL.deliverTask().gasShippingGroupList().gasLineItem().product(),
                        MODEL.deliverTask().gasShippingGroupList().deliveryReceiptList(),
                        MODEL.deliverTask().merchant().organizationIdentityList())


            .query(MODEL.gasShippingGroup()).list_of("view as deliver task").with_string("order id").with_string("task id")
                .comments("查询出某个配送任务下, 某个订单的所有 shipping group")
                .do_it_as()
                .where(MODEL.gasShippingGroup().mainOrder().eq("${order id}"),
                        MODEL.gasShippingGroup().deliverTask().eq("${task id}"))

        ;
    }
}
