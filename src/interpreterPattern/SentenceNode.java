/**
 * @Title: SentenceNode.java
 * @Package interpreterPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��8�� ����9:43:03
 * @version V1.0
 */

package interpreterPattern;

/**
 * @ClassName: SentenceNode
 * @Description: �򵥾��ӽڵ���, �䵱���ս�����ʽ��ɫ
 * @Author Crazy
 * @DateTime 2019��11��8�� ����9:43:03 
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
