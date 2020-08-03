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
                    .got_page("my demand list")

                .request_with_changerequest("with draw application")
                    .comments("申请提现").need_login()
                    .got_page("my account")

                .request_with_changerequest("post feedback")
                    .comments("意见反馈").need_login()
                    .got_me_page()
                ;
    }
}
