package cla.edg.project.saleschain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class P2_DemandPageFlow extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return script
                .request("demand footer").with_string("tab name").with_last_record_id()
                    .comments("查看我提交的需求列表").need_login().has_footprint()
                    .got_page("user demand list").list_of("card").title("需求列表")
                        .may_request("user demand detail")

                .request("user demand detail").with_string("demand id").with_string("filter")
                    .comments("查看我提交的需求详情").need_login().has_footprint()
                    .got_page("user demand detail").list_of("card").title("需求详情")
                        .may_request("user demand detail")

                .request("supplier demand list").with_string("tab name").with_last_record_id()
                    .comments("查看需要我处理的需求列表").need_login().has_footprint()
                    .got_page("supplier demand list").list_of("card").title("需求列表")
                        .may_request("supplier demand detail")

                .request("supplier demand detail").with_string("demand id").with_string("filter")
                    .comments("查看需要我处理的需求详情").need_login().has_footprint()
                    .got_page("supplier demand detail").list_of("card").title("需求详情")
                        .may_request("supplier demand detail")


                .request("supplier demand proposal list").with_string("tab name").with_last_record_id()
                    .comments("查看厂家的需求建议列表").need_login().has_footprint()
                    .got_page("supplier demand proposal list").list_of("card").title("需求列表")
                        .may_request("supplier demand proposal detail")

                .request("supplier demand proposal detail").with_string("proposal id")
                    .comments("查看厂家的需求建议详情").need_login().has_footprint()
                    .got_page("supplier demand proposal detail").list_of("card").title("需求详情")

                .request("user confirm connect").with_free_json_form()
                    .comments("用户确认对接完成").need_login().no_footprint()
                    .got_page("user demand detail")

                .request("user confirm deal").with_free_json_form()
                    .comments("用户确认交易完成").need_login().no_footprint()
                    .got_page("user demand detail")

                .request("supplier confirm connect").with_free_json_form()
                    .comments("供应商确认对接完成").need_login().no_footprint()
                    .got_page("supplier demand proposal detail")

                .request("supplier confirm deal").with_free_json_form()
                    .comments("供应商确认交易完成").need_login().no_footprint()
                    .got_page("supplier demand proposal detail")

                .request("supplier cancel connect").with_free_json_form()
                    .comments("供应商确认交易完成").need_login().no_footprint()
                    .got_page("supplier demand proposal detail")
                ;
    }
}