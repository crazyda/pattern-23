/**
 * @Title: FileLoggerFactory.java
 * @Package factoryMethodPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年10月30日 下午10:13:58
 * @version V1.0
 */

package factoryMethodPattern.simple;

/**
 * @ClassName: FileLoggerFactory
 * @Description: 文件记录器 具体角色工厂
 * @Author Crazy
 * @DateTime 2019年10月30日 下午10:13:58 
 */

public class FileLoggerFactory implements LoggerFactory {

	/*
	 * <p>Title: createLogger</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年10月30日 下午10:13:58
	 * @return 
	 * @see factoryMethodPattern.LoggerFactory#createLogger() 
	 */

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		return new FileLogger();
	}

}
