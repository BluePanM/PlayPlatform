package zgc.file;

import zgc.res.StartScenePath;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by 中秋月 on 2017/1/27.
 *
 * @author 中秋月
 * @author Mid_Autumn_moon
 *
 * 场景文件（*.sen）读取
 */
public class ReadScene {
	private static File startSceneFile = null;
	private static BufferedReader reader = null;
	private static String[] sceneContent = null;
	// 返回文件内容的数组
	public static String[] getStartScene() {
		try {
			// 获取启动文件路径
			startSceneFile = new File(StartScenePath.getStartScenePath() + "开始.sen");
			// 读入字符
			reader = new BufferedReader(new FileReader(startSceneFile));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception anyE) {
			anyE.printStackTrace();
		}
		return new String[]{"", ""};
	}
}
