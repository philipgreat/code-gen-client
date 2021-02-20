package skynetsplitter;

public class Xt20Splitter extends ClarionesBaseSplitter {

    @Override
    protected String getProjectFolderName() {
        return "xt20_v1";
    }

    @Override
    protected String getModelName() {
        return "xt20";
    }

    public static void main(String[] args) throws Exception {
        String mode = "all";
//        String mode = "java";
        //	String mode = "form";
        //	String mode = "data";
        //	String mode = "query";
        //	String mode = "admin-ui";
        new Xt20Splitter().doCodeGeneration(mode);
    }

}