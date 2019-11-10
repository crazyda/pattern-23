/**
 * @Title: SpringTextField.java
 * @Package abstractFactoryPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��10��31�� ����10:34:07
 * @version V1.0
 */

package abstractFactoryPattern.spring;

import abstractFactoryPattern.TextField;

/**
 * @ClassName: SpringTextField
 * @Description: �����Ʒ
 * @Author Crazy
 * @DateTime 2019��10��31�� ����10:34:07 
 */

public class SpringTextField implements TextField {

	/*
	 * <p>Title: display</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��10��31�� ����10:34:07 
	 * @see abstractFactoryPattern.TextField#display() 
	 */

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("��ʾ��ɫ�߿��ı���");
	}

}
