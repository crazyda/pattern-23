package facadePattern.abstractFacader;

/**
 * 
 * @ClassName: CipherMchine
 * @Description:���ݼ�����, �䵱��ϵͳ�� 
 * @Author Crazy
 * @DateTime 2019��11��4�� ����9:19:43
 */
public class NewCipherMchine {
	public String encrypt(String plainText) {
		System.out.println("���ݼ���,������ת��Ϊ����");
		String es = "";
		for (int i = 0; i < plainText.length(); i++) {
			String c = String.valueOf(plainText.charAt(i)%7);
			es += c;
		}
		System.out.println(es);
		return es;
	}

}
