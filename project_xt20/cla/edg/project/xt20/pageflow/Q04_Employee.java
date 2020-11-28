package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.MODEL;
import cla.edg.project.xt20.gen.dbquery.Role;

public class Q04_Employee extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
            .query(MODEL.employee()).list_of("colleague in merchant").with_string("merchant id").with_string("personal id")
                .comments("查询用户在某个公司内的同事")
                .do_it_as()
                .where(MODEL.employee().personInformation().not("${personal id}"),
                        MODEL.employee().merchant().eq("${merchant id}"))
                .order_by(MODEL.employee().personInformation().name()).asc_by_pinyin()
                .wants(MODEL.employee().role(), MODEL.employee().personInformation())
       ;
    }
}
