/**
 * @Title: DatabaseLogger.java
 * @Package factoryMethodPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��10��30�� ����10:08:20
 * @version V1.0
 */

package factoryMethodPattern.overrrider;

/**
 * @ClassName: DatabaseLogger
 * @Description: ���ݿ���־��¼��,�䵱�����Ʒ��ɫ
 * @Author Crazy
 * @DateTime 2019��10��30�� ����10:08:20 
 */

public class DatabaseLogger implements Logger {

	/*
	 * <p>Title: writeLog</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��10��30�� ����10:08:20 
	 * @see factoryMethodPattern.Logger#writeLog() 
	 */

	@Override
	public void writeLog() {
		// TODO Auto-generated method stub
		System.out.println("���ݿ���־��¼");
	}

}
