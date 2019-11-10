/**
 * @Title: ConcreteMediator.java
 * @Package modiatorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����10:20:20
 * @version V1.0
 */

package modiatorPattern;

/**
 * @ClassName: ConcreteMediator
 * @Description:  �����н�����
 * @Author Crazy
 * @DateTime 2019��11��9�� ����10:20:20 
 */

public class SubConcreteMediator extends Mediator {

	//ά�ֶԸ���ͬ�¶����Ӧ��
	public Button addButton;
	public TextBox userNameTextBox;
	public ComboBox cb;
	public List list;
	
	public Label label;

	@Override
	public void componentChanged(Component c) {
		// TODO Auto-generated method stub
		if(c == addButton) {
			System.out.println("�������Ӱ�ť");
			list.update();
			cb.update();
			userNameTextBox.update();
			label.update();
		}else if(c == list){
			System.out.println("�б���ѡ���û�");
			cb.select();
			userNameTextBox.setText();
		}else if(c == cb ) {
			System.out.println("����Ͽ�ѡ��ͻ�");
			cb.select();
			userNameTextBox.setText();
		}

	}

}
