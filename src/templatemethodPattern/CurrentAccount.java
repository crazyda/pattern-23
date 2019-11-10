/**
 * @Title: CurrentAccount.java
 * @Package templatemethodPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午4:37:18
 * @version V1.0
 */

package templatemethodPattern;

/**
 * @ClassName: CurrentAccount
 * @Description:  活期账户类,充当具体子类
 * @Author Crazy
 * @DateTime 2019年11月9日 下午4:37:18 
 */

public class CurrentAccount extends Account {

	/*
	 * <p>Title: calculateInterest</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年11月9日 下午4:37:18 
	 * @see templatemethodPattern.Account#calculateInterest() 
	 */

	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.println("按活期利率计算利息");

	}

}
