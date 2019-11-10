/**
 * @Title: ComboBox.java
 * @Package modiatorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����10:24:07
 * @version V1.0
 */

package modiatorPattern;

/**
 * @ClassName: ComboBox
 * @Description: ��Ͽ���, �䵱����ͬ����
 * @Author Crazy
 * @DateTime 2019��11��9�� ����10:24:07 
 */

public class ComboBox extends Component{

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("��Ͽ�����һ��:���޼�");
	}

	public void select() {
		System.out.println("��Ͽ�ѡ����:С��Ů");
	}
}
