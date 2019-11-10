/**
 * @Title: OverdraftState.java
 * @Package statePattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����2:14:33
 * @version V1.0
 */

package statePattern;

/**
 * @ClassName: OverdraftState
 * @Description: ͸֧״̬��,�䵱����״̬��
 * @Author Crazy
 * @DateTime 2019��11��9�� ����2:14:33 
 */

public class OverdraftState extends AccountState {
	
	/*
	 * <p>Title: deposit</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��9�� ����2:14:33
	 * @param amount 
	 * @see statePattern.AccountState#deposit(double) 
	 */

	public OverdraftState(AccountState state) {
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
	 * @DateTime 2019��11��9�� ����2:14:33
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
	 * @DateTime 2019��11��9�� ����2:14:33 
	 * @see statePattern.AccountState#computeInterest() 
	 */

	@Override
	public void computeInterest() {
		// TODO Auto-generated method stub
		System.out.println("������Ϣ");
	}

	/*
	 * <p>Title: stateChect</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��9�� ����2:14:33 
	 * @see statePattern.AccountState#stateChect() 
	 */

	@Override
	public void stateCheck() {
		// TODO Auto-generated method stub
		if(acc.getBalance() > 0) {
			acc.setState(new NormalState(this));
		}else if(acc.getBalance() == -2000) {
			acc.setState(new RestrictedState(this));
		}else if(acc.getBalance() <-2000) {
			System.out.println("��������");
		}
	}

}
