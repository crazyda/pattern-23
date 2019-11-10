/**
 * @Title: DirectionNode.java
 * @Package interpreterPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月8日 下午9:44:42
 * @version V1.0
 */

package interpreterPattern;

/**
 * @ClassName: DirectionNode
 * @Description: 方向结点类, 充当终结符表达式角色
 * @Author Crazy
 * @DateTime 2019年11月8日 下午9:44:42 
 */

public class DirectionNode extends AbstractNode {

	private String direction;
	
	public DirectionNode(String direction) {
		super();
		this.direction = direction;
	}

	@Override
	public String interpret() {
		if(direction.equalsIgnoreCase("up")) {
			return "向上";
		}else if(direction.equalsIgnoreCase("down")) {
			return "向下";
		}else if(direction.equalsIgnoreCase("left")){
			return "向左";
		}else if(direction.equalsIgnoreCase("right")) {
			return "向右";
		}else {
			return "无效指令";
		}
		
		
	}

}
