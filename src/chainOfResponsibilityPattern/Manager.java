/**
 * @Title: VicePresident.java
 * @Package chainOfResponsibilityPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月7日 下午9:18:08
 * @version V1.0
 */

package chainOfResponsibilityPattern;

/**
 * @ClassName: VicePresident
 * @Description: 董事长类, 充当具体处理者
 * @Author Crazy
 * @DateTime 2019年11月7日 下午9:18:08 
 */

public class Manager extends Approver {

	/*
	 * <p>Title: processRequest</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年11月7日 下午9:18:08
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
			System.out.println("经理"+this.name+"审批采购单:"+request.getNumber()+",金额:"+request.getAmount()
			+"元,采购目的:"+request.getPurpose());
		}else {
			this.successor.processRequest(request);
		}
	}

}
