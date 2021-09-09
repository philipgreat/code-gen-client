package skynet;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class BackendFullTask extends  FullTask{
    public void doTask() throws Exception{



        super.doTask();



    }
    protected String executeCommand() throws IOException {

        String execPath="/usr/local/bin/gradle";

        ProcessBuilder pb = new ProcessBuilder(execPath,"classes");
        //.redirectOutput(Redirect.INHERIT).redirectInput(Redirect.PIPE);
        pb.directory(new File(sourcePath()));
        this.log("Trying to execute command: "+ execPath +"under "+ sourcePath() );



        //pb.toString();

        Process p = pb.start();
        inheritIO(p.getInputStream(), System.out);
        inheritIO(p.getErrorStream(), System.err);



        OutputStream pos = p.getOutputStream();

        pos.close();

        return "";

        //return output.toString();

    }


    public void buildBackend(){



    }

}
