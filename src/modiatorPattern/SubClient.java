package modiatorPattern;

public class SubClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义中介者的对象
		SubConcreteMediator mediator;
		mediator = new SubConcreteMediator();
		 
		//定义同时对象
		Button addBT = new Button();
		List list = new List();
		ComboBox cb = new ComboBox();
		TextBox userNameTB = new TextBox();
		Label label = new Label();
		
		
		addBT.setMediator(mediator);
		list.setMediator(mediator);
		cb.setMediator(mediator);
		userNameTB.setMediator(mediator);
		label.setMediator(mediator);
		
		mediator.addButton = addBT;
		mediator.list = list;
		mediator.cb = cb;
		mediator.userNameTextBox = userNameTB;
		mediator.label = label;
		
		addBT.changed();
		System.out.println("-------------");
		list.changed();
	}

}
