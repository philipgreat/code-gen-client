package cla.edg.project.repairchain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.repairchain.gen.dbquery.MODEL;
import cla.edg.project.repairchain.gen.dbquery.OnJobStatus;

import java.io.File;

public class Q01_PersonalUser extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
            return script
                    .find(MODEL.agent()).which("by personal user").with_string("user id")
                        .comments("统计用户有几个代理商")
                        .do_it_as().count()
                        .where(MODEL.agent().personalUser().eq("${user id}"))

                    .find(MODEL.agent()).which("by personal user").with_string("user id")
                        .comments("找到用户关联的1个代理商")
                        .do_it_as()
                        .where(MODEL.agent().personalUser().eq("${user id}"))

                    .query(MODEL.agent()).list_of("personal user").with_string("user id")
                        .comments("找到用户关联的所有代理商")
                        .do_it_as()
                        .where(MODEL.agent().personalUser().eq("${user id}"))


                    .find(MODEL.employee()).which("by personal user").with_string("user id")
                        .comments("找到用户关联的1个在职的职务")
                        .do_it_as()
                        .where(MODEL.employee().personalUser().eq("${user id}"),
                                MODEL.employee().status().code().eq(OnJobStatus.ACTIVE))


                    .find(MODEL.personalUser()).which("active with mobile").with_string("mobile")
                        .comments("根据手机号查找活跃的个人用户")
                        .do_it_as()
                        .where(MODEL.personalUser().mobile().eq("${mobile}"))


                    .query(MODEL.agent()).list_of("not bound").with_string("mobile")
                        .comments("查询指定了人员手机号,但是没有关联到个人账户的 代理商")
                        .do_it_as()
                        .where(MODEL.agent().personalUser().is_null(), MODEL.agent().mobile().eq("${mobile}"))

                    .query(MODEL.employee()).list_of("not bound").with_string("mobile")
                        .comments("查询指定了人员手机号,但是没有关联到个人账户的 工厂职工")
                        .do_it_as()
                        .where(MODEL.employee().personalUser().is_null(),
                                MODEL.employee().mobile().eq("${mobile}"),
                                MODEL.employee().status().code().eq(OnJobStatus.ACTIVE))

                    .query(MODEL.employee()).list_of("user acting").with_string("user id").with_string("factory")
                        .comments("找到当前用户担任的职位")
                        .do_it_as()
                        .where(MODEL.employee().personalUser().eq("${user id}"),
                                MODEL.employee().status().code().eq(OnJobStatus.ACTIVE),
                                MODEL.employee().factory().eq("${factory}"))
                        .wants(MODEL.employee().workPosition())



                ;
    }
}
