package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.MODEL;

public class Q02_GasProduct extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
            .query(MODEL.gasProduct()).list_of("merchant").pagination().with_string("merchant id").with_string("search key")
                .comments("查询卖家的所有现有产品")
                .do_it_as()
                .where(MODEL.gasProduct().merchant().eq("${merchant id}"),
                        MODEL.gasProduct().gasProductCacheList().searchText().like("${search key}").optional())
                .run_by(this::wantedForProductList)

            .query(MODEL.gasProduct()).list_of("merchant by trade time").with_string("merchant id")
                .comments("按照交易的时间降序,列出买家的产品列表")
                .do_it_as()
                .where(MODEL.gasProduct().gasLineItemList().mainOrder().seller().eq("${merchant id}"))
                .order_by(MODEL.gasProduct().gasLineItemList().mainOrder().id()).desc()
                .order_by(MODEL.gasProduct().id()).desc()
                .run_by(this::wantedForProductList)

            .query(MODEL.gasProduct()).list_of("seller by trade time").pagination().with_string("seller id").with_string("buyer id")
                .comments("按照买家的交易时间倒序,列出卖家的产品列表")
                .do_it_as()
                .where(MODEL.gasProduct().merchant().eq("${seller id}")
                        .or(MODEL.gasProduct().gasLineItemList().mainOrder().buyer().eq("${buyer id}")
                                .and(MODEL.gasProduct().gasLineItemList().mainOrder().seller().eq("${seller id}"))))
                .order_by(MODEL.gasProduct().gasLineItemList().mainOrder().lastUpdateTime()).desc()
                .order_by(MODEL.gasProduct().id()).desc()
                .run_by(this::wantedForProductList)



            .query(MODEL.gasProductTemplate()).list_of("all").pagination()
                .comments("查询所有的产品模板")
                .do_it_as()
                .where(MODEL.gasProductTemplate().platform().not_null())
                .wants(MODEL.gasProductTemplate().cylinder(),
                        MODEL.gasProductTemplate().fillVolume(),
                        MODEL.gasProductTemplate().productType(),
                        MODEL.gasCylinder().nominalPressure(),
                        MODEL.gasCylinder().fillMedium(),
                        MODEL.gasCylinder().gasContainer(),
                        MODEL.gasCylinder().nominalVolume())

            .query(MODEL.gasProduct()).list_of("merchant in template").with_string("merchant id").with_list("template ids")
                .comments("查询商户的,使用了指定模板的产品")
                .do_it_as()
                .where(MODEL.gasProduct().merchant().eq("${merchant id}"),
                        MODEL.gasProduct().template().in("${template ids}"))
                .run_by(this::wantedForProductList)


            .find(MODEL.gasProduct()).which("for detail").with_string("product id")
                .comments("加载产品的信息,构建详情页")
                .do_it_as()
                .where(MODEL.gasProduct().id().eq("${product id}"))
                .wants(MODEL.gasProduct().cylinder(), MODEL.gasProduct().status())


            .find(MODEL.gasProductTemplate()).which("added into merchant lib").with_string("id")
                .comments("查询用户刚刚添加的模板产品的信息")
                .do_it_as()
                .where(MODEL.gasProductTemplate().id().eq("${id}"))
                .wants(MODEL.gasProductTemplate().gasProductList().cylinder())


       ;
    }

    private PageFlowScript wantedForProductList(PageFlowScript script) {
        return script.wants(MODEL.gasProduct().cylinder().gasContainer(),
                MODEL.gasProduct().fillVolume(),
                MODEL.gasProduct().status(),
                MODEL.gasProduct().cylinder().nominalPressure(),
                MODEL.gasCylinder().fillMedium(),
                MODEL.gasCylinder().gasContainer(),
                MODEL.gasCylinder().nominalVolume());
    }
}
