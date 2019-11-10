package statePattern;

/**
 * 
 * @ClassName: Account
 * @Description: �����˻�,�䵱������ 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����1:19:29
 */
public class Account {
	private AccountState state; //ά��һ���Գ���״̬���������
	private String owner ;// ������
	private double balance = 0;//�˻����
	public Account(String owner, double balance) {
		super();
		this.owner = owner;
		this.balance = balance;
		this.state = new NormalState(this);
		System.out.println(this.owner+"����,��ʼ���Ϊ:"+balance);
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
		System.out.println(this.owner+"���"+amount);
		state.deposit(amount);
		System.out.println("�������Ϊ:"+this.balance);
		System.out.println("�����˻�״̬"+this.state.getClass().getName());
		
	}
	
	
	public void withdraw(double amount) {
		System.out.println(this.owner+"ȡ��"+amount);
		state.withdraw(amount);
		System.out.println("�������Ϊ:"+this.balance);
		System.out.println("�����˻�״̬"+this.state.getClass().getName());
		
	}
	
	public void computeInterest() {
		state.computeInterest();
	}
	
}
