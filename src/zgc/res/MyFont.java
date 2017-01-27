package zgc.res;

import java.awt.*;

/**
 * Created by 中秋月 on 2017/1/27.
 *
 * @author 中秋月
 * @author Mid_Autumn_moon
 *
 * 就是返回一个Font对象，字体用。
 */
public class MyFont {
	public static Font getMyFont(int fontSize) {
		Font font;
		try {
			font = new Font("微软雅黑", Font.PLAIN, fontSize);
		} catch (Exception e) {
			// Log.log(...)
			font = new Font("宋体", Font.PLAIN, fontSize);
		}
	return font;
	}
}
