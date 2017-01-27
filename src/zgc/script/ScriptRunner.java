package zgc.script;

import zgc.res.MyFont;

import javax.swing.*;

/**
 * Created by 中秋月 on 2017/1/27.
 *
 * @author 中秋月
 * @author Mid_Autumn_moon
 *
 * 脚本驱动器
 */
public class ScriptRunner {
	private Parser parser = new Parser();
	public ScriptRunner() {
		run();
	}
	private void run() {
		System.out.println("scriptRunner");
	}
}
