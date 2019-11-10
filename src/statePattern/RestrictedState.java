/**
 * @Title: RestrictedState.java
 * @Package statePattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����2:19:15
 * @version V1.0
 */

package statePattern;

/**
 * @ClassName: RestrictedState
 * @Description: ����״̬��, �䵱����״̬��
 * @Author Crazy
 * @DateTime 2019��11��9�� ����2:19:15 
 */

public class RestrictedState extends AccountState {

	/*
	 * <p>Title: deposit</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��9�� ����2:19:15
	 * @param amount 
	 * @see statePattern.AccountState#deposit(double) 
	 */

	public RestrictedState(AccountState state) {
		super();
		this.acc = state.acc;
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
	 * @DateTime 2019��11��9�� ����2:19:15
	 * @param amount 
	 * @see statePattern.AccountState#withdraw(double) 
	 */

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		System.out.println("�˺�����,ȡ��ʧ��");
	}

	/*
	 * <p>Title: computeInterest</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��9�� ����2:19:15 
	 * @see statePattern.AccountState#computeInterest() 
	 */

	@Override
	public void computeInterest() {
		// TODO Auto-generated method stub
		System.out.println("������Ϣ");
	}

	/*
	 * <p>Title: stateCheck</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��9�� ����2:19:15 
	 * @see statePattern.AccountState#stateCheck() 
	 */

	@Override
	public void stateCheck() {
		// TODO Auto-generated method stub
		if(acc.getBalance() > 0) {
			acc.setState(new NormalState(this));
		}else if(acc.getBalance() > -2000) {
			acc.setState(new OverdraftState(this));
		}
	}

}
