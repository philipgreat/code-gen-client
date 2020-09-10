package cla.edg.project.saleschain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.saleschain.gen.dbquery.DemandProposalStatus;
import cla.edg.project.saleschain.gen.dbquery.MODEL;

public class Q9_Trade extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .query(MODEL.demand()).list_of("post by user").pagination().with_string("user id").with_string("status")
                    .comments("查询用户提交的 需求 ")
                    .do_it_as()
                        .where(MODEL.demand().submitter().eq("${user id}"),
                                MODEL.demand().demandStatus().code().eq("${status}"))
                        .wants(MODEL.demand().demandType(), MODEL.demand().submitter())

                .query(MODEL.demand()).list_of("check by user").pagination().with_string("mobile").with_string("status")
                    .comments("查询需要用户处理的 需求")
                    .do_it_as()
                        .where(MODEL.demand().demandProposalList().supplier().adminMobile().eq("${mobile}"),
                                MODEL.demand().demandStatus().code().eq("${status}"))

                .query(MODEL.demand()).list_of("related to user").pagination().with_string("mobile").with_string("status")
                    .comments("查询用户相关的 需求, 既包括他提交的,也包括需要他处理的")
                    .do_it_as()
                    .where(
                            MODEL.demand().demandProposalList().supplier().adminMobile().eq("${mobile}")
                                    .or(MODEL.demand().submitter().mobile().eq("${mobile}")),
                            MODEL.demand().demandStatus().code().eq("${status}"))

                .find(MODEL.demand()).which("post by user").with_string("user id")
                    .comments("统计各种状态下 需求 的数量")
                    .do_it_as().count_by(MODEL.demand().demandStatus())
                        .where(MODEL.demand().submitter().eq("${user id}"))

                .find(MODEL.demand()).which("check by user").with_string("mobile")
                    .comments("统计各种状态下需要被我处理的 需求 的数量")
                    .do_it_as().count_by(MODEL.demand().demandStatus())
                        .where(MODEL.demand().demandProposalList().supplier().adminMobile().eq("${mobile}"))

                .query(MODEL.demandProposal()).list_of("post by user").with_string("demand id")
                    .comments("查询用户提交的 需求 下的所有 demand-proposal")
                    .do_it_as()
                        .where(MODEL.demandProposal().demand().eq("${demand id}"))
                        .wants(MODEL.demandProposal().userStatus(),
                                MODEL.demandProposal().demandProposalTradeList(),
                                MODEL.demandProposal().supplier(),
                                MODEL.demandProposal().demand().submitter(),
                                MODEL.demandProposal().demandProposalLogList())

                .query(MODEL.demandProposal()).list_of("check by user").with_string("demand id").with_string("mobile")
                    .comments("查询用户提交的 需求 下的所有 demand-proposal")
                    .do_it_as()
                        .where(MODEL.demandProposal().supplier().adminMobile().eq("${mobile}"),
                                MODEL.demandProposal().demand().eq("${demand id}"))
                        .wants(MODEL.demandProposal().supplierStatus(),
                                MODEL.demandProposal().demandProposalTradeList(),
                                MODEL.demandProposal().supplier())

                .query(MODEL.demandProposal()).list_of("wait connect by supplier").with_string("mobile")
                    .comments("查询需要厂家确认对接的 demand-proposal")
                    .do_it_as()
                        .run_by((it)->queryBySubmitter(it, DemandProposalStatus.WAIT_CONNECT))
                .query(MODEL.demandProposal()).list_of("wait deal by supplier").with_string("mobile")
                    .comments("查询需要厂家确认成交的 demand-proposal")
                    .do_it_as()
                        .run_by((it)->queryBySubmitter(it,DemandProposalStatus.WAIT_DEAL))
                .query(MODEL.demandProposal()).list_of("closed for supplier").with_string("mobile")
                    .comments("查询对厂家来说已经关闭的 demand-proposal")
                    .do_it_as()
                        .run_by((it)->queryBySubmitter(it,DemandProposalStatus.COMPLETED, DemandProposalStatus.CANCELLED))
                .query(MODEL.demandProposal()).list_of("processing for supplier").with_string("mobile")
                    .comments("查询对厂家来说还在处理中的 demand-proposal")
                    .do_it_as()
                        .run_by((it)->queryBySubmitter(it,DemandProposalStatus.CONNECTED, DemandProposalStatus.DEAL, DemandProposalStatus.ACCOUNTING))


                .query(MODEL.demandProposal()).list_of("need check by user").pagination().with_string("mobile").with_string("supplier status")
                    .comments("查询用户负责,某个状态的 demand-proposal")
                    .do_it_as()
                        .where(MODEL.demandProposal().supplier().adminMobile().eq("${mobile}"),
                                MODEL.demandProposal().supplierStatus().eq("${supplier status}"))
                        .wants(MODEL.demandProposal().supplierStatus(),
                                MODEL.demandProposal().supplier(),
                                MODEL.demandProposal().demand().submitter())

                .find(MODEL.demandProposal()).which("need check by user").with_string("proposal id")
                    .comments("在供应商需求详情页面加载 需求建议")
                    .do_it_as()
                        .where(MODEL.demandProposal().id().eq("${proposal id}"))
                        .wants(MODEL.demandProposal().userStatus(),
                                MODEL.demandProposal().demandProposalTradeList(),
                                MODEL.demandProposal().supplier(),
                                MODEL.demandProposal().demand().submitter(),
                                MODEL.demandProposal().demand().unitType(),
                                MODEL.demandProposal().demand().demandStatus(),
                                MODEL.demandProposal().demandProposalLogList())



                ;
    }

    private PageFlowScript queryBySubmitter(PageFlowScript script, Object ... statusCode) {
        return script.where(MODEL.demandProposal().supplier().adminMobile().eq("${mobile}"),
                            MODEL.demandProposal().supplierStatus().in(statusCode))
                .wants(MODEL.demandProposal().supplierStatus(),
                        MODEL.demandProposal().supplier(),
                        MODEL.demandProposal().demand().demandType(),
                        MODEL.demandProposal().demand().submitter());
    }
}