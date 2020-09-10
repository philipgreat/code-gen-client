package cla.edg.project.saleschain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.saleschain.gen.dbquery.MODEL;
import cla.edg.project.saleschain.gen.dbquery.WithdrawStatus;

public class Q7_Money extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .query(MODEL.withdrawApplication()).list_of("user").pagination().with_string("user id")
                    .comments("查询用户的提现记录列表")
                    .do_it_as()
                        .where(MODEL.withdrawApplication().applicant().eq("${user id}"))
                        .wants(MODEL.withdrawApplication().status())

                .query(MODEL.accountBookRecord()).list_of("user cash").pagination().with_string("book id")
                    .comments("查询用户的 余额 账户明细")
                    .do_it_as()
                        .where(MODEL.accountBookRecord().payerAccount().eq("${book id}")
                                .or(MODEL.accountBookRecord().payeeAccount().eq("${book id}"))
                        )

                .find(MODEL.withdrawApplication()).which("in processing").with_string("user id")
                    .comments("查询用户当前正在处理中的提现申请")
                    .do_it_as()
                        .where(MODEL.withdrawApplication().applicant().eq("${user id}"),
                                MODEL.withdrawApplication().status().in(WithdrawStatus.NEED_EXPORT,
                                        WithdrawStatus.NEED_RELEASE_FROZEN,
                                        WithdrawStatus.NEED_TAKE_OFF_FROZEN,
                                        WithdrawStatus.NEED_OFFLINE_PROCESSING))

                .find(MODEL.accountBookItem()).which("for withdraw application").with_string("account book id").with_string("application id")
                    .comments("找到账本中和某个提现申请相关的条目")
                    .do_it_as()
                        .where(MODEL.accountBookItem().accountBook().eq("${account book id}"),
                                MODEL.accountBookItem().referObjectType().eq("${'"+MODEL.withdrawApplication().getInternalType()+"'}"),
                                MODEL.accountBookItem().referObjectId().eq("${application id}"))
                ;
    }
}
