package decoratorPattern;

public class Client {
	public static void main(String[] args) {
		Component component ,componentSB,componentBB; //ʹ�ó��󹹼��������
		component = new Window();//�������幹������
		componentSB = new ScrollBarDecorator(component); //����װ�κ�Ĺ������� 
		componentBB = new BlackBorderDecorator(componentSB);
		componentBB.display(); //
		
		
		component = new TextBox();//�������幹������
		componentSB = new ScrollBarDecorator(component); //����װ�κ�Ĺ������� 
		componentBB = new BlackBorderDecorator(componentSB);
		componentBB.display(); //
		
	}
}
