package skynet;

import java.io.File;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;


public class CodeGenTask {

	//protected URI sourceURI;
	//protected String destPath;
	public static final String MYSQL_EXEC_PATH_PARAM = "skynet.mysql.path";
	public static final String MYSQL_DUMP_PATH_PARAM = "skynet.mysqldump.path";

	public static final String MYSQL_USER_PARAM = "skynet.mysql.user";
	public static final String MYSQL_PASSWORD_PARAM = "skynet.mysql.password";
	public static final String CODE_ENGINE_URL_PREFIX = "skynet.engine.url.prefix";

	protected String model = "b2b2c";

	public void doStart() throws Exception {
		System.setProperty("file.encoding", "UTF-8");
		log("start task with model: " + this.getModel() + "");
		doSingleTask("report");


	}

	public void end() {
		log("Job for model: " + this.getModel() + " is done!");
	}

	private long previousTime = System.currentTimeMillis();

	protected void log(String string) {
		long currentTime = System.currentTimeMillis();
		long span = currentTime - previousTime;
		//System.out.println("(+"+span+")"+this.getClass().getSimpleName()+": "+string);
		System.out.printf("+%10d %-30s %s\n", span, getClass().getSimpleName(), string);

		previousTime = currentTime;

	}

	public void doTask() throws Exception {
		doSingleTask("report");
	}

	protected void doSingleTask(String name) throws Exception {
		String destPath = getDestPath(name);
		File dir = new File(destPath);
		CodeSplitter codeSplitter = new CodeSplitter();
		//String model = getModel();
		String fullURIPath = getSourceURI(name);
		URI fullURI = new URI(fullURIPath);
		codeSplitter.splitIntoFiles(fullURI, dir);
	}

	protected String getURIPrefix() {
		String prefix = "http://localhost:8080/sky/";

		String candidates[] = {
				System.getProperty(CODE_ENGINE_URL_PREFIX),
				prefix};
		return this.firstNotNull(candidates);


	}

	protected String getHomePath() {
		String homeDir = System.getProperty("user.home");
		String customOutputFolder = System.getProperty("skynet.output.basefolder");
		if (customOutputFolder == null || customOutputFolder.isEmpty()) {
			return homeDir + "/githome";
		}
		return customOutputFolder;
	}
	/**/


	protected String baseDestFolder() {
		/*
		String customDestFoler = System.getProperty("skynet.output.basefolder");

		if(customDestFoler!=null){
			return customDestFoler;
		}

		String homePath = System.getProperty("user.home");

		return homePath+"/githome";

		*/

		String candidates[] = {
				System.getProperty("skynet.output.basefolder"),
				System.getProperty("user.home") + "/githome"};
		return this.firstNotNull(candidates);


	}

	//每个名字都叫做
	protected String respositoryNameOf(String modelName) {

		return modelName + "-biz-suite";

	}
	protected String subDestFolder(String outputName){
		
		Map<String, String > pathMap = new HashMap<String,String>();
		pathMap.put("mysql", "data");
		pathMap.put("jsp", "bizcore");
		pathMap.put("java", "bizcore/");
		pathMap.put("dict", "./");
		pathMap.put("react", "bizui");
		pathMap.put("bigdata", "databrain");
		pathMap.put("taro", "nice-router-taro");
		pathMap.put("springcloud", "springcloud");

		String path = pathMap.get(outputName);
		if (path != null) {
			return path;
		}
		return "bizcore/";

	}


	protected String joinArray(String delimiter, Object[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < args.length; i++) {
			if (i > 0) {
				stringBuilder.append(delimiter);
			}
			stringBuilder.append(args[i]);
		}
		return stringBuilder.toString();

	}


	protected String getDestPath(String name) {
		verifyNameOf(name);

		if (System.getProperty("skynet.experiment") != null) {
			return this.getXPPath(name);
		}

		String outputPath = System.getProperty("codegen." + name + ".output");
		if (outputPath != null) {
			return outputPath;
		}
		String[] folders = {this.baseDestFolder(), this.getModel() + "-biz-suite", subDestFolder(name)};

		return this.joinArray("/", folders);

	}


	protected String verifyNameOf(String name) {
		// TODO Auto-generated method stub
		ensureComponentPath();
		String componentPath = componentMap.get(name);

		if (componentPath == null) {
			throw new IllegalArgumentException(
					"Could not find the dest component path for: " + componentPath);
		}
		return componentPath;
	}

	private Map<String, String> componentMap;

	// 老的中台
	static final String JSP = "jsp/jsp_app_index.jsp";
	//中台
	static final String REACT = "react/dva_app_index.jsp";
	static final String REACT_XP = "react/dva_app_index_xp.jsp";

	static final String POJO_WORK = "javaweb/java_basic_index.jsp";
	static final String JAVA = "javaweb/java_app_index.jsp";
	static final String JAVA_XP = "javaweb/java_app_index_xp.jsp";
	static final String WXA_RENDER = "dssc_lab/wxa_render_index.jsp";

	static final String TARO = "taro/taro_index.jsp";

	static final String SPRING_CLOUD = "springcloud/index.jsp";

	// form 元数据
	static final String UI_FORM_SPEC = "uiform/ui_form_spec_index.jsp";
	// form processor
	static final String UI_FORM_GEN = "uiform/ui_form_gen_index.jsp";


	static final String PREPARE_QUERY_SCRIPT = "gen_script/gen_script_index.jsp";
	// rdms query
	static final String PREPARE_DB_QUERY_SCRIPT = "gen_script/gen_script_db_index.jsp";

//	static final String IOS 	= "ios/ios_app_index.jsp";

	// mock 数据
	static final String MYSQL = "database/mysql.jsp";

	static final String DATA_SPEC = "javaweb/data_specification.jsp";

	static final String REPORT = "javaweb/report.jsp";

	static final String DICT = "locale/dictionary.jsp";

	//	static final String ANDROID 	= "android/android_app_index.jsp";
//	static final String ANDROID_APP 	= "android_app/android_app_index.jsp";
//	static final String ANDROID_POJO 	= "android_pojo/android_pojo_index.jsp";
	// db 脚本，用处出不多
	static final String MYSQL_INIT = "javaweb/init_data_by_mysql.jsp";

	static final String BIGDATA = "bigdata/bigdata_app_index.jsp";
	static final String DATACOMPASS = "datacompass/compass_app_index.jsp";

	static final String MOBILE_APP_BACKEND = "javaweb/mobile_app_backend_index.jsp";

	protected String getFinalPath(String path) {
		String env = System.getProperty("skynet.env");
		if (env == null) {
			return path;
		}

		int lastDot = path.lastIndexOf('.');
		if (lastDot < 0) {
			return path;
		}

		return path.substring(0, lastDot) + "_" + env + path.substring(lastDot);


	}

	protected void ensureComponentPath() {
		if (componentMap == null) {
			componentMap = new HashMap<String, String>();
			componentMap.put("jsp", JSP);
			componentMap.put("react", getFinalPath(REACT));
			componentMap.put("pojo_work", POJO_WORK);

			componentMap.put("java", getFinalPath(JAVA));

			componentMap.put("taro", getFinalPath(TARO));

//			componentMap.put("ios", IOS);
			componentMap.put("mysql", MYSQL);
			componentMap.put("data_spec", DATA_SPEC);
			componentMap.put("report", REPORT);
			componentMap.put("dict", DICT);
//			componentMap.put("android", ANDROID);
//			componentMap.put("android_app", ANDROID_APP);
//			componentMap.put("android_pojo", ANDROID_POJO);

			componentMap.put("mysql_init", MYSQL_INIT);
			componentMap.put("bigdata", BIGDATA);
			componentMap.put("data-compass", DATACOMPASS);

			componentMap.put("wxa_render", WXA_RENDER);
			componentMap.put("ui_form_spec", UI_FORM_SPEC);
			componentMap.put("ui_form_gen", UI_FORM_GEN);

			componentMap.put("prepare_query_script", PREPARE_QUERY_SCRIPT);
			componentMap.put("prepare_db_query_script", PREPARE_DB_QUERY_SCRIPT);

			componentMap.put("mobile_app_backend", MOBILE_APP_BACKEND);

			componentMap.put("springcloud", SPRING_CLOUD);
		}
	}

	protected String getSourceURI(String name) {
		CodeGenContext context = CodeGenContext.start();

		String componentPath = verifyNameOf(name);
		String fullPath =
				this.getURIPrefix() + componentPath + "?name=" + this.getModel() + "&english=" + context
						.forEnglish();
		return fullPath;

	}

	protected String firstNotNull(String[] values) {

		for (String m : values) {
			if (m == null) {
				continue;
			}
			return m;
		}

		return null;
	}

	protected String getModel() {

		String[] models = {System.getProperty("skynet.model"), System.getenv("SKYNET_MODEL"), model};

		return this.firstNotNull(models).replace('_', '-');

	}

	private static String OS = System.getProperty("os.name").toLowerCase();

	protected boolean isWindows() {
		return (OS.indexOf("win") >= 0);
	}

	protected boolean isMac() {
		return (OS.indexOf("mac") >= 0);
	}

	protected boolean isUnix() {
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0);
	}

	protected boolean isSolaris() {
		return (OS.indexOf("sunos") >= 0);
	}

	protected String getXPPath(String name) {
		verifyNameOf(name);

		String homePath = System.getProperty("user.home");
		String customDestFoler = System.getProperty("skynet.output.basefolder");
		if (customDestFoler == null || customDestFoler.isEmpty()) {
			homePath = homePath + "/githome";
		} else {
			homePath = customDestFoler;
		}

		//Windows is not working well;
		///Users/Philip/githome/java-web-tool-framework/naf/WEB-INF/
		if (name.equals("jsp")) {
			return homePath + "/java-web-tool-framework/naf/";

		}
		if (name.equals("react")) {
			return homePath + "/ant-design-pro/";
		}

		System.out.println("xfadfasdf" + name);

		if (name.equals("taro")) {
			return homePath + "/nice-router-taro/";
		}

		/*
		if(name.equals("dict")){
			return SystemConfig.getSkyHome()+"/dictionary/";

		}*/
		if (name.equals("bigdata")) {
			return homePath + "/java-web-tool-framework/naf/bigdata";
		}
		return homePath + "/java-web-tool-framework/naf/WEB-INF/";

	}

}
