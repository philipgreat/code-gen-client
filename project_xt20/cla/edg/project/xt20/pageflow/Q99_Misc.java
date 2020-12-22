package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.MODEL;

public class Q99_Misc extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script

            .query(MODEL.slide()).list_of("homepage").with_string("page id")
                .comments("首页的幻灯片")
                .do_it_as()
                .where(MODEL.slide().page().eq("${page id}"))
                .order_by(MODEL.slide().displayOrder()).asc()

            .find(MODEL.userWorkingInfo()).which("by id").with_string("id")
                .comments("根据ID加载工作上下文")
                .do_it_as()
                .where(MODEL.userWorkingInfo().id().eq("${id}"))
                .wants(MODEL.userWorkingInfo().employee().personInformation(),
                        MODEL.userWorkingInfo().employee().merchant().organizationIdentityList())

            .find(MODEL.merchant()).which("by id").with_string("id")
                .comments("根据ID加载商户信息")
                .do_it_as()
                .where(MODEL.merchant().id().eq("${id}"))
                .wants(MODEL.merchant().organizationIdentityList(), MODEL.merchant().merchantType())



            .query(MODEL.fillMedium()).list_of("candidate")
                .comments("查询所有的 充装介质 候选值")
                .do_it_as()
                .where(MODEL.fillMedium().platform().not_null())
            .query(MODEL.gasContainer()).list_of("candidate")
                .comments("查询所有的 包装介质 候选值")
                .do_it_as()
                .where(MODEL.gasContainer().platform().not_null())
            .query(MODEL.gasProductTemplateComponent()).list_of("candidate by fill medium").with_string("fill medium")
                .comments("查询指定充装介质对应的 质量规格 候选值")
                .do_it_as()
                .where(MODEL.gasProductTemplateComponent().fillMedium().eq("${fill medium}"))


            .find(MODEL.invitationRecord()).which("by id").with_string("id")
                .comments("加载邀请详情")
                .do_it_as()
                .where(MODEL.invitationRecord().id().eq("${id}"))
                .wants(MODEL.invitationRecord().inviter().personInformation(),
                        MODEL.invitationRecord().inviter().merchant().organizationIdentityList())

       ;
    }
}
