package cla.edg.project.saleschain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.saleschain.gen.dbquery.MODEL;

public class Q2_Product extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .query(MODEL.functionality()).list_of("in home page").with_string("brand").with_string("city").with_string("function")
                    .comments("首页上的 功能类目 列表")
                    .do_it_as()
                        .where(MODEL.functionality().categoryList().productList().brand().eq("${brand}").optional(),
                                MODEL.product().supplier().supplierAvailableCityList().id().eq("${city}").optional(),
                                MODEL.functionality().id().eq("${function}").optional())
                        .wants(MODEL.functionality().categoryList())
                        .order_by(MODEL.functionality().displayOrder()).asc()
                        .order_by(MODEL.functionality().id()).desc()

                // 统计符合搜索内容的 brand
                .find(MODEL.searchAssistantContext()).which("searched function").with_string("searching")
                    .comments("从首页的搜索框进入搜索页面时,统计搜索产品的功能")
                    .do_it_as().count_by(MODEL.searchAssistantContext().functionality())
                        .where(MODEL.searchAssistantContext().content().like("${searching}").optional())
                .find(MODEL.searchAssistantContext()).which("searched category").with_string("searching")
                    .comments("从首页的搜索框进入搜索页面时,统计搜索产品的类目")
                    .do_it_as().count_by(MODEL.searchAssistantContext().category())
                        .where(MODEL.searchAssistantContext().content().like("${searching}").optional())
                .find(MODEL.searchAssistantContext()).which("searched product").with_string("searching")
                    .comments("从首页的搜索框进入搜索页面时,统计搜索产品的数量")
                    .do_it_as().count()
                        .where(MODEL.searchAssistantContext().content().like("${searching}").optional())


                .query(MODEL.functionality()).list_of("searched").pagination().with_string("searching")
                    .comments("从首页的搜索框进入搜索页面时,搜索功能类目")
                    .do_it_as()
                        .where(MODEL.functionality().categoryList().productList().searchAssistantContextList().content().like("${searching}"))
                        .order_by(MODEL.functionality().displayOrder()).asc()
                        .order_by(MODEL.functionality().id()).desc()

                .find(MODEL.functionality()).which("by name").with_string("name")
                    .comments("根据名称查找功能")
                    .do_it_as()
                        .where(MODEL.functionality().name().eq("${name}"),
                                MODEL.functionality().platform().not_null())

                .query(MODEL.category()).list_of("searched").pagination().with_string("searching")
                    .comments("从首页的搜索框进入搜索页面时,搜索二级类目")
                    .do_it_as()
                        .where(MODEL.category().productList().searchAssistantContextList().content().like("${searching}"))
                        .run_by(this::orderByCategory)

                .query(MODEL.product()).list_of("searched").pagination().with_string("searching")
                    .comments("从首页的搜索框进入搜索页面时,搜索产品")
                    .do_it_as()
                        .where(MODEL.product().searchAssistantContextList().content().like("${searching}"))
                        .run_by(this::orderByForProduct)
                        .wants(MODEL.product().supplier(), MODEL.product().brand())

                .query(MODEL.category()).list_of("in functionality").with_string("function")
                    .comments("查询一个功能类目下的所有二级类目")
                    .do_it_as()
                        .where(MODEL.category().functionality().eq("${function}"))
                        .run_by(this::orderByCategory)
                .find(MODEL.category()).which("has name").with_string("name")
                    .comments("根据名字查找 category")
                    .do_it_as()
                        .where(MODEL.category().name().eq("${name}"),
                                MODEL.category().functionality().platform().not_null())
                        .wants(MODEL.category().functionality())

                .query(MODEL.product()).list_of("in category").pagination().with_string("category id")
                    .comments("查询一个二级类目下的所有产品")
                    .do_it_as()
                        .where(MODEL.product().category().eq("${category id}"))
                        .run_by(this::orderByForProduct)


                .query(MODEL.product()).list_of("all").pagination()
                    .comments("分页查询所有的product")

                .query(MODEL.product()).list_of("brand").pagination().with_string("brand id").with_string("category id")
                    .comments("在品牌详情页面查询产品列表,可能有限定的category")
                    .do_it_as()
                        .where(MODEL.product().brand().eq("${brand id}"),
                                MODEL.product().category().eq("${category id}").optional())
                        .run_by(this::orderByForProduct)

                .query(MODEL.product()).list_of("supplier").pagination().with_string("supplier id").with_string("category id")
                    .comments("在品牌详情页面查询产品列表,可能有限定的category")
                    .do_it_as()
                        .where(MODEL.product().supplier().eq("${supplier id}"),
                                MODEL.product().category().eq("${category id}").optional())
                        .run_by(this::orderByForProduct)

                .find(MODEL.product()).which("by PN and supplier").with_string("supplier name").with_string("p no")
                    .comments("根据 供应商名称 和 货号 查询产品")
                    .do_it_as()
                        .where(MODEL.product().productCode().eq("${p no}"),
                                MODEL.product().supplier().name().eq("${supplier name}"),
                                MODEL.product().supplier().platform().not_null()
                        )

                // 查询最后一个 function
                .find(MODEL.functionality()).which("latest")
                    .comments("find latest function")
                    .do_it_as()
                    .where(MODEL.functionality().platform().not_null())
                    .order_by(MODEL.functionality().displayOrder()).desc()

                .find(MODEL.category()).which("latest in func").with_string("func id")
                    .comments("find latest category in given functionality")
                    .do_it_as()
                    .where(MODEL.category().functionality().eq("${func id}"))
                    .order_by(MODEL.category().displayOrder()).desc()
                ;
    }

    protected PageFlowScript orderByForProduct(PageFlowScript script){
        return script.order_by(MODEL.product().displayOrder()).asc()
                .order_by(MODEL.product().name()).asc_by_pinyin()
                .order_by(MODEL.product().id()).desc()
                ;
    }
    protected PageFlowScript orderByCategory(PageFlowScript script){
        return script.order_by(MODEL.category().displayOrder()).asc()
                .order_by(MODEL.category().name()).asc_by_pinyin()
                .order_by(MODEL.category().id()).desc()
                ;
    }
}