/**
 * @Title: FileLogger.java
 * @Package factoryMethodPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��10��30�� ����10:09:09
 * @version V1.0
 */

package factoryMethodPattern.simple;

/**
 * @ClassName: FileLogger
 * @Description: �ļ���־��¼,�嵭�����Ʒ��ɫ
 * @Author Crazy
 * @DateTime 2019��10��30�� ����10:09:09 
 */

public class FileLogger implements Logger {

	/*
	 * <p>Title: writeLog</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��10��30�� ����10:09:09 
	 * @see factoryMethodPattern.Logger#writeLog() 
	 */

	@Override
	public void writeLog() {
		// TODO Auto-generated method stub
		System.out.println("�ļ���־��¼");
	}

}
