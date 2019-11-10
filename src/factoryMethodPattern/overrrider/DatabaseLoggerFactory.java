/**
 * @Title: DatabaseLoggerFactory.java
 * @Package factoryMethodPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年10月30日 下午10:11:57
 * @version V1.0
 */

package factoryMethodPattern.overrrider;

/**
 * @ClassName: DatabaseLoggerFactory
 * @Description: 数据库日志记录器工厂类,充当具体工厂角色
 *  @Author Crazy
 * @DateTime 2019年10月30日 下午10:11:57 
 */

public class DatabaseLoggerFactory implements LoggerFactory {

	/*
	 * <p>Title: createLogger</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年10月30日 下午10:11:57
	 * @return 
	 * @see factoryMethodPattern.LoggerFactory#createLogger() 
	 */

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		Logger logger = new DatabaseLogger();
		return logger;
	}

	@Override
	public Logger createLogger(String args) {
		// 使用参数args 作为连接字符串来连接数据
		System.out.println(args);
		return new DatabaseLogger();
	}

	@Override
	public Logger createLogger(Object obj) {
		// 使用封装在参数obj 中的连接字符串来连接数据库
		return new DatabaseLogger();
	}

}
