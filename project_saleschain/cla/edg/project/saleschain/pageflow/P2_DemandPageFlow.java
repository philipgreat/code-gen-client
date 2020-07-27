package cla.edg.project.saleschain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class P2_DemandPageFlow extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .request("demand footer").with_string("filter").with_last_record_id()
                    .comments("查看我提交的需求列表").need_login().has_footprint()
                    .got_page("user demand list").list_of("card").title("需求列表")
                        .may_request("user demand detail")

                .request("user demand detail").with_string("demand id").with_string("supplier id")
                    .comments("查看我提交的需求详情").need_login().has_footprint()
                    .got_page("user demand detail").list_of("card").title("需求详情")
                        .may_request("user demand detail")
                ;
    }
}
