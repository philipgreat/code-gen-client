package cla.edg.project.saleschain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.saleschain.gen.dbquery.MODEL;

public class X1_MiscPageFlow extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .request("view next page of review").with_string("article type id").with_string("article id").with_last_record_id()
                    .comments("查看更多review").no_login().no_footprint()
                    .when("knowledge base")
                        .got_page("knowledge base article")
                    .when("domestic trail")
                        .got_page("domestic article")

                .request("demo page")
                    .comments("演示页面")
                    .got_page("demo").list_of("single-image").title("演示")
                        .assemble_page_as()
                            .list_result_of_query(MODEL.accountBookRecord()).list_of("user cash")
                            //.split_into_tabs_by(MODEL.accountBookItemStatus()).which_default("abc")
                            .item_can_request("user demand detail")
                            .pagination_by_request("demo page")
                        .done()
                ;
    }
}
