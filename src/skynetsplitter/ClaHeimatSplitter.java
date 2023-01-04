package skynetsplitter;



public class ClaHeimatSplitter extends ClarionesBaseSplitter{

    @Override
    protected String getProjectFolderName() {
        return "heimat_v1";
    }

    @Override
    protected String getModelName() {
        return "heimat";
    }

    public static void main(String[] args) throws Exception {
//        String mode = "all";
//        String mode = "java";
//        	String mode = "form";
//        	String mode = "data";
//        	String mode = "query";
//        	String mode = "admin-ui";
        String mode = "project-script";

        new ClaHeimatSplitter().doCodeGeneration(mode);
    }


}
