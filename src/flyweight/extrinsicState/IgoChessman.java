package flyweight.extrinsicState;

/**
 * 
 * @ClassName: IgoChessman
 * @Description: 围棋棋子类, 充当抽象享元类 
 * @Author Crazy
 * @DateTime 2019年11月5日 下午9:18:03
 */
public abstract class IgoChessman {
	
	public abstract String getColor();
	
	public void display(Coordinates coord) {
		System.out.println("棋子颜色:"+this.getColor()+",棋子位置:"+coord.getX()+" "+coord.getY());
	}
}
