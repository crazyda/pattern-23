package decoratorPattern;

/**
 * 
 * @ClassName: BlackBorderDecorator
 * @Description: ��ɫ�߿�װ����, �䵱����װ���� 
 * @Author Crazy
 * @DateTime 2019��11��3�� ����2:42:56
 */
public class BlackBorderDecorator extends ComponentDecorator {

	public BlackBorderDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		this.setBlackBorder();
		super.display();
	}
	
	public void setBlackBorder() {
		System.out.println("Ϊ�������Ӻ�ɫ�߿�");
	}
	

}
