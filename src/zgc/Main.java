package zgc;

import zgc.log.Log;
import zgc.scene.NewWindow;

/**
 * Created by 中秋月 on 2017/1/26.
 *
 * @author 中秋月
 * @author Mid_Autumn_moon
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Powered by Mid_Autumn_moon");
		// Log系统随后实现
		// TODO 实现log系统
		// Log.log(...)

		// 控制台参数
		if (args.length == 0) {
			new InitError();
		}
		new NewWindow(args);
	}
}