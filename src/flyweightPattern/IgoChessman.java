package flyweightPattern;

/**
 * 
 * @ClassName: IgoChessman
 * @Description: Χ��������, �䵱������Ԫ�� 
 * @Author Crazy
 * @DateTime 2019��11��5�� ����9:18:03
 */
public abstract class IgoChessman {
	
	public abstract String getColor();
	
	public void display() {
		System.out.println("������ɫ:"+this.getColor());
	}
}
