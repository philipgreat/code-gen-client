package cla.edg.project.saleschain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class X1_MiscPageFlow extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .request("view next page of review").with_string("article type id").with_string("article id").with_last_record_id()
                    .comments("查看更多review").no_login().no_footprint()
                    .when("knowledge base")
                        .got_page("knowledge base article")
                    .when("domestic trail")
                        .got_page("domestic article")

                ;
    }
}
