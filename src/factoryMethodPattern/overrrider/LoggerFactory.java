/**
 * @Title: LoggerFactory.java
 * @Package factoryMethodPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年10月30日 下午10:10:02
 * @version V1.0
 */

package factoryMethodPattern.overrrider;

/**
 * @ClassName: LoggerFactory
 * @Description: 日志记录器工厂接口, 充当抽象工厂角色
 * @Author Crazy
 * @DateTime 2019年10月30日 下午10:10:02 
 */

public interface LoggerFactory {
	public Logger createLogger();
	public Logger createLogger(String args);
	public Logger createLogger(Object obj);
}
