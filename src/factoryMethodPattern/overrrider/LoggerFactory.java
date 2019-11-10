/**
 * @Title: LoggerFactory.java
 * @Package factoryMethodPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��10��30�� ����10:10:02
 * @version V1.0
 */

package factoryMethodPattern.overrrider;

/**
 * @ClassName: LoggerFactory
 * @Description: ��־��¼�������ӿ�, �䵱���󹤳���ɫ
 * @Author Crazy
 * @DateTime 2019��10��30�� ����10:10:02 
 */

public interface LoggerFactory {
	public Logger createLogger();
	public Logger createLogger(String args);
	public Logger createLogger(Object obj);
}
