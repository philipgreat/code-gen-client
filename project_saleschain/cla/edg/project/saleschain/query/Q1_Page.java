package cla.edg.project.saleschain.query;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import cla.edg.project.saleschain.gen.graphquery.MODEL;

public class Q1_Page extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .query(MODEL.slide()).list_of("page").no_pagination().with_string("page id")
                    .comments("查询某个页面下的所有幻灯片")
                    .do_it_as()
                        .where(MODEL.slide().page().eq("${page id}"))
                        .order_by(MODEL.slide().displayOrder()).asc()
                .query(MODEL.brand()).list_of("candidate in home page").no_pagination()
                    .comments("查询首页上的候选品牌列表")
                    .do_it_as()
                        .where(MODEL.brand().merchant().not_null())
                        .order_by(MODEL.brand().name()).asc_by_pinyin()
                .query(MODEL.city()).list_of("candidate in home page").no_pagination()
                    .comments("查询首页上的候选城市列表")
                    .do_it_as()
                        .where(MODEL.city().supplierAvailableCityList().supplier().not_null())
                        .order_by(MODEL.city().name()).asc_by_pinyin()
                        .wants(MODEL.city().province())

                .query(MODEL.functionality()).list_of("candidate in home page").no_pagination()
                    .comments("查询首页上的候选功能类目列表")
                    .do_it_as()
                        .where(MODEL.functionality().platform().not_null())
                        .order_by(MODEL.functionality().name()).asc_by_pinyin()

                .query(MODEL.province()).list_of("candidate in home page").no_pagination()
                    .comments("为首页上的地区查询候选值")
                    .do_it_as()
                        .where(MODEL.province().platform().not_null())
                        .order_by(MODEL.province().name()).asc_by_pinyin()
                        .wants(MODEL.province().cityList())

                ;
    }
}
