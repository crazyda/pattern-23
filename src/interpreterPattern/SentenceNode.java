/**
 * @Title: SentenceNode.java
 * @Package interpreterPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月8日 下午9:43:03
 * @version V1.0
 */

package interpreterPattern;

/**
 * @ClassName: SentenceNode
 * @Description: 简单句子节点类, 充当非终结符表达式角色
 * @Author Crazy
 * @DateTime 2019年11月8日 下午9:43:03 
 */

public class SentenceNode extends AbstractNode {
	private AbstractNode direction;
	
	private AbstractNode action ;
	
	private AbstractNode distance ;
	
	
	public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
		super();
		this.direction = direction;
		this.action = action;
		this.distance = distance;
	}


	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		return direction.interpret()+action.interpret()+distance.interpret();
	}

}
