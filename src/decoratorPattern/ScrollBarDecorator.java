package decoratorPattern;

/**
 * 
 * @ClassName: ScrollBarDecorator
 * @Description: 滚动条装饰类, 充当具体装饰类 
 * @Author Crazy
 * @DateTime 2019年11月3日 下午2:40:16
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
		System.out.println("为构件增加滚动条");
	}

}
