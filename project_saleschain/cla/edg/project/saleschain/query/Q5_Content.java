package cla.edg.project.saleschain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.saleschain.gen.graphquery.MODEL;

public class Q5_Content extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .query(MODEL.brandCase()).list_of("brand").pagination().with_string("brand id")
                    .comments("查询品牌的 质量服务 文章")
                    .do_it_as()
                        .where(MODEL.brandCase().brand().eq("${brand id}"))
                        .order_by(MODEL.brandCase().article().postDate()).desc()
                        .order_by(MODEL.brandCase().id()).desc()
                        .wants(MODEL.brandCase().article())

                .query(MODEL.supplierCase()).list_of("supplier").pagination().with_string("supplier id")
                    .comments("查询品牌的 质量服务 文章")
                    .do_it_as()
                        .where(MODEL.supplierCase().supplier().eq("${supplier id}"))
                        .order_by(MODEL.supplierCase().article().postDate()).desc()
                        .order_by(MODEL.supplierCase().id()).desc()
                        .wants(MODEL.supplierCase().article())
                ;
    }
}
