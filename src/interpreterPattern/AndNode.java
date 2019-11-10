/**
 * @Title: AndNode.java
 * @Package interpreterPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月8日 下午9:40:51
 * @version V1.0
 */

package interpreterPattern;

/**
 * @ClassName: AndNode
 * @Description: 
 * @Author Crazy
 * @DateTime 2019年11月8日 下午9:40:51 
 */

public class AndNode extends AbstractNode {
	private AbstractNode left ;// and 的左表达式
	private AbstractNode right;//and 的右表达式

	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		
		return left.interpret()+"再"+right.interpret();
	}

	public AndNode(AbstractNode left, AbstractNode right) {
		super();
		this.left = left;
		this.right = right;
	}
	

}
