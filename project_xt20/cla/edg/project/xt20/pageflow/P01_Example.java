package cla.edg.project.xt20.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

import java.io.File;

public class P01_Example extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        String fileName = "page_[\\d_]+\\.json";
        File baseFolder = new File("/works/jobs/xt20_v1/workspace/code-gen-client/project_xt20/resource");
        return script.load_page_flow_from(baseFolder, fileName)
                .request("view something").with_string("target id")
                    .comments("使用ID访问某个对象").need_login().no_footprint()
                    .got_page("some page").list_of("v-card").title("样例页面")

                .request("logout").comments("退出当前账号").no_login().no_footprint()
                    .got_page("home")
       ;
    }
}
