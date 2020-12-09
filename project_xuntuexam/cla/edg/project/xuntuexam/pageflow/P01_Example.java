package cla.edg.project.xuntuexam.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

import java.io.File;

public class P01_Example extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        String fileName = "page_[\\d_]+\\.json";
        File baseFolder = new File("/works/jobs/xuntuexam_v1/workspace/code-gen-client/project_xuntuexam/resource/pageflow");
        return script.load_page_flow_from(baseFolder, fileName)

                .for_request("do examing")
                    .with_string("enter code").variable()
                ;
    }
}
