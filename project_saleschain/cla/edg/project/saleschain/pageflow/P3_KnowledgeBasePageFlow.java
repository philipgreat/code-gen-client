package cla.edg.project.saleschain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class P3_KnowledgeBasePageFlow extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .request("knowledge base footer").with_last_record_id()
                    .comments("查看知识库文章列表").no_login().has_footprint()
                    .got_page("knowledge base article list").list_of("card").title("知识库")
                        .may_request("knowledge base article detail")

                .request("knowledge base article detail").with_string("article id").with_last_record_id()
                    .comments("查看知识库文章").no_login().has_footprint()
                    .got_page("knowledge base article detail").list_of("card").title("知识库文章")
                        .may_request("submit cr review knowledge base article")
                        .may_request("view next page of review")



                ;
    }
}
