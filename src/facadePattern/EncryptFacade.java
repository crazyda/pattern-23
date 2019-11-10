package facadePattern;

/**
 * 
 * @ClassName: EncryptFacade
 * @Description: 加密外观类, 充当外观类 
 * @Author Crazy
 * @DateTime 2019年11月4日 下午9:28:36
 */
public class EncryptFacade {
	//维持对子系统对象的引用
	private FileReader reader;
	private CipherMchine cipher;
	private FileWriter writer;
	
	public EncryptFacade() {
		// TODO Auto-generated constructor stub
		reader = new FileReader();
		cipher = new CipherMchine();
		writer = new FileWriter();
		
		
	}
	//调用子系统对象的业务方法
	public void fileEncrypt(String fileNameSrc,String fileNameDes) {
		// TODO Auto-generated method stub
		String plainStr = reader.read(fileNameSrc);
		String encryptStr = cipher.encrypt(plainStr);
		writer.write(encryptStr, fileNameDes);
				
	}

}
