package cla.edg.project.saleschain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.saleschain.gen.graphquery.MODEL;

public class Q8_People extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .query(MODEL.userInvite()).list_of("by user").pagination().with_string("user id")
                    .comments("查看用户邀请的记录")
                    .do_it_as()
                        .where(MODEL.userInvite().inviter().eq("${user id}"))
                        .wants(MODEL.userInvite().invitee())

                .find(MODEL.mobileUser()).which("by mobile").with_string("mobile")
                    .comments("根据手机号找用户")
                    .do_it_as()
                        .where(MODEL.mobileUser().mobile().eq("${mobile}"))
                        .wants(MODEL.mobileUser().merchant())
                ;
    }
}
