package modiatorPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义中介者的对象
		ConcreteMediator mediator;
		mediator = new ConcreteMediator();
		 
		//定义同时对象
		Button addBT = new Button();
		List list = new List();
		ComboBox cb = new ComboBox();
		TextBox userNameTB = new TextBox();
		
		addBT.setMediator(mediator);
		list.setMediator(mediator);
		cb.setMediator(mediator);
		userNameTB.setMediator(mediator);
		
		mediator.addButton = addBT;
		mediator.list = list;
		mediator.cb = cb;
		mediator.userNameTextBox = userNameTB;
		
		addBT.changed();
		System.out.println("-------------");
		list.changed();
	}

}
