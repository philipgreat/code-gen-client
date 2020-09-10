package cla.edg.project.saleschain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.saleschain.gen.dbquery.MODEL;

public class Q6_Message extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .find(MODEL.systemMessage()).which("user unread").with_string("user id")
                    .comments("统计用户各种状态的系统消息")
                    .do_it_as().count()
                        .where(MODEL.systemMessage().recipient().eq("${user id}"),
                                MODEL.systemMessage().isRead().eq(false))

                .query(MODEL.systemMessage()).list_of("user unread").with_string("user id")
                    .comments("查询用户的未读信息")
                    .do_it_as()
                        .where(MODEL.systemMessage().recipient().eq("${user id}"),
                                MODEL.systemMessage().isRead().eq(false))
                .query(MODEL.systemMessage()).list_of("user").with_string("user id")
                    .comments("查询用户的全部信息")
                    .do_it_as()
                        .where(MODEL.systemMessage().recipient().eq("${user id}"))

                ;
    }
}
