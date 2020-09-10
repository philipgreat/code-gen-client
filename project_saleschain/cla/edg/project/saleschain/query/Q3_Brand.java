package cla.edg.project.saleschain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.saleschain.gen.dbquery.MODEL;

public class Q3_Brand extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .find(MODEL.searchAssistantContext()).which("searched brand").with_string("searching")
                    .comments("从首页的搜索框进入搜索页面时,统计搜索产品")
                    .do_it_as().count_by(MODEL.searchAssistantContext().brand())
                        .where(MODEL.searchAssistantContext().content().like("${searching}").optional())

                .query(MODEL.brand()).list_of("searched").pagination().with_string("searching")
                    .comments("从首页的搜索框进入搜索页面时,搜索品牌")
                    .do_it_as()
                        .where(MODEL.brand().productList().searchAssistantContextList().content().like("${searching}"))
                        .order_by(MODEL.brand().displayOrder()).asc()
                        .order_by(MODEL.brand().id()).desc()

                .query(MODEL.brand()).list_of("in category").pagination().with_string("category id")
                    .comments("查询一个二级类目下的所有产品")
                    .do_it_as()
                        .where(MODEL.brand().productList().category().eq("${category id}"))
                        .order_by(MODEL.brand().displayOrder()).asc()
                        .order_by(MODEL.brand().name()).asc_by_pinyin()
                        .order_by(MODEL.brand().id()).desc()
                ;
    }
}
