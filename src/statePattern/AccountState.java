package statePattern;

/**
 * 
 * @ClassName: AccountState
 * @Description: 账户状态类, 充当抽象状态类 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午1:23:44
 */
public abstract class AccountState {
	
	protected Account acc;
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void computeInterest();
	public abstract void stateCheck();

}
