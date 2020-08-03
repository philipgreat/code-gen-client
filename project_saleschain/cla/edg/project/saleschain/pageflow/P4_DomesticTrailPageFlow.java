package cla.edg.project.saleschain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class P4_DomesticTrailPageFlow extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .request("domestic trial footer").with_last_record_id()
                    .comments("查看国产试用列表").no_login().no_footprint()
                    .got_page("domestic article list").list_of("card").title("国产试用")

                .request("domestic article detail").with_string("article id").with_last_record_id()
                    .comments("查看国产试用详情").no_login().no_footprint()
                    .got_page("domestic article detail").list_of("card").title("国产试用文章")



                ;
    }
}
