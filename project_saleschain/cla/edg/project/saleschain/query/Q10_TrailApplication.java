package cla.edg.project.saleschain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.saleschain.gen.dbquery.MODEL;

public class Q10_TrailApplication extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .query(MODEL.tryOnApplication()).list_of("user applied").pagination().with_string("user id").with_string("status")
                    .comments("查询用户提交的试用申请")
                    .do_it_as()
                        .where(MODEL.tryOnApplication().submitter().eq("${user id}"),
                                MODEL.tryOnApplication().status().eq("${status}"))
                        .run_by(this::tryOnApplicationThing)

                .query(MODEL.tryOnApplication()).list_of("need user checking").pagination().with_string("mobile").with_string("status")
                    .comments("查询需要用户处理的试用申请")
                    .do_it_as()
                        .where(MODEL.tryOnApplication().supplier().adminMobile().eq("${mobile}"),
                                MODEL.tryOnApplication().status().eq("${status}"))
                        .run_by(this::tryOnApplicationThing)
                ;
    }

    private PageFlowScript tryOnApplicationThing(PageFlowScript script) {
        return script.order_by(MODEL.tryOnApplication().lastUpdateTime()).desc()
                .order_by(MODEL.tryOnApplication().id()).desc()
                .wants(MODEL.tryOnApplication().status(),
                        MODEL.tryOnApplication().submitter(),
                        MODEL.tryOnApplication().product(),
                        MODEL.tryOnApplication().unitType(),
                        MODEL.tryOnApplication().supplier()
                );
    }
}
