/**
 * @Title: AndNode.java
 * @Package interpreterPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��8�� ����9:40:51
 * @version V1.0
 */

package interpreterPattern;

/**
 * @ClassName: AndNode
 * @Description: 
 * @Author Crazy
 * @DateTime 2019��11��8�� ����9:40:51 
 */

public class AndNode extends AbstractNode {
	private AbstractNode left ;// and ������ʽ
	private AbstractNode right;//and ���ұ��ʽ

	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		
		return left.interpret()+"��"+right.interpret();
	}

	public AndNode(AbstractNode left, AbstractNode right) {
		super();
		this.left = left;
		this.right = right;
	}
	

}
