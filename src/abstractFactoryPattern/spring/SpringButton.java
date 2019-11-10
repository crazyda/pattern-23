/**
 * @Title: SpringButton.java
 * @Package abstractFactoryPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年10月31日 下午10:31:06
 * @version V1.0
 */

package abstractFactoryPattern.spring;

import abstractFactoryPattern.Button;

/**
 * @ClassName: SpringButton
 * @Description: spring按钮类,充当具体产品
 * @Author Crazy
 * @DateTime 2019年10月31日 下午10:31:06 
 */

public class SpringButton implements Button {

	/*
	 * <p>Title: display</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年10月31日 下午10:31:06 
	 * @see abstractFactoryPattern.Button#display() 
	 */

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("显示浅绿色按钮");
	}

}
