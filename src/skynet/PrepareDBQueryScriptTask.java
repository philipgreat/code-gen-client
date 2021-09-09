package skynet;

public class PrepareDBQueryScriptTask extends CodeGenTask {
  public void doTask() throws Exception {
    super.doTask();
    //		doSingleTask("ui_form_spec");
    doSingleTask("prepare_db_query_script");
  }

  //  //	@Override
  //  protected String getDestPath(String name) {
  //    String x = super.getDestPath(name);
  //    System.out.println(
  //        "[DEBUG] default dest path of "
  //            + name
  //            + " is: "
  //            + x
  //            + ". I will to "
  //            + System.getProperty("skynet.output.basefolder.scripts"));
  //    return System.getProperty("skynet.output.basefolder.scripts");
  //  }
}
