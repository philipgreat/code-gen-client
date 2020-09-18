package cla.edg.project.repairchain.pageflow;

import cla.edg.pageflow.PageFlowScript;
import cla.edg.pageflow.PieceOfScript;

public class P04_Machine extends PieceOfScript {
    public PageFlowScript makeSequel(PageFlowScript script) {
            return script
                .for_request("view worker machine detail")
                    .with_string("machine id")


                    ;
    }
}
