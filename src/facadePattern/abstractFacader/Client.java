package facadePattern.abstractFacader;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractEncryptFacade ef ;
		ef = new NewEncryptFacade();
		ef.fileEncrypt("src//facadePattern//src.txt", "src//facadePattern//des.txt");
	}

}
