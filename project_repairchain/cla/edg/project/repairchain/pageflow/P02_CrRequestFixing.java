package cla.edg.project.repairchain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

import java.io.File;

public class P02_CrRequestFixing extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
            return script
//                .for_change_request("repair application")
//                    .reset_params().with_string("machine id")
//
//                .for_change_request("appointment application")
//                    .reset_params().with_string("machine id")
//
//                    .got_page("abd")

                    ;
    }
}
