package cla.edg.project.saleschain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.saleschain.gen.dbquery.MODEL;

public class Q4_Supplier extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .find(MODEL.searchAssistantContext()).which("searched supplier").with_string("searching")
                    .comments("从首页的搜索框进入搜索页面时,统计搜索产品的厂家")
                    .do_it_as().count_by(MODEL.searchAssistantContext().supplier())
                        .where(MODEL.searchAssistantContext().content().like("${searching}").optional())

                .query(MODEL.supplier()).list_of("searched").pagination().with_string("searching")
                    .comments("从首页的搜索框进入搜索页面时,搜索品牌")
                    .do_it_as()
                    .where(MODEL.supplier().productList().searchAssistantContextList().content().like("${searching}"))
                        .order_by(MODEL.supplier().displayOrder()).asc()
                        .order_by(MODEL.supplier().name()).asc_by_pinyin()
                        .order_by(MODEL.supplier().id()).desc()

                .query(MODEL.supplier()).list_of("in category").pagination().with_string("category id")
                    .comments("查询一个二级类目下的所有产品")
                    .do_it_as()
                        .where(MODEL.supplier().productList().category().eq("${category id}"))
                        .order_by(MODEL.supplier().displayOrder()).asc()
                        .order_by(MODEL.supplier().name()).asc_by_pinyin()
                        .order_by(MODEL.supplier().id()).desc()

                .query(MODEL.supplier()).list_of("by mobile").with_string("mobile")
                    .comments("根据手机号,查找被负责的公司")
                    .do_it_as()
                        .where(MODEL.supplier().adminMobile().eq("${mobile}"),
                                MODEL.supplier().merchant().not_null())



                ;
    }
}
