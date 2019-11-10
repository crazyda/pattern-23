package proxyPattern;

/**
 * 
 * @ClassName: Logger
 * @Description: 日记记录类, 保存日志 
 * @Author Crazy
 * @DateTime 2019年11月6日 下午8:47:35
 */
public class Logger {
	public void log(String userId) {
		System.out.println("更新数据库,用户"+userId+"查询次数加1");
	}
}
