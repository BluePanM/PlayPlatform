package zgc.log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by 中秋月 on 2017/1/26.
 *
 * @author 中秋月
 * @author Mid_Autumn_moon
 *
 * 日志记录器，包装了Logging
 */
public class Log {
	public Log(String infor) {
		Logger logger = Logger.getLogger("PlayPlatform");
		Date date = new Date();

		// 优先级：消息
		logger.setLevel(Level.INFO);

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(date);
		String log = "[" + dateString + "] " + infor ;
		logger.info(log);
	}
}
