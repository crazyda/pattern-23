/**
 * @Title: ConcreteMediator.java
 * @Package modiatorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 上午10:20:20
 * @version V1.0
 */

package modiatorPattern;

/**
 * @ClassName: ConcreteMediator
 * @Description:  具体中介者类
 * @Author Crazy
 * @DateTime 2019年11月9日 上午10:20:20 
 */

public class SubConcreteMediator extends Mediator {

	//维持对各个同事对象的应用
	public Button addButton;
	public TextBox userNameTextBox;
	public ComboBox cb;
	public List list;
	
	public Label label;

	@Override
	public void componentChanged(Component c) {
		// TODO Auto-generated method stub
		if(c == addButton) {
			System.out.println("单击增加按钮");
			list.update();
			cb.update();
			userNameTextBox.update();
			label.update();
		}else if(c == list){
			System.out.println("列表中选择用户");
			cb.select();
			userNameTextBox.setText();
		}else if(c == cb ) {
			System.out.println("从组合框选择客户");
			cb.select();
			userNameTextBox.setText();
		}

	}

}
