package cla.edg.project.saleschain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class P6_CRPageFlow extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .request_with_changerequest("review domestic article").with_string("article id")
                    .comments("发表国产试用评论").need_login()
                    .got_page("domestic article detail")

                .request_with_changerequest("review knowledge base article").with_string("article id")
                    .comments("发表知识库评论").need_login()
                    .got_page("knowledge base article detail")

                .request_with_changerequest("post demand")
                    .comments("提交一个新需求").need_login()
                    .got_page("user demand list")

                .request_with_changerequest("withdraw application")
                    .comments("申请提现").need_login()
                    .got_page("my account")

                .request_with_changerequest("post feedback")
                    .comments("意见反馈").need_login()
                    .got_me_page()

                .request_with_changerequest("user confirm connect").with_string("proposal id")
                    .comments("用户确认对接成功")
                    .got_page("user demand detail")

                .request_with_changerequest("user confirm deal").with_string("proposal id")
                    .comments("用户确认成交")
                    .got_page("user demand detail")

                .request_with_changerequest("supplier confirm connect").with_string("proposal id")
                    .comments("供应商确认对接成功")
                    .got_page("supplier demand detail")

                .request_with_changerequest("supplier confirm deal").with_string("proposal id")
                    .comments("供应商确认成交")
                    .got_page("supplier demand proposal detail")

                .request_with_changerequest("domestic trial application").with_string("domestic trail id").with_string("product id")
                    .comments("提交试用申请")
                    .got_page("domestic article detail")

                .request_with_changerequest("supplier reject connect").with_string("proposal id")
                    .comments("供应商取消对接")
                    .got_page("supplier demand proposal detail")
                ;
    }
}
