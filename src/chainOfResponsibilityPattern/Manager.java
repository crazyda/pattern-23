/**
 * @Title: VicePresident.java
 * @Package chainOfResponsibilityPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��7�� ����9:18:08
 * @version V1.0
 */

package chainOfResponsibilityPattern;

/**
 * @ClassName: VicePresident
 * @Description: ���³���, �䵱���崦����
 * @Author Crazy
 * @DateTime 2019��11��7�� ����9:18:08 
 */

public class Manager extends Approver {

	/*
	 * <p>Title: processRequest</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��7�� ����9:18:08
	 * @param request 
	 * @see chainOfResponsibilityPattern.Approver#processRequest(chainOfResponsibilityPattern.PurchaseRequest) 
	 */

	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processRequest(PurchaseRequest request) {
		if(request.getAmount()<80000) {
			System.out.println("����"+this.name+"�����ɹ���:"+request.getNumber()+",���:"+request.getAmount()
			+"Ԫ,�ɹ�Ŀ��:"+request.getPurpose());
		}else {
			this.successor.processRequest(request);
		}
	}

}
