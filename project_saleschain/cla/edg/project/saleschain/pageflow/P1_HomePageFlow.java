package cla.edg.project.saleschain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class P1_HomePageFlow extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .request_homepage() //.need_login()
                    .got_home_page()
                        .may_request("search")
                        .may_request("category detail")
                        .may_request("knowledge base footer")
                        .may_request("domestic trial footer")
                .request("filter in homepage").with_string("brand id").variable().with_string("city id").variable().with_string("functionality id").variable()
                    .comments("首页上简单的过滤: 首页")
                    .got_home_page()


                .request("category detail").with_string("category id").with_string("tab name").with_last_record_id()
                    .comments("查看二级产品类目详情: 首页-二级产品列表").no_login().has_footprint()
                    .got_page("category detail").list_of("card").title("二级产品类目列表")
                        .may_request("product detail")
                        .may_request("brand detail")
                        .may_request("supplier detail")


                // 从 品牌进去
//                .request("brand list in category").with_string("category id").with_last_record_id()
//                    .comments("从某个category跳过来,查看品牌方的页面").no_login().has_footprint()
//                    .got_page("brand list").list_of("card").title("品牌详情")
//                        .may_request("brand detail")

                .request("brand detail").with_string("brand id").with_string("category id")
                    .comments("从某个category查看品牌的详情: 首页-二级产品列表-品牌").no_login().has_footprint()
                    .got_page("brand detail").list_of("card").title("品牌详情")


                // 从 供应商 进去
//                .request("supplier list in category").with_string("category id")
//                    .comments("从某个category跳过来,查看供应商的页面").no_login().has_footprint()
//                    .got_page("supplier list").list_of("card").title("供应商详情")
//                        .may_request("supplier detail")

                .request("supplier detail").with_string("supplier id").with_string("category id")
                    .comments("从某个category查看供应商的详情: 首页-二级产品列表-供应商").no_login().has_footprint()
                    .got_page("supplier detail").list_of("card").title("供应商详情")


                // 产品详情页
                .request("product detail").with_string("product id").with_string("from")
                    .comments("查看产品详情页面").no_login().has_footprint()
                    .got_page("product detail").list_of("detail").title("产品详情")



                ///
                // 搜索
                .request("search").with_string("search key").with_string("tab name").with_last_record_id()
                    .comments("简单的全文搜索").no_login().has_footprint()
                    .got_page("search result").list_of("card").title("搜索结果")
                        .may_request("brand detail")
                        .may_request("supplier detail")


                ;
    }
}
