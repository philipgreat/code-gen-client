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

                .for_request("submit cr add factory")
                    .with_string("agent id")
                    ;
    }
}
