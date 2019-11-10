/**
 * @Title: SpringButton.java
 * @Package abstractFactoryPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��10��31�� ����10:31:06
 * @version V1.0
 */

package abstractFactoryPattern.spring;

import abstractFactoryPattern.Button;

/**
 * @ClassName: SpringButton
 * @Description: spring��ť��,�䵱�����Ʒ
 * @Author Crazy
 * @DateTime 2019��10��31�� ����10:31:06 
 */

public class SpringButton implements Button {

	/*
	 * <p>Title: display</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��10��31�� ����10:31:06 
	 * @see abstractFactoryPattern.Button#display() 
	 */

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("��ʾǳ��ɫ��ť");
	}

}
