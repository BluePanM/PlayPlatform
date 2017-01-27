package zgc.file;

import zgc.res.Results;
import zgc.res.StartScenePath;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

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
	private static LinkedList<Character> content = new LinkedList<>();    // 场景文件内容
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
			int str;
			while ((str = reader.read()) != -1) {
				// 存入数组
				content.add((char)str);
			}
			// 加入文件结尾标志符
			content.add(Results.EOL);
		} catch (Exception ioE) {
			System.out.println("出错啦！");
			ioE.printStackTrace();
		} finally {
			try {
				// 关闭资源
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	// 返回内容的链表
	public LinkedList<Character> getContent() {
		return content;
	}
}
