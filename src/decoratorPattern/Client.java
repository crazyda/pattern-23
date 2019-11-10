package decoratorPattern;

public class Client {
	public static void main(String[] args) {
		Component component ,componentSB,componentBB; //使用抽象构件定义对象
		component = new Window();//创建具体构件对象
		componentSB = new ScrollBarDecorator(component); //创建装饰后的构件对象 
		componentBB = new BlackBorderDecorator(componentSB);
		componentBB.display(); //
		
		
		component = new TextBox();//创建具体构件对象
		componentSB = new ScrollBarDecorator(component); //创建装饰后的构件对象 
		componentBB = new BlackBorderDecorator(componentSB);
		componentBB.display(); //
		
	}
}
