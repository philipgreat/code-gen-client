package skynet;

public class DataCompassTask extends CodeGenTask {


    public void doTask() throws Exception {
        //doSingleTask("download-datacompass-framework");
        super.doTask();
        doSingleTask("data-compass");
    }
}