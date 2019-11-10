package facadePattern;

/**
 * 
 * @ClassName: EncryptFacade
 * @Description: ���������, �䵱����� 
 * @Author Crazy
 * @DateTime 2019��11��4�� ����9:28:36
 */
public class EncryptFacade {
	//ά�ֶ���ϵͳ���������
	private FileReader reader;
	private CipherMchine cipher;
	private FileWriter writer;
	
	public EncryptFacade() {
		// TODO Auto-generated constructor stub
		reader = new FileReader();
		cipher = new CipherMchine();
		writer = new FileWriter();
		
		
	}
	//������ϵͳ�����ҵ�񷽷�
	public void fileEncrypt(String fileNameSrc,String fileNameDes) {
		// TODO Auto-generated method stub
		String plainStr = reader.read(fileNameSrc);
		String encryptStr = cipher.encrypt(plainStr);
		writer.write(encryptStr, fileNameDes);
				
	}

}
