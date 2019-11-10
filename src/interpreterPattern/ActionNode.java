/**
 * @Title: ActionNode.java
 * @Package interpreterPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��8�� ����9:47:58
 * @version V1.0
 */

package interpreterPattern;

/**
 * @ClassName: ActionNode
 * @Description: ���������,�䵱�ս�����ʽ��ɫ
 * @Author Crazy
 * @DateTime 2019��11��8�� ����9:47:58 
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
				return "�ƶ�";
			}else if(action.equalsIgnoreCase("run")) {
				return "�����ƶ�";
			}else {
				return "��Чָ��";
			}
	}

}
