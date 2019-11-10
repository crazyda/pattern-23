/**
 * @Title: SummerButton.java
 * @Package abstractFactoryPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年10月31日 下午10:31:53
 * @version V1.0
 */

package abstractFactoryPattern.summer;

import abstractFactoryPattern.Button;

/**
 * @ClassName: SummerButton
 * @Description: SummerButton 按钮类,充当具体产品
 * @Author Crazy
 * @DateTime 2019年10月31日 下午10:31:53 
 */

public class SummerButton implements Button {

	/*
	 * <p>Title: display</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年10月31日 下午10:31:53 
	 * @see abstractFactoryPattern.Button#display() 
	 */

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("显示浅蓝色按钮");
	}

}
