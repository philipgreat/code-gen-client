package cla.edg.project.saleschain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class P5_UserProfilePageFlow extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .request("logout").comments("退出当前账号").no_login().no_footprint()
                    .got_home_page()

                .request("qrcode scanned").with_string("qrcode type").with_string("qrcode url")
                    .comments("二维码扫描事件").no_login().no_footprint()
                    .got_home_page()

                .request_me_page()
                    .got_me_page()
                .request("check in")
                    .comments("签到打卡").need_login().no_footprint()
                    .got_me_page()
                .request("my demand list").with_string("filter").with_last_record_id()
                    .comments("查看我的需求列表").need_login()
                    .got_page("my demand list").list_of("card").title("需求列表")
                ;
    }
}
