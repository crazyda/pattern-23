package flyweightPattern;

/**
 * 
 * @ClassName: IgoChessman
 * @Description: 围棋棋子类, 充当抽象享元类 
 * @Author Crazy
 * @DateTime 2019年11月5日 下午9:18:03
 */
public abstract class IgoChessman {
	
	public abstract String getColor();
	
	public void display() {
		System.out.println("棋子颜色:"+this.getColor());
	}
}
