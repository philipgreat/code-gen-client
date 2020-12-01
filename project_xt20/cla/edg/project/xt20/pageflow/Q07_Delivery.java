package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.DeliveryReceiptStatus;
import cla.edg.project.xt20.gen.dbquery.MODEL;
import cla.edg.project.xt20.gen.dbquery.OrderStatus;
import cla.edg.project.xt20.gen.dbquery.ShippingStatus;

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
                .where(MODEL.deliverTask().gasShippingGroupList().seller().not("${merchant id}"), // TODO 记得改回 eq
                        MODEL.deliverTask().gasShippingGroupList().shippingStatus().in(ShippingStatus.SELLER_SHIPPING),
                        MODEL.deliverTask().gasShippingGroupList().buyerContactName().like("${search key}")
                        .or(MODEL.deliverTask().gasShippingGroupList().handoverAddress().like("${search key}"),
                                MODEL.deliverTask().gasShippingGroupList().buyerContactPhone().like("${search key}")
                                )
                )
                .wants(MODEL.deliverTask().gasShippingGroupList().buyer().organizationIdentityList(),
                        MODEL.deliverTask().gasShippingGroupList().shippingStatus(),
                        MODEL.deliverTask().gasShippingGroupList().gasLineItem().cylinder())
        ;
    }
}
