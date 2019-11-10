package statePattern;

/**
 * 
 * @ClassName: AccountState
 * @Description: �˻�״̬��, �䵱����״̬�� 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����1:23:44
 */
public abstract class AccountState {
	
	protected Account acc;
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void computeInterest();
	public abstract void stateCheck();

}
