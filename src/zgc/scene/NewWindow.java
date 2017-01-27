package zgc.scene;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * Created by 中秋月 on 2017/1/26.
 *
 * @author 中秋月
 * @author Mid_Autumn_moon
 */
public class NewWindow {
	private static final String platform = UIManager.getSystemLookAndFeelClassName();
	private static final int width = 1150;
	private static final int height = 647;
	private JFrame scene = new JFrame();

	public NewWindow(String[] arg) {
		scene.setSize(width, height);
		// 是的，这一大段代码是为了让窗口居中！
		Toolkit kit = Toolkit.getDefaultToolkit();                                  // 定义工具包
		Dimension screenSize = kit.getScreenSize();                                 // 获取屏幕的尺寸
		int screenWidth = screenSize.width/2;                                       // 获取屏幕的宽
		int screenHeight = screenSize.height/2;                                     // 获取屏幕的高
		int height = scene.getHeight();
		int width = scene.getWidth();
		scene.setLocation(screenWidth-width/2, screenHeight-height/2);

		scene.setTitle("初始化中……");
		scene.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.changeFont();

		// 更改外观与本地外观一致
		// Swing的外观实在是太吃藕了
		if (!UIManager.getLookAndFeel().getName().equals(platform)) {
			try {
				System.out.println(platform);
				UIManager.setLookAndFeel(platform);
			} catch (Exception e) {
				// TODO 这TMD一定要实现Log系统！
				// Log.log(...)
				System.out.println("错误！");
			}
		}
		scene.setVisible(true);

		JLabel jn = new JLabel("123dvfegvrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
		scene.add(jn);
		scene.validate();
	}
	private void changeFont() {
		Font definedFont = null;                        // 字体
		InputStream in = null;                          // 输入
		BufferedInputStream bin = null;                 // 感觉注释好没意思
	}
}
