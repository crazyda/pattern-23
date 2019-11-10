/**
 * @Title: DatabaseLogger.java
 * @Package factoryMethodPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年10月30日 下午10:08:20
 * @version V1.0
 */

package factoryMethodPattern.overrrider;

/**
 * @ClassName: DatabaseLogger
 * @Description: 数据库日志记录器,充当具体产品角色
 * @Author Crazy
 * @DateTime 2019年10月30日 下午10:08:20 
 */

public class DatabaseLogger implements Logger {

	/*
	 * <p>Title: writeLog</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年10月30日 下午10:08:20 
	 * @see factoryMethodPattern.Logger#writeLog() 
	 */

	@Override
	public void writeLog() {
		// TODO Auto-generated method stub
		System.out.println("数据库日志记录");
	}

}
