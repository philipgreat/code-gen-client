package cla.edg.project.heimat.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;
import java.io.File;

public class P01_Example extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        String fileName = "page_[\\d_]+\\.json";
        File baseFolder = new File("/works/jobs/project_script/workspace/project-script/projects/project_repairchain/resource");
        return script.load_page_flow_from(baseFolder, fileName)
                .request("view something").with_string("target id")
                    .comments("使用ID访问某个对象").need_login().no_footprint()
                    .got_page("some page").list_of("v-card").title("样例页面")

                .request("logout").comments("退出当前账号").no_login().no_footprint()
                    .got_page("some page")
       ;
    }
}
