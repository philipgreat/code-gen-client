package cla.edg.project.saleschain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class P3_KnowledgeBasePageFlow extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .request("knowledge base footer").with_last_record_id()
                    .comments("查看知识库文章列表").no_login().has_footprint().can_refresh()
                    .got_page("knowledge base article list").list_of("card").title("知识库")
                        .may_request("knowledge base article detail")

                .request("knowledge base article detail").with_string("article id").with_last_record_id()
                    .comments("查看知识库文章").no_login().has_footprint().can_refresh()
                    .got_page("knowledge base article detail").list_of("card").title("知识库文章")
                        .may_request("submit cr review knowledge base article")
                        .may_request("view next page of review")

                .request("search article in knowledge base").with_string("search key").with_last_record_id()
                    .comments("在 知识库 里搜索").no_login().no_footprint().can_refresh()
                    .got_page("knowledge base article list")


                ;
    }
}
