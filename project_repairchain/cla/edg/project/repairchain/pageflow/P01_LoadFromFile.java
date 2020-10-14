package cla.edg.project.repairchain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

import java.io.File;

public class P01_LoadFromFile extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
        String fileName = "page_[\\d_]+\\.json";
        File baseFolder = new File("/works/jobs/project_script/workspace/project-script/projects/project_repairchain/resource");
            return script.load_page_flow_from(baseFolder, fileName)
                    .request("accept work job").with_string("work job id")
                        .comments("维修工人确认接单").need_login().no_footprint()
                        .got_page("work job")

                    .request("logout").comments("退出当前账号").no_login().no_footprint()
                        .got_home_page()
//                    .for_request("view agency factory detail")
//                        .reset_params().with_string("agent id")
//                        .with_string("factory id")

//                    .for_request("view agency machine")
//                        .reset_params().with_string("machine id")

//                    .for_request("view work factory detail")
//                        .reset_params().with_string("factory id")

//                    .for_request("view start stop list")
//                        .reset_params().with_last_record_id()

//                    .for_request("view machine list for ss")
//                        .reset_params()
//                        .with_string("factory id")

//                    .for_request("view machine start stop record list")
//                        .reset_params()
//                        .with_string("machine id")
//                        .with_last_record_id()

//                    .for_request("view machine list for ss")
//                        .reset_params()
//                        .with_string("factory id")
//                        .with_last_record_id()

//                    .for_request("view maintenance plan")
//                        .reset_params()
//                        .with_last_record_id()

//                    .for_request("qrcode scanned")
//                        .reset_params()
//                        .with_string("scanned qrcode")

                ;
    }
}
