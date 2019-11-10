/**
 * @Title: SpringTextField.java
 * @Package abstractFactoryPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年10月31日 下午10:34:07
 * @version V1.0
 */

package abstractFactoryPattern.spring;

import abstractFactoryPattern.TextField;

/**
 * @ClassName: SpringTextField
 * @Description: 具体产品
 * @Author Crazy
 * @DateTime 2019年10月31日 下午10:34:07 
 */

public class SpringTextField implements TextField {

	/*
	 * <p>Title: display</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年10月31日 下午10:34:07 
	 * @see abstractFactoryPattern.TextField#display() 
	 */

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("显示绿色边框文本框");
	}

}
