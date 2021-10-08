package skynet;

import java.io.File;
import java.net.URI;

public class SpringCloudJspTask extends CodeGenTask{
    static  String TASK_NAME="springcloud";
    public void doStart() throws Exception{
//        super.doStart();
    }
    public void doTask() throws Exception{
        String destPath = getDestPath(TASK_NAME);
        File dir = new File(destPath);
        CodeSplitter codeSplitter = new CodeSplitter();
        //String model = getModel();
        String fullURIPath = "http://localhost:8080/springboot?name=bank&task=all";
        URI fullURI = new URI(fullURIPath);
        codeSplitter.splitIntoFiles(fullURI, dir);
    }
}
