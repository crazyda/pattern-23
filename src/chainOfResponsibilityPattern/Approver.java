/**
 * @Title: Approver.java
 * @Package chainOfResponsibilityPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月7日 下午9:12:26
 * @version V1.0
 */

package chainOfResponsibilityPattern;

/**
 * @ClassName: Approver
 * @Description: 审批者类, 充当抽象处理者
 * @Author Crazy
 * @DateTime 2019年11月7日 下午9:12:26 
 */

public abstract class Approver {
	protected Approver successor;//定义后继对象
	protected String name;//审批者名字
	public Approver(String name) {
		super();
		this.name = name;
	}
	//设置后继者
	public void setSuccessor(Approver successor) {
		this.successor = successor;
	}
	public abstract void processRequest(PurchaseRequest request);

}
