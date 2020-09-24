package cla.edg.project.repairchain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class P03_PersonalUser extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
            return script
                    .request("logout").comments("退出当前账号").no_login().no_footprint()
                        .got_home_page()

                    .for_request("view agent dashboard")
                        .with_string("agent id")

                    .for_request("view worker dashboard")
                        .with_string("factory id")

                    .for_request("view agency factory list")
                        .reset_params().with_string("agent id")
                        .with_string("tab name")
                        .with_last_record_id()

                    .for_request("view agency qrcode list")
                        .reset_params().with_string("agent id")
                        .with_string("tab name")
                        .with_last_record_id()

                    .for_request("view employee list")
                        .reset_params()
                        .with_string("agent id")
                        .with_string("factory id")
                        .with_string("tab name")
                        .with_last_record_id()

                    .for_request("view user task list")
                        .reset_params()
                        .with_string("factory id")
                        .with_string("tab name")
                        .with_last_record_id()

                    ;
    }
}
