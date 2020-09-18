package cla.edg.project.repairchain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.repairchain.gen.dbquery.MODEL;
import cla.edg.project.repairchain.gen.dbquery.OnJobStatus;

import java.io.File;

public class Q02_Factory extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
            return script
                    .query(MODEL.factory()).list_of("personal user working on").with_string("user id")
                        .comments("查找所有当前用户任职的工厂")
                        .do_it_as()
                        .where(MODEL.factory().employeeList().personalUser().eq("${user id}"),
                                MODEL.employee().status().code().eq(OnJobStatus.ACTIVE))

                   .query(MODEL.factory()).list_of("agent").pagination().with_string("agent id")
                        .comments("查询代理商名下的所有工厂")
                        .do_it_as()
                        .where(MODEL.factory().factoryAgencyList().agent().eq("${agent id}"))
                        .order_by(MODEL.factory().id()).desc()
                        .wants(MODEL.factory().factoryAgencyList(),
                                MODEL.factory().province(),
                                MODEL.factory().city(),
                                MODEL.factory().district())

                ;
    }
}
