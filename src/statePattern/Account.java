package statePattern;

/**
 * 
 * @ClassName: Account
 * @Description: 银行账户,充当环境类 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午1:19:29
 */
public class Account {
	private AccountState state; //维持一个对抽象状态对象的引用
	private String owner ;// 开户名
	private double balance = 0;//账户余额
	public Account(String owner, double balance) {
		super();
		this.owner = owner;
		this.balance = balance;
		this.state = new NormalState(this);
		System.out.println(this.owner+"开户,初始金额为:"+balance);
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setState(AccountState state) {
		this.state = state;
	}
	
	public void deposit(double amount) {
		System.out.println(this.owner+"存款"+amount);
		state.deposit(amount);
		System.out.println("现在余额为:"+this.balance);
		System.out.println("现在账户状态"+this.state.getClass().getName());
		
	}
	
	
	public void withdraw(double amount) {
		System.out.println(this.owner+"取款"+amount);
		state.withdraw(amount);
		System.out.println("现在余额为:"+this.balance);
		System.out.println("现在账户状态"+this.state.getClass().getName());
		
	}
	
	public void computeInterest() {
		state.computeInterest();
	}
	
}
