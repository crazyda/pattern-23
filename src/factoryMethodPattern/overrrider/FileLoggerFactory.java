/**
 * @Title: FileLoggerFactory.java
 * @Package factoryMethodPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��10��30�� ����10:13:58
 * @version V1.0
 */

package factoryMethodPattern.overrrider;

/**
 * @ClassName: FileLoggerFactory
 * @Description: �ļ���¼�� �����ɫ����
 * @Author Crazy
 * @DateTime 2019��10��30�� ����10:13:58 
 */

public class FileLoggerFactory implements LoggerFactory {

	/*
	 * <p>Title: createLogger</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��10��30�� ����10:13:58
	 * @return 
	 * @see factoryMethodPattern.LoggerFactory#createLogger() 
	 */

	@Override
	public Logger createLogger() {
		// TODO Auto-generated method stub
		return new FileLogger();
	}

	@Override
	public Logger createLogger(String args) {
		// TODO Auto-generated method stub
		return new FileLogger();
	}

	@Override
	public Logger createLogger(Object obj) {
		// TODO Auto-generated method stub
		return new FileLogger();
	}
	
	

}
