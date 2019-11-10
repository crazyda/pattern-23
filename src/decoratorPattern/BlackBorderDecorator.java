package decoratorPattern;

/**
 * 
 * @ClassName: BlackBorderDecorator
 * @Description: 黑色边框装饰类, 充当具体装饰类 
 * @Author Crazy
 * @DateTime 2019年11月3日 下午2:42:56
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
		System.out.println("为构件增加黑色边框");
	}
	

}
