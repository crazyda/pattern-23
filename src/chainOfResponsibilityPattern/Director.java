/**
 * @Title: Director.java
 * @Package chainOfResponsibilityPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��7�� ����9:15:04
 * @version V1.0
 */

package chainOfResponsibilityPattern;

/**
 * @ClassName: Director
 * @Description: ������, �䵱���崦����
 * @Author Crazy
 * @DateTime 2019��11��7�� ����9:15:04 
 */

public class Director extends Approver {

	/*
	 * <p>Title: processRequest</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��7�� ����9:15:04
	 * @param request 
	 * @see chainOfResponsibilityPattern.Approver#processRequest(chainOfResponsibilityPattern.PurchaseRequest) 
	 */

	public Director(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if(request.getAmount()<50000) {
			System.out.println("����"+this.name+"�����ɹ���:"+request.getNumber()+",���:"+request.getAmount()
			+"Ԫ,�ɹ�Ŀ��:"+request.getPurpose());
		}else {
			this.successor.processRequest(request);
		}

	}

}
