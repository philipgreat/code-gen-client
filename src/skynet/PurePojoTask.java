package skynet;

public class PurePojoTask extends CodeGenTask {
    static  String TASK_NAME="pure_pojo_work";
    public void doStart() throws Exception{
        super.doStart();
        //log("mysql task source file will be: "+ getSourceSQLFilePath());
    }
    public void doTask() throws Exception{
        super.doTask();
        doSingleTask(TASK_NAME);
    }
}