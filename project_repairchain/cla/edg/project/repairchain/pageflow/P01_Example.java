package cla.edg.project.repairchain.pageflow;

import cla.edg.extfile.pageflow.PageFlowParser;
import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

import java.io.File;

public class P01_Example extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        return new PageFlowParser().addInputFile(new File("/works/jobs/repairchain_v1/workspace/code-gen-client/project_repairchain/resource/page_flow.ngm"))
                .parseFromFile(script)
                .for_request("view agency factory worker list")
                    .with_string(0,"factory id")

                ;
//        return script
//                .request_homepage() //.need_login()
//                    .got_home_page()
//                        .may_request("search")
//                        // .may_request("category detail")
//                        // .may_request("knowledge base footer")
//                        // .may_request("domestic trial footer")
//                .request("filter in homepage").with_string("brand id").variable().with_string("city id").variable().with_string("functionality id").variable()
//                    .comments("首页上简单的过滤: 首页").no_login()
//                    .got_home_page()
//                ;
    }
}
