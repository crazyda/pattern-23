package facadePattern.abstractFacader;

/**
 * 
 * @ClassName: CipherMchine
 * @Description:数据加密类, 充当子系统类 
 * @Author Crazy
 * @DateTime 2019年11月4日 下午9:19:43
 */
public class NewCipherMchine {
	public String encrypt(String plainText) {
		System.out.println("数据加密,将明文转换为密文");
		String es = "";
		for (int i = 0; i < plainText.length(); i++) {
			String c = String.valueOf(plainText.charAt(i)%7);
			es += c;
		}
		System.out.println(es);
		return es;
	}

}
