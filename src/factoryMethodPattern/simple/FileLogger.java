/**
 * @Title: FileLogger.java
 * @Package factoryMethodPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年10月30日 下午10:09:09
 * @version V1.0
 */

package factoryMethodPattern.simple;

/**
 * @ClassName: FileLogger
 * @Description: 文件日志记录,冲淡具体产品角色
 * @Author Crazy
 * @DateTime 2019年10月30日 下午10:09:09 
 */

public class FileLogger implements Logger {

	/*
	 * <p>Title: writeLog</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年10月30日 下午10:09:09 
	 * @see factoryMethodPattern.Logger#writeLog() 
	 */

	@Override
	public void writeLog() {
		// TODO Auto-generated method stub
		System.out.println("文件日志记录");
	}

}
