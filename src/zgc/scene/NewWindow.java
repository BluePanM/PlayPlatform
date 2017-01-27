package zgc.scene;

import com.sun.javafx.tk.FontLoader;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

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
	JFrame scene = new JFrame();

	public NewWindow(String[] args) {
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

		// 更改外观与本地外观一致
		// Swing的外观实在是太吃藕了
		if (!UIManager.getLookAndFeel().getName().equals(platform)) {
			try {
				// System.out.println(platform);
				UIManager.setLookAndFeel(platform);
			} catch (Exception e) {
				// TODO 这TMD一定要实现Log系统！
				// Log.log(...)
				System.out.println("错误！");
			}
		}
		scene.setVisible(true);
		// Log系统
		// Log.log(...)
		// 从这里，就开始由用户脚本驱动了
		new SceneRender(scene, args);
	}
}
