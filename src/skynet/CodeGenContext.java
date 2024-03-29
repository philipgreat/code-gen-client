package skynet;

public class CodeGenContext {
	public static final String MYSQL_EXEC_PATH_PARAM="skynet.mysql.path";
	public static final String MYSQL_DUMP_PATH_PARAM="skynet.mysqldump.path";
	
	public static final String MYSQL_USER_PARAM="skynet.mysql.user";
	public static final String MYSQL_PASSWORD_PARAM="skynet.mysql.password";
	public static final String MYSQL_SKIP_IMPORT_PARAM="skynet.mysql.skipimport";
	
	public static final String MODEL_PARAM="skynet.model";
	public static final String ENV_PARAM="skynet.env";
	public static final String USE_ENGLISH_PARAM="skynet.english";
	public static final String TRANSLATE_PARAM="skynet.translate";
	public static final String CODE_ENGINE_URL_PREFIX="skynet.engine.url.prefix";
	public static final String DRY_RUN="dry-run";
	//public static final String MODEL_PARAM="skynet.model";
	//public static final String MODEL_PARAM="skynet.model";
	
	
	public static CodeGenContext start() {
		
		CodeGenContext builder = new CodeGenContext();
		
		
		return builder;
		
		
		
	}
	public  CodeGenContext dryRun() {
		set(DRY_RUN,"true");
		return this;

	}
	public  boolean isDryRun() {
		return Boolean.parseBoolean(get("DRY_RUN","false"));

	}
	public  CodeGenContext withModel(String model) {
		set(MODEL_PARAM,model);
		return this;

	}
	public  CodeGenContext withURLPrefix(String urlPrefix) {
		set(CODE_ENGINE_URL_PREFIX,urlPrefix);
		return this;

	}
	public  CodeGenContext mysqlPassword(String model) {
		set(MYSQL_PASSWORD_PARAM,model);
		return this;

	}
	public  CodeGenContext mysqlUsername(String model) {
		set(MYSQL_USER_PARAM,model);
		return this;

	}
	public  CodeGenContext skipMysqlImport() {
		set(MYSQL_SKIP_IMPORT_PARAM,"yes");
		return this;
	}
	public  CodeGenContext mysqlExecPath(String model) {
		set(MYSQL_EXEC_PATH_PARAM,model);
		return this;

	}
	public  CodeGenContext mysqlDumpExecPath(String model) {
		set(MYSQL_DUMP_PATH_PARAM,model);
		return this;

	}
	public  CodeGenContext withXP() {
		set(ENV_PARAM,"xp");
		return this;
	}
	public  CodeGenContext withNop() {
		
		return this;
	}
	public  CodeGenContext withEnglish() {
		set(USE_ENGLISH_PARAM,"yes");
		return this;
	}
	public  boolean forEnglish() {
		return get(USE_ENGLISH_PARAM,"no").equals("yes");
	}
	public  boolean isSkippedMySQLImport() {
		return get(MYSQL_SKIP_IMPORT_PARAM,"no").equals("yes");
	}
	public  CodeGenContext ofEnv() {
		get(ENV_PARAM,null);
		return this;
	}
	public  CodeGenContext ofModel() {
		get(MODEL_PARAM,"b2b2c");
		return this;
	}
	protected void set(String key, String value) {
		System.setProperty(key,value);
	}
	protected String get(String key, String defultvalue) {
		return System.getProperty(key, defultvalue);
	}
	
	
	
}
