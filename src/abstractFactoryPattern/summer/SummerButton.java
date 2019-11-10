/**
 * @Title: SummerButton.java
 * @Package abstractFactoryPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��10��31�� ����10:31:53
 * @version V1.0
 */

package abstractFactoryPattern.summer;

import abstractFactoryPattern.Button;

/**
 * @ClassName: SummerButton
 * @Description: SummerButton ��ť��,�䵱�����Ʒ
 * @Author Crazy
 * @DateTime 2019��10��31�� ����10:31:53 
 */

public class SummerButton implements Button {

	/*
	 * <p>Title: display</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��10��31�� ����10:31:53 
	 * @see abstractFactoryPattern.Button#display() 
	 */

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("��ʾǳ��ɫ��ť");
	}

}
