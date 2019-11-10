/**
 * @Title: NormalState.java
 * @Package statePattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午1:27:55
 * @version V1.0
 */

package statePattern;

/**
 * @ClassName: NormalState
 * @Description: 正常状态类, 充当具体状态类
 * @Author Crazy
 * @DateTime 2019年11月9日 下午1:27:55 
 */

public class NormalState extends AccountState {

	
	/*
	 * <p>Title: deposit</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年11月9日 下午1:27:55
	 * @param amount 
	 * @see statePattern.AccountState#deposit(double) 
	 */

	public NormalState(AccountState state) {
		super();
		this.acc =state.acc;
		// TODO Auto-generated constructor stub
	}

	public NormalState(Account acc) {
		super();
		this.acc = acc;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		acc.setBalance(acc.getBalance()+amount);
		stateCheck();
	}


	/*
	 * <p>Title: withdraw</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年11月9日 下午1:27:55
	 * @param amount 
	 * @see statePattern.AccountState#withdraw(double) 
	 */

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		acc.setBalance(acc.getBalance()-amount);
		stateCheck();
	}

	/*
	 * <p>Title: computeInterest</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年11月9日 下午1:27:55 
	 * @see statePattern.AccountState#computeInterest() 
	 */

	@Override
	public void computeInterest() {
		// TODO Auto-generated method stub
		System.out.println("正常状态,无须支付利息");
	}

	/*
	 * <p>Title: stateChect</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年11月9日 下午1:27:55 
	 * @see statePattern.AccountState#stateChect() 
	 */

	@Override
	public void stateCheck() {
		// TODO Auto-generated method stub
		if(acc.getBalance() > -2000 && acc.getBalance() <=0) {
			acc.setState(new OverdraftState(this));
		}else if(acc.getBalance() == -2000) {
			acc.setState(new RestrictedState(this));
		}else if(acc.getBalance() < -2000) {
			System.out.println("操作受限");
		}
	}

}
