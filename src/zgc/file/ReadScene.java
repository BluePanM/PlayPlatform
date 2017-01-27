package zgc.file;

import zgc.res.StartScenePath;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import zgc.Errors;

/**
 * Created by 中秋月 on 2017/1/27.
 *
 * @author 中秋月
 * @author Mid_Autumn_moon
 *
 * 场景文件（*.sen）读取
 */
public class ReadScene {
	private static String[] content = null;                 // sen文件的内容
	private static File sceneFile = null;                   // 文件
	private static BufferedReader reader = null;            // 读取器

	public ReadScene(String path) {
		try {
			sceneFile = new File(path);
			// 如果文件不存在
			if (! sceneFile.exists()) {
				Errors.error("文件不存在呦！ԅ(¯㉨¯ԅ)");
			}
			reader = new BufferedReader(new FileReader(sceneFile));
			String str;
			while (null != (str = reader.readLine())) {
				System.out.println(str);
			}
		} catch (Exception ioE) {
			ioE.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	// 取得内容
	public static String[] getContent() {
		return new String[]{"", ""};
	}
}
