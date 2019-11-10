/**
 * @Title: Approver.java
 * @Package chainOfResponsibilityPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��7�� ����9:12:26
 * @version V1.0
 */

package chainOfResponsibilityPattern;

/**
 * @ClassName: Approver
 * @Description: ��������, �䵱��������
 * @Author Crazy
 * @DateTime 2019��11��7�� ����9:12:26 
 */

public abstract class Approver {
	protected Approver successor;//�����̶���
	protected String name;//����������
	public Approver(String name) {
		super();
		this.name = name;
	}
	//���ú����
	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}
	public abstract void processRequest(PurchaseRequest request);

}
