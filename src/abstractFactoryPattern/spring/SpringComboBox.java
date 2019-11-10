/**
 * @Title: SpringComboBox.java
 * @Package abstractFactoryPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年10月31日 下午10:38:15
 * @version V1.0
 */

package abstractFactoryPattern.spring;

import abstractFactoryPattern.ComboBox;

/**
 * @ClassName: SpringComboBox
 * @Description: 
 * @Author Crazy
 * @DateTime 2019年10月31日 下午10:38:15 
 */

public class SpringComboBox implements ComboBox {

	/*
	 * <p>Title: display</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年10月31日 下午10:38:15 
	 * @see abstractFactoryPattern.ComboBox#display() 
	 */

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("显示绿色边框组合框");
	}

}
