package skynet;

public class ViewTask extends CodeGenTask{
    public void doTask() throws Exception{
        super.doTask();
        doSingleTask("meta");
        doSingleTask("view");
    }
}
