package cla.edg.project.saleschain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class P1_HomePageFlow extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .request_homepage() //.need_login()
                    .got_home_page()
                        .may_request("category list")
                        .may_request("demand footer")
                        .may_request("knowledge base footer")
                        .may_request("domestic trial footer")
                        .may_request("search")

                .request("category list").with_string("functionality id").with_last_record_id()
                    .comments("查看二级产品类目列表").no_login().has_footprint()
                    .got_page("category list").list_of("card").title("二级产品类目列表")
                        .may_request("product list")
                        .may_request("brand list in category")
                        .may_request("supplier list in category")

//                .request("category level3 list").with_string("category lvl3 id").with_last_record_id()
//                    .comments("查看三级细分类目列表").no_login().has_footprint()
//                    .got_page("category level3 list").list_of("card").title("三级细分类目列表")

                // 从产品进去
                .request("product list").with_string("category id").with_last_record_id()
                    .comments("查看某个category下的产品列表").no_login().has_footprint()
                    .got_page("product detail").list_of("detail").title("产品详情")


                // 从 品牌进去
                .request("brand list in category").with_string("category id").with_last_record_id()
                    .comments("从某个category跳过来,查看品牌方的页面").no_login().has_footprint()
                    .got_page("brand list").list_of("card").title("品牌详情")
                        .may_request("brand detail")

                .request("brand detail").with_string("brand id").with_string("category id")
                    .comments("从某个category查看品牌的详情").no_login().has_footprint()
                    .got_page("product detail")


                // 从 供应商 进去
                .request("supplier list in category").with_string("category id")
                    .comments("从某个category跳过来,查看供应商的页面").no_login().has_footprint()
                    .got_page("supplier list").list_of("card").title("供应商详情")
                        .may_request("supplier detail")

                .request("supplier detail").with_string("supplier id").with_string("category id")
                    .comments("从某个category查看供应商的详情").no_login().has_footprint()
                    .got_page("product detail")


                // 产品详情页
                .request("product detail").with_string("product id").with_string("from")
                    .comments("查看产品详情页面").no_login().has_footprint()
                    .got_page("product detail").list_of("detail").title("产品详情")
                ;
    }
}
