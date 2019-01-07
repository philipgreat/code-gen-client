package skynet;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MoveToSubFolder {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MoveToSubFolder move =new  MoveToSubFolder();
		move.moveFolder("/Users/Philip/githome/java-web-tool-framework/naf/coreview");
		move.moveFolder("/Users/Philip/githome/java-web-tool-framework/naf/cafview");
		//move.moveFolder("/Users/Philip/githome/java-web-tool-framework/naf/customview");
		
	}
	public void moveFolder(String parentFolder) throws IOException{
		File rootDir=new File(parentFolder);
		if(rootDir.isFile()){
			throw new IllegalArgumentException("The folder "+parentFolder+" is expected as a dir");
			
		}
		
		File []fileList=rootDir.listFiles();
		for(File file: fileList){
			moveSingleFile(rootDir, file);
		}
	}
	protected void moveSingleFile(File rootDir,File file) throws IOException{
		log(file.getAbsolutePath());

		
		String name = file.getName();
		if(!name.endsWith(".jsp")){
			return;
		}
		String []segs = name.split("\\.");
		if(segs.length<3){
			return;
		}
		log(file.getName());
		log(join(segs,segs.length-1, "/")+"."+"jsp");
		String newFilePath = join(segs,segs.length-1, "/")+"."+"jsp";
		File newFile = new File(rootDir.getAbsoluteFile(),newFilePath);
		if(!newFile.getParentFile().exists()){
			newFile.getParentFile().mkdirs();
		}
		
		//Files.copy(source, target, options)
		Files.copy(file.toPath(), newFile.toPath());
		
	}
	public  String join(String []array,int end, String joinStr){
		if(end > array.length){
			throw new IllegalArgumentException("end is bigger than length");
			
		}
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=0; i< end; i++){
			if(i>0){
				stringBuilder.append(joinStr);
			}
			stringBuilder.append(array[i]);
		}
		return stringBuilder.toString();
	}
	protected void log(String message){
		System.out.println(message);
	}

}
