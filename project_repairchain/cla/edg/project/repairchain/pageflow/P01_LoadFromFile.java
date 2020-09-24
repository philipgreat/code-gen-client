package cla.edg.project.repairchain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

import java.io.File;

public class P01_LoadFromFile extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        String fileName = "page_[\\d_]+\\.json";
        File baseFolder = new File("/works/jobs/project_script/workspace/project-script/projects/project_repairchain/resource");
            return script.load_page_flow_from(baseFolder, fileName)
                    .for_request("view agency factory detail")
                        .reset_params().with_string("agent id")
                        .with_string("factory id")

                    .for_request("view agency machine")
                        .reset_params().with_string("machine id")

                    .for_request("view work factory detail")
                        .reset_params().with_string("factory id")


                ;
    }
}
