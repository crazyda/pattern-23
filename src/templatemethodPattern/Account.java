/**
 * @Title: Account.java
 * @Package templatemethodPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����4:32:26
 * @version V1.0
 */

package templatemethodPattern;

/**
 * @ClassName: Account
 * @Description: �˻��� �䵱������
 * @Author Crazy
 * @DateTime 2019��11��9�� ����4:32:26 
 */

public abstract class Account {
	//��������--���巽��
	public boolean validate(String account,String password) {
		System.out.println("�˺�:"+account);
		System.out.println("����:"+password);
		if(account.equalsIgnoreCase("���޼�") && password.equalsIgnoreCase("123456")) {
			return true;
		}else {
			return false;
		}
	}
	
	
	//�������� -- ���󷽷�
	public abstract void calculateInterest();
	
	//�������� -- ���巽��
	public void display() {
		System.out.println("��ʾ��Ϣ");
	}
	
	
	//ģ�巽��
	public void handle(String account,String password) {
		if(!validate(account,password)) {
			System.out.println("�˺��������");
			return;
		}
		calculateInterest();
		display();
		
	}
}
