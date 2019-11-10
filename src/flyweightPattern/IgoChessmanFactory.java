package flyweightPattern;

import java.util.Hashtable;

/**
 * 
 * @ClassName: IgoChessmanFactory
 * @Description: 围棋棋子工厂类,充当享元工厂类, 使用单例模式设计 
 * @Author Crazy
 * @DateTime 2019年11月5日 下午9:20:07
 */
public class IgoChessmanFactory {
	
	private static IgoChessmanFactory  instance = new IgoChessmanFactory();
	private static Hashtable ht;// 使用hashtable 来存储享元对象, 充当享元池
	
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
