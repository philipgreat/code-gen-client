package skynetsplitter;

import java.util.Arrays;

import skynet.*;


public class PowerSplitter {
	
	
	public static void main(String[] args) throws Exception {
		CodeGenContext context = CodeGenContext.start()
				//.withXP()
				.withNop();
				//.withXP();
		//context.withURLPrefix("http://t420.doublechaintech.cn:2080/sky/");
		//String models[]= {"ugc","cms","oms","payment","search","inventory","iam","pim"};
		
		if(args.length<1) {
			logln("Please add models to arguments");
			//return;
		}/**/
		
		//String models[]= args;
		String models[]= {"teachain"};
		//String models[]= {"retailscm"};

		Arrays.stream(models).forEach(model->{
			context.withModel(model);
			
			CodeGenTask tasks[]=new CodeGenTask[] {
					//new BackendFullTask(),
					new JavaTask(),
					//new JSPTask(),
					new ReactTask(),
					//new MySQLGenTask()
					//new PurePojoTask()
					};
			
			Arrays.stream(tasks).forEach(task->{
				try {
					run(task);
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}

			});
			
		});
		
		
		
		//printOutTempCommand(models);
		//printOutCommand(models);
		
		
	}
	private static void logln(String string) {
		System.out.println(string);
	}
	public static void testDouble(double a){
		
		
	}
	public static void printOutTempCommand(String[] models) {
		for(String model:models) {
			//logln("cd ~/githome && curl https://raw.githubusercontent.com/philipgreat/client-biz-suite/master/create.sh|bash -s "+model);
			logln("cd ~/githome/"+model+"-biz-suite/ && bash bizcore/cleangit.sh");

		}
	}
	
	public static void printOutCommand(String[] models) {
		
		
		
		
		
	
		
		/*
		cd ~/githome/oms-biz-suite/ && rsync -avz   bizcore/* philipz@philip.doublechaintech.cn:~/resin-3.1.12/webapps/oms/
		cd ~/githome/oms-biz-suite/ && rsync -avz   dist/* philipz@philip.doublechaintech.cn:~/resin-3.1.12/webapps/ROOT/admin/oms/

		*/
		logln("-------------------------Local Regular Time-------------------------------");
		
		
		for(String model:models) {
			//logln("cd ~/githome/pim-biz-suite/bizui/src && cp -Ra common launcher permission ~/githome/"+model+"-biz-suite/bizui/src");
			
			//logln("cd ~/githome/"+model+"-biz-suite/ && git reset --hard HEAD");
			
			logln("cd ~/githome/"+model+"-biz-suite/ && commit \"Update to new version\"");
			
			//logln("cd ~/githome/"+model+"-biz-suite/ && git pull");

		}
		logln("-------------------------Local Regular Time with Update CAF-------------------------------");
		
		
		for(String model:models) {
			//logln("cd ~/githome/pim-biz-suite/bizui/src && cp -Ra common launcher permission ~/githome/"+model+"-biz-suite/bizui/src");
			
			logln("cd ~/githome/ && cp -Ra skynet-common-app-framework/*  ~/githome/"+model+"-biz-suite/bizcore/");
			
			logln("cd ~/githome/"+model+"-biz-suite/ && commit \"Update to new version\"");
			
			//logln("cd ~/githome/"+model+"-biz-suite/ && git pull");

		}
		logln("-------------------------Remote Regular Time-------------------------------");
		
		
		for(String model:models) {
			//logln("cd ~/githome/pim-biz-suite/bizui/src && cp -Ra common launcher permission ~/githome/"+model+"-biz-suite/bizui/src");
			
			logln("cd ~/githome/"+model+"-biz-suite/ && git pull --allow-unrelated-histories && cd ../");
			//cd ~/githome/ugc-biz-suite/&& git pull --allow-unrelated-histories && cd ../
			//logln("cd ~/githome/"+model+"-biz-suite/ && git pull");

		}
		
		for(String model:models) {
			//logln("cd ~/githome && git clone https://github.com/doublechaintech/"+model+"-biz-suite.git");
			
			//logln("cd ~/githome/"+model+"-biz-suite/ && bash git-init.sh");

		}
		
		//rsync -avz  -e "ssh -p 4422"  githome/pim-biz-suite   philip@t420.doublechaintech.cn:~/githome/
		
		logln("-------------------------------Remote Regular Time-------------------------");
		
		for(String model:models) {
			logln("cd ~/githome/"+model+"-biz-suite/&& git pull --allow-unrelated-histories && cd ../");
			logln("cd ~/githome/"+model+"-biz-suite/bizcore&& gradle classes && cd ../../");
			logln("cd ~/githome/"+model+"-biz-suite/ && rsync -avz   bizcore/* philipz@philip.doublechaintech.cn:~/resin-3.1.12/webapps/"+model+"/");
			logln("ssh philipz@philip.doublechaintech.cn \"mysql -uroot -p0254891276 -h 127.0.0.1 < resin-3.1.12/webapps/"+model+"/WEB-INF/"+model+"_core_src/META-INF/"+model+"_mysql.sql\"");
			logln("cd ~/githome/"+model+"-biz-suite/bizui&& yarn install && yarn build && cd ../../");
			logln("cd ~/githome/"+model+"-biz-suite/bizui && rsync -avz   dist/* philipz@philip.doublechaintech.cn:~/resin-3.1.12/webapps/ROOT/admin/"+model+"/");
			
		}
		logln("-------------------------Local First Time-------------------------------");
		for(String model:models) {
			logln("cd ~/githome && curl https://raw.githubusercontent.com/philipgreat/client-biz-suite/master/create.sh|bash -s "+model);
			logln("cd ~/githome/"+model+"-biz-suite/ && bash git-init.sh");

		}
		logln("-------------------------------Remote First Time-------------------------");
		for(String model:models) {
			logln("cd ~/githome && git clone https://github.com/doublechaintech/"+model+"-biz-suite.git");
			logln("cd ~/githome/"+model+"-biz-suite/bizcore&& gradle classes && cd ../../");
			logln("cd ~/githome/"+model+"-biz-suite/bizui&& cp -Ra ~/githome/pim-biz-suite/bizui/src/common/* src/common/ ");
			logln("cd ~/githome/"+model+"-biz-suite/bizui&& yarn install && yarn build && cd ../../");
			logln("ssh philipz@philip.doublechaintech.cn \"mkdir ~/resin-3.1.12/webapps/"+model+"\"");
			logln("ssh philipz@philip.doublechaintech.cn \"mkdir ~/resin-3.1.12/webapps/ROOT/admin/"+model+"\"");
			
			
			logln("cd ~/githome/"+model+"-biz-suite/ && rsync -avz   bizcore/* philipz@philip.doublechaintech.cn:~/resin-3.1.12/webapps/"+model+"/");
			logln("cd ~/githome/"+model+"-biz-suite/bizui && rsync -avz   dist/* philipz@philip.doublechaintech.cn:~/resin-3.1.12/webapps/ROOT/admin/"+model+"/");
			
			logln("ssh philipz@philip.doublechaintech.cn \"mysql -uroot -p0254891276 -h 127.0.0.1 < resin-3.1.12/webapps/"+model+"/WEB-INF/"+model+"_core_src/META-INF/"+model+"_mysql.sql\"");
			
			
			//logln("cd ~/githome/"+model+"-biz-suite/bizcore&& gradle classes && cd ../../");
			
			
			//run(new FullTask());
			//run(new ReactTask());
		}
		
	}
	public static void run(CodeGenTask task) throws Exception{
		
		
		
		task.doStart();
		task.doTask();
		task.end();
		
	}

}

/*
// ssh    philipz@philip.doublechaintech.cn "mysql -uroot -p0254891276 -h 127.0.0.1 < resin-3.1.12/webapps/retailscm/WEB-INF/classes/META-INF/retailscm_mysql.sql"
for(String model:models) {
	//logln("cd ~/githome/"+model+"-biz-suite/&& commit \"Regenerated microservices code and tested\" && cd ..");
	//logln("cd ~/githome && git clone https://github.com/doublechaintech/"+model+"-biz-suite.git");
	logln("");
	//logln("cd ~/githome/"+model+"-biz-suite/&& git pull && cd ../");
	
	logln("cd ~/githome/"+model+"-biz-suite/bizcore&& gradle classes && cd ../../");
	logln("cd ~/githome/"+model+"-biz-suite/ && rsync -avz   bizcore/* philipz@philip.doublechaintech.cn:~/resin-3.1.12/webapps/"+model+"/");
	logln("cd ~/githome/"+model+"-biz-suite/bizui&& yarn install && yarn build && cd ../../");
	logln("ssh philipz@philip.doublechaintech.cn \"mysql -uroot -p0254891276 -h 127.0.0.1 < resin-3.1.12/webapps/"+model+"/WEB-INF/classes/META-INF/"+model+"_mysql.sql\"");
	
	
	//run(new FullTask());
	//run(new ReactTask());
}
for(String model:models) {
	logln("ssh philipz@philip.doublechaintech.cn \"mysql -uroot -p0254891276 -h 127.0.0.1 < resin-3.1.12/webapps/"+model+"/WEB-INF/classes/META-INF/"+model+"_mysql.sql\"");
	
}
for(String model:models) {
	logln("cd ~/githome/"+model+"-biz-suite/bizcore&& gradle copyJars && cd ../../");
	logln("cd ~/githome/"+model+"-biz-suite/ && rsync -avz   bizcore/* philipz@philip.doublechaintech.cn:~/resin-3.1.12/webapps/"+model+"/");
	
}
//String models[]= {"mini"};
		//String models[]= {"lsc"};
		//String models[]= {"retailscm"};
		//String models[]= {"cms"};
		//String models[]= {"pim"};
		//String models[]= {"ugc","inventory"};
		//String models[]= {"demodata"};
		//String models[]= {"his"};
		
		
*
*
*/


//System.out.println(context.forEnglish());

//run(new ReactTask());

//run(new FullTask());


//run(new JSPTask());
//run(new FullTaskWithoutDBImport());
//run(new ReactTask());
//run(new FullTask());
//run(new MySQLGenTask());

//run(new JavaTask());
//run(new JavaTask());

//Double a= null;
//testDouble(a);
