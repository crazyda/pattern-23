package templatemethodPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new CurrentAccount();
		account.handle("���޼�", "123456");
		Account account1 = new SavingAccount();
		account1.handle("���޼�", "123456");
	}

}
