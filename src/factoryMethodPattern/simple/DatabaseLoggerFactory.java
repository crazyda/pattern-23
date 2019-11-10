/**
 * @Title: DatabaseLoggerFactory.java
 * @Package factoryMethodPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��10��30�� ����10:11:57
 * @version V1.0
 */

package factoryMethodPattern.simple;

/**
 * @ClassName: DatabaseLoggerFactory
 * @Description: ���ݿ���־��¼��������,�䵱���幤����ɫ
 *  @Author Crazy
 * @DateTime 2019��10��30�� ����10:11:57 
 */

public class DatabaseLoggerFactory implements LoggerFactory {

	/*
	 * <p>Title: createLogger</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��10��30�� ����10:11:57
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
