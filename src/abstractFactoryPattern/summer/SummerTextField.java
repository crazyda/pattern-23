/**
 * @Title: SummerTextField.java
 * @Package abstractFactoryPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年10月31日 下午10:34:56
 * @version V1.0
 */

package abstractFactoryPattern.summer;

import abstractFactoryPattern.TextField;

/**
 * @ClassName: SummerTextField
 * @Description: 
 * @Author Crazy
 * @DateTime 2019年10月31日 下午10:34:56 
 */

public class SummerTextField implements TextField {

	/*
	 * <p>Title: display</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年10月31日 下午10:34:56 
	 * @see abstractFactoryPattern.TextField#display() 
	 */

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("显示蓝色边框文本框");
	}

}
