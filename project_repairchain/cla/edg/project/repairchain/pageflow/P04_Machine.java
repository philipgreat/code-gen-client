package cla.edg.project.repairchain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class P04_Machine extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
            return script
                .for_request("view worker machine detail")
                    .with_string("machine id")

                .for_request("view repair record list")
                    .reset_params().with_string("machine id")
                    .with_string("tab name")
                    .with_last_record_id()

                .for_request("view planned task list")
                    .reset_params().with_string("machine id")
                    .with_string("tab name")
                    .with_last_record_id()

                .for_request("view machine task list")
                    .reset_params().with_string("machine id")
                    .with_string("tab name")
                    .with_last_record_id()

                .for_request("view machine list")
                    .reset_params()
                    .with_string("agent id")
                    .with_string("factory id")
                    .with_string("tab name")
                    .with_last_record_id()

                .for_request("report machine on")
                    .reset_params()
                    .with_string("machine id")
                .for_request("report machine off")
                    .reset_params()
                    .with_string("machine id")
                    ;
    }
}
