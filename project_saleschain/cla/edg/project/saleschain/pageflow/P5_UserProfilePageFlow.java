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

                // 个人首页第一层入口
                .request("check in")
                    .comments("签到打卡").need_login().no_footprint()
                    .got_me_page()
                .request("account management").with_string("tab name").with_last_record_id()
                    .comments("余额管理").need_login()
                    .got_page("my account").list_of("card").title("账户信息")

                .request("view messages").with_string("tab name").with_last_record_id()
                    .comments("查看消息").need_login()
                    .got_page("message list").list_of("card").title("消息")
                .request("invite")
                    .comments("邀请好友").need_login()
                    .got_page("invite info").list_of("card").title("邀请好友")
                .request("view invited list").with_last_record_id()
                    .comments("查看我邀请的人").need_login()
                    .got_page("invited list").list_of("card").title("我邀请的好友")
                .request("my demand list").with_string("filter").with_last_record_id()
                    .comments("查看我的需求列表").need_login()
                    .got_page("user demand list").list_of("card").title("需求列表")
                .request("my q and a").with_string("tab name").with_last_record_id()
                    .comments("我的问答").need_login()
                    .got_page("my review list").list_of("card").title("我的评论")

                .request("update profile info").with_string("name").with_string("avatar")
                    .comments("更新用户名称").no_login()
                    .got_me_page()

                .request("click system message detail").with_string("message id")
                    .comments("用户点击了某个系统消息")
                    .got_ajax_response()
                ;
    }
}
