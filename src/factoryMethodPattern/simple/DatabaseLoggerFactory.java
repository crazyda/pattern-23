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

package factoryMethodPattern.simple;

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

}
