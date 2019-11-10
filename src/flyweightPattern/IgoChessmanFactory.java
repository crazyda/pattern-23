package flyweightPattern;

import java.util.Hashtable;

/**
 * 
 * @ClassName: IgoChessmanFactory
 * @Description: Χ�����ӹ�����,�䵱��Ԫ������, ʹ�õ���ģʽ��� 
 * @Author Crazy
 * @DateTime 2019��11��5�� ����9:20:07
 */
public class IgoChessmanFactory {
	
	private static IgoChessmanFactory  instance = new IgoChessmanFactory();
	private static Hashtable ht;// ʹ��hashtable ���洢��Ԫ����, �䵱��Ԫ��
	
	private IgoChessmanFactory() {
		ht = new Hashtable();
		IgoChessman black ,white;
		black = new BlackIgoChessman();
		ht.put("b",black);
		white =new WhiteIgoChessman();
		ht.put("w", white);
	}
	
	public static IgoChessmanFactory getInstance() {
		return instance;
	}
	
	public static IgoChessman getIgoChessman(String color) {
		return (IgoChessman) ht.get(color);
	}

}
