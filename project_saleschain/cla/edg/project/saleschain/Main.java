package cla.edg.project.saleschain;

import cla.edg.generator.PageFlowGenerator;
import cla.edg.pageflow.BasePageFlowDescriptionScript;
import cla.edg.pageflow.BasePageFlowScript;
import com.terapico.changerequest.generator.ChangeRequestGenerator;
import com.terapico.generator.GenrationResult;
import com.terapico.generator.Utils;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * main 方法的样例.
 *
 * 请参照此文件,构建自己的代码生成.
 *
 * 目录结构:
 * <ol>
 *     <li>当前目录: 存放所有的脚本入口文件<br/>
 *     		1. Main.java: 通常用Main表示总入口.<br/>
 *     		2. MainPageFlow.java: 页面流脚本 的主入口文件<br/>
 *     		3. MainChangeRequest.java: 表单脚本 的主入口文件<br/>
 *     </li>
 *     <li>
 *         ./query: 目录. 存放所有的查询脚本
 *     </li>
 *     <li>
 *         ./pageflow: 目录. 存放所有的页面流脚本
 *     </li>
 *     <li>
 *        ./cr: 目录. 存放所有的表单脚本
 *     </li>
 *     <li>
 *        ./gen: 目录. 中间过程中生成的代码目录, 不用去管它.
 *     </li>
 * </ol>
 */
public class Main {

	// 模型文件存放的目录, 指向 modeling 目录所在的文件夹
	public static String INPUT_MODEL_FOLDER = "/works/jobs/saleschain_v1/workspace/web-code-generator/sky";
	// 生成的模型文件存放的目录, 指向 modeling 目录所在的文件夹. 通常指向和 INPUT_MODEL_FOLDER 相同的位置
	public static String OUTPUT_MODEL_FOLDER = INPUT_MODEL_FOLDER;
	// 生成的 java 代码存放的目录, 指向目标工程中的一个 '源代码目录'. 通常指向 bizcore/WEB-INF/ 这样的目录
	public static String OUTPUT_JAVA_FOLDER = "/works/jobs/saleschain_v1/workspace/saleschain-biz-suite/bizcore/WEB-INF"; // /optical_client_src";
	// 生成的 page_flow 相关java源代码的(项目中)根目录, 通常指向 OUTPUT_JAVA_FOLDER 下的 xxx_custom_src. 因为项目迭代的关系,也可能需要额外指定目录
	public static String OUTPUT_PAGEFLOW_FOLDER_NAME = "saleschain_client_src";
	// 生成目标项目的 项目名, 通常与模型文件的项目名一致
	public static String TARGET_PROJECT_NAME = "saleschain";
	// 生成目标项目的 组织名, 通常与模型文件的组织名一致
	public static String TARGET_ORGANIZATION_NAME = "doublechaintech";
	// 生成的项目的基本包名, 通常是 com.<TARGET_ORGANIZATION_NAME>.<TARGET_PROJECT_NAME>
	public static String TARGET_BASE_PACKAGE_NAME = "com." + TARGET_ORGANIZATION_NAME +"." + TARGET_PROJECT_NAME;
	// 生成page_flow代码时,基类的完整类名
	public static String TARGET_PAGEFLOW_JAVA_PARENT_CLASS_FULL_NAME = "com.doublechaintech.saleschain.wxappclient.WxappCustomService";
	// 生成page_flow代码时,目标的bean名字, 通常就是 TARGET_PAGEFLOW_JAVA_PARENT_CLASS_FULL_NAME 原来的bean 名字
	public static String TARGET_PAGEFLOW_JAVA_BEAN_NAME = "wxappService";

	public static void main(String[] args) throws Exception {
		generatePageFlow(new MainPageFlow());
//		testV3EventService(new V3InkDeedService());
//		testV3EventService(new V3AuctionService());
        generateChangeRequestForm(new MainChangeRequest().getSpec());
	}

	private static void generatePageFlow(BasePageFlowDescriptionScript test) throws Exception {
		BasePageFlowScript script = test.getScript();
		String jsonStr = Utils.toJson(script, true);

		// System.out.println(jsonStr);
		
		PageFlowGenerator generator = new PageFlowGenerator();
		generator.setBaseOutputFolder(OUTPUT_JAVA_FOLDER +"/" + OUTPUT_PAGEFLOW_FOLDER_NAME);
		generator.setBaseTempalteFolder("./template");
		generator.generateWithScript(script);
	}

    private static void generateChangeRequestForm(Map<String, Map<String, Object>> script) throws Exception  {
        ChangeRequestGenerator generator = new ChangeRequestGenerator();
        generator.setChangeRequestSpec(script);
        generator.setProjectName(TARGET_PROJECT_NAME);
        generator.setOrgName(TARGET_ORGANIZATION_NAME);
        List<GenrationResult> files = generator.runJob();

        generator.saveToFiles( Utils.put("ALL", new File(OUTPUT_JAVA_FOLDER))
                .put("changeRequest.xml", new File(OUTPUT_MODEL_FOLDER)).into_map(File.class), files); // "changeRequest.xml"
    }
//	private static void testEventService(BaseEventScript testScript) throws Exception {
//		BaseEventScript  test = testScript;
//		EventScript script = test.getScript();
//		String jsonStr = Utils.toJson(script, true);
//
//		System.out.println(jsonStr);
//
//		EventScriptGenerator generator = new EventScriptGenerator();
//		generator.setBaseOutputFolder(OUTPUT_FOLDER);
//		generator.setBaseTempalteFolder("./template");
//		generator.generateWithScript(script);
//	}
}
