/**
 * @Title: ActionNode.java
 * @Package interpreterPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月8日 下午9:47:58
 * @version V1.0
 */

package interpreterPattern;

/**
 * @ClassName: ActionNode
 * @Description: 动作结点类,充当终结符表达式角色
 * @Author Crazy
 * @DateTime 2019年11月8日 下午9:47:58 
 */

public class ActionNode extends AbstractNode {
	private String action;
	


	public ActionNode(String action) {
		super();
		this.action = action;
	}


	@Override
	public String interpret() {
		 if(action.equalsIgnoreCase("move")){
				return "移动";
			}else if(action.equalsIgnoreCase("run")) {
				return "快速移动";
			}else {
				return "无效指令";
			}
	}

}
