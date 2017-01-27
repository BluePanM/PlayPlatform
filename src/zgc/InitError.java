package zgc;

import javax.swing.*;

/**
 * Created by 中秋月 on 2017/1/26.
 *
 * @author 中秋月
 * @author Mid_Autumn_moon
 */
class InitError {
	InitError() {
		// Log.log(...)
		JOptionPane.showMessageDialog(null, "没有启动所用的参数呦！╮(๑•́ ₃•̀๑)╭", "嗯", JOptionPane.ERROR_MESSAGE);
		System.exit(0);
	}
}
