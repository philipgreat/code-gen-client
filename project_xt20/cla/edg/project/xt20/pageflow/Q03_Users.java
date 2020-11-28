package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.MODEL;
import cla.edg.project.xt20.gen.dbquery.Role;

public class Q03_Users extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
            .query(MODEL.personalUser()).list_of("not admin in merchant").with_string("merchant id")
                .comments("查询一个组织中,当前不是admin的Person")
                .do_it_as()
                .where(MODEL.personalUser().employeeList().merchant().eq("${merchant id}"),
                        MODEL.personalUser().employeeList().role().not(Role.ADMIN))
                .order_by(MODEL.personalUser().name()).asc_by_pinyin()

       ;
    }
}