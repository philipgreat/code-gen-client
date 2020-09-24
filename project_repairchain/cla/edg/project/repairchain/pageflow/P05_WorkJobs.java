package cla.edg.project.repairchain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class P05_WorkJobs extends PieceOfScript {
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

                .for_request("report machine on")
                    .with_string("machine id")
                .for_request("report machine off")
                    .with_string("machine id")

                .for_request("submit cr repairing audit")
                    .reset_params()
                    .with_string("work job id")
                    .with_string("scene code")

                .for_request("submit cr update repair application")
                    .reset_params()
                    .with_string("work job id")
                    .with_string("application id")
                    ;
    }
}
