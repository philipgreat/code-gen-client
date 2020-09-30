package cla.edg.project.repairchain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

import java.io.File;

public class P02_CrRequestFixing extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
            return script
                .for_change_request("repair application")
                    .with_string("machine id")

                .for_change_request("appointment application")
                    .with_string("machine id")

                .for_change_request("add machine by agent")
                    .with_string("factory id")

                .for_change_request("machine bind qrcode")
                    .with_string("machine id")

                .for_change_request("unbound")
                    .with_string("machine id")

                .for_change_request("add factory")
                    .with_string("agent id")

                .for_change_request("assign worker")
                    .reset_params()
                    .with_string("work job id")

                .for_change_request("application audit")
                    .reset_params()
                    .with_string("work job id")
                    .with_string("scene code")

                .for_change_request("update repair application")
                    .reset_params()
                    .with_string("work job id")
                    .with_string("application id")

                .for_change_request("work record")
                    .reset_params()
                    .with_string("work job id")

                .for_change_request("report damage")
                    .reset_params().with_string("work job id")

                .for_change_request("audit repair")
                    .reset_params()
                    .with_string("work job id")
                    .for_change_request("repairing feedback")
                    .reset_params()
                    .with_string("work job id")

                .for_change_request("add employee by agent")
                    .reset_params()
                    .with_string("factory id")
                    .with_string("agent id")
                    ;
    }
}
