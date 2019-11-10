package facadePattern.abstractFacader;

/**
 * 
 * @ClassName: NewEncryptFacade
 * @Description:具体加密外观类 
 * @Author Crazy
 * @DateTime 2019年11月4日 下午9:44:38
 */
public class NewEncryptFacade extends AbstractEncryptFacade {
	private FileReader reader;
	private NewCipherMchine cipher;
	private FileWriter writer;
	
	public NewEncryptFacade() {
		// TODO Auto-generated constructor stub
		reader = new FileReader();
		cipher = new NewCipherMchine();
		writer = new FileWriter();
		
		
	}
	
	@Override
	public void fileEncrypt(String fileNameSrc, String fileNameDes) {
		// TODO Auto-generated method stub
		String plainStr = reader.read(fileNameSrc);
		String encryptStr = cipher.encrypt(plainStr);
		writer.write(encryptStr, fileNameDes);
	}

}
