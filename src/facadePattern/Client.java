package facadePattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncryptFacade ef = new EncryptFacade();
		ef.fileEncrypt("src//facadePattern//src.txt", "src//facadePattern//des.txt");
	}

}
