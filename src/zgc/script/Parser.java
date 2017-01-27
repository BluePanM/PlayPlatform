package zgc.script;

import zgc.file.ReadMedia;
import zgc.file.ReadScene;
import zgc.res.StartScenePath;

/**
 * Created by 中秋月 on 2017/1/27.
 *
 * @author 中秋月
 * @author Mid_Autumn_moon
 *
 * 脚本语法解析器
 */
class Parser {
	Parser() {
		// 开始场景
		ReadScene sceneSource = new ReadScene(StartScenePath.getStartScenePath() + "开始.sen");
	}
}
