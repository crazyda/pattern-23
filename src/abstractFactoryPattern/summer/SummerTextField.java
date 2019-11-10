/**
 * @Title: SummerTextField.java
 * @Package abstractFactoryPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��10��31�� ����10:34:56
 * @version V1.0
 */

package abstractFactoryPattern.summer;

import abstractFactoryPattern.TextField;

/**
 * @ClassName: SummerTextField
 * @Description: 
 * @Author Crazy
 * @DateTime 2019��10��31�� ����10:34:56 
 */

public class SummerTextField implements TextField {

	/*
	 * <p>Title: display</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��10��31�� ����10:34:56 
	 * @see abstractFactoryPattern.TextField#display() 
	 */

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ��ɫ�߿��ı���");
	}

}
