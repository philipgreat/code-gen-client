package cla.edg.project.saleschain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class P4_DomesticTrailPageFlow extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .request("domestic trial footer").with_last_record_id()
                    .comments("查看国产试用列表").no_login().no_footprint().can_refresh()
                    .got_page("domestic article list").list_of("card").title("国产试用")

                .request("domestic article detail").with_string("article id").with_last_record_id()
                    .comments("查看国产试用详情").no_login().no_footprint().can_refresh()
                    .got_page("domestic article detail").list_of("card").title("国产试用文章")

                .request("search article in domestic trial").with_string("search key").with_last_record_id()
                    .comments("查看国产试用列表").no_login().no_footprint().can_refresh()
                    .got_page("domestic article list")

                .request("trail application supplier list").with_string("tab name").with_last_record_id()
                    .comments("厂家查看试用申请列表").can_refresh().need_login()
                    .got_page("domestic trail application list").list_of("card").title("试用申请列表")

                .request("supplier mark trail application").with_string("application id").with_string("code")
                    .comments("厂家标记试用申请")
                    .got_page("domestic trail application list")

                .request("trail application user list").with_string("tab name").with_last_record_id()
                    .comments("厂家查看试用申请列表").can_refresh().need_login()
                    .got_page("my trail application list").list_of("card").title("试用申请列表")


                ;
    }
}
