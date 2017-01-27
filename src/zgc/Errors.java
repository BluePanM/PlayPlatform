package zgc;

import javax.swing.*;

/**
 * Created by 中秋月 on 2017/1/26.
 *
 * @author 中秋月
 * @author Mid_Autumn_moon
 */
public class Errors {
	public static void error(String message) {
		// Log.log(...)
		JOptionPane.showMessageDialog(null, message, "出错啦！", JOptionPane.ERROR_MESSAGE);
		System.exit(0);
	}
}
