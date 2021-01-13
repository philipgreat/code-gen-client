package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.xt20.gen.dbquery.MODEL;

import java.io.File;

public class Q01_Guide extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
            .query(MODEL.guideSlide()).list_of("user type").with_string("guide type")
                .comments("根据用户的类型(新/买/卖家)加载其引导画面")
                .do_it_as()
                .where(MODEL.guideSlide().guideType().eq("${guide type}"),
                        MODEL.guideSlide().enabled().eq(true))
                .order_by(MODEL.guideSlide().displayOrder()).asc()
                .order_by(MODEL.guideSlide().id()).desc()
       ;
    }
}
