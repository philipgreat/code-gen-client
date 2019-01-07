package skynet;

import java.io.File;
import java.net.URI;

public class AndroidV2Task extends CodeGenTask {

	public AndroidV2Task() {
		
	}
	
	
	public void doTask() throws Exception{
//		super.doTask();
		doSingleTask("android_app");
		doSingleTask("android_pojo");
	}


	@Override
	protected String getDestPath(String name) {
		if (name.equals("android_pojo")){
			String modelName = System.getProperty("skynet.model");
			String homePath = super.getHomePath();
			//homePath+="/java-web-tool-framework/naf/WEB-INF/androidPrj/";
			homePath+="/androidPrj/";
			return homePath+modelName.toLowerCase()+"Mobile/app/src/main/java/";
		}
		if (name.equals("android_app")){
			String modelName = System.getProperty("skynet.model");
			String homePath = super.getHomePath();
			//homePath+="/java-web-tool-framework/naf/WEB-INF/androidPrj/";
			homePath+="/androidPrj/";
			return homePath+modelName.toLowerCase()+"Mobile/";
		}
		return super.getDestPath(name);
	}


	@Override
	protected void doSingleTask(String name) throws Exception {
		String destPath = getDestPath(name);
		File dir=new File(destPath);
		CodeSplitter codeSplitter = new AndroidCodeSplitter();
		//String model = getModel();
		String fullURIPath = getSourceURI(name);
		URI fullURI = new URI(fullURIPath);
		codeSplitter.splitIntoFiles(fullURI, dir);
	}
	
	
	
}
