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


       ;
    }
}
