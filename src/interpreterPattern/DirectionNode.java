/**
 * @Title: DirectionNode.java
 * @Package interpreterPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��8�� ����9:44:42
 * @version V1.0
 */

package interpreterPattern;

/**
 * @ClassName: DirectionNode
 * @Description: ��������, �䵱�ս�����ʽ��ɫ
 * @Author Crazy
 * @DateTime 2019��11��8�� ����9:44:42 
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
			return "����";
		}else if(direction.equalsIgnoreCase("down")) {
			return "����";
		}else if(direction.equalsIgnoreCase("left")){
			return "����";
		}else if(direction.equalsIgnoreCase("right")) {
			return "����";
		}else {
			return "��Чָ��";
		}
		
		
	}

}
