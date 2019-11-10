package statePattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account("¶Î", 0.0);
		acc.deposit(1000);
		acc.withdraw(2000);
		acc.deposit(3000);
		acc.withdraw(4000);
		acc.withdraw(1000);
		acc.computeInterest();
	}

}
