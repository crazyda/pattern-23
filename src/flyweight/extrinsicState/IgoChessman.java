package flyweight.extrinsicState;

/**
 * 
 * @ClassName: IgoChessman
 * @Description: Χ��������, �䵱������Ԫ�� 
 * @Author Crazy
 * @DateTime 2019��11��5�� ����9:18:03
 */
public abstract class IgoChessman {
	
	public abstract String getColor();
	
	public void display(Coordinates coord) {
		System.out.println("������ɫ:"+this.getColor()+",����λ��:"+coord.getX()+" "+coord.getY());
	}
}
