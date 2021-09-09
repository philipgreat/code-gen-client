package skynetsplitter;

import skynet.*;

public class ClaTeachainSplitter extends ClarionesBaseSplitter{

    @Override
    protected String getProjectFolderName() {
        return "teachain_v1";
    }

    @Override
    protected String getModelName() {
        return "teachain";
    }

    public static void main(String[] args) throws Exception {
        String mode = "all";
//        String mode = "java";
//        	String mode = "form";
//        	String mode = "data";
        //	String mode = "query";
//        	String mode = "admin-ui";
        new ClaTeachainSplitter().doCodeGeneration(mode);
    }

}
