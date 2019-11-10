package decoratorPattern;

/**
 * 
 * @ClassName: ScrollBarDecorator
 * @Description: ������װ����, �䵱����װ���� 
 * @Author Crazy
 * @DateTime 2019��11��3�� ����2:40:16
 */
public class ScrollBarDecorator extends ComponentDecorator {

	public ScrollBarDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	public void display() {
		this.setScrollBar();
		super.display();
	}
	
	public void setScrollBar() {
		System.out.println("Ϊ�������ӹ�����");
	}

}
