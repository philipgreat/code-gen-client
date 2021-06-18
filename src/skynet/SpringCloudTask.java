package skynet;

public class SpringCloudTask extends CodeGenTask{
    static  String TASK_NAME="springcloud";
    public void doStart() throws Exception{
        super.doStart();
    }
    public void doTask() throws Exception{
        doSingleTask(TASK_NAME);
    }
}
