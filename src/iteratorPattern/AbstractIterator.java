/**
 * @Title: AbstractIterator.java
 * @Package iteratorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��8�� ����10:45:27
 * @version V1.0
 */

package iteratorPattern;

/**
 * @ClassName: AbstractIterator
 * @Description:  ���������
 * @Author Crazy
 * @DateTime 2019��11��8�� ����10:45:27 
 */

public interface AbstractIterator {
		public void next();// ������һ��Ԫ��
		public boolean isLast(); //�ж��Ƿ������һ��Ԫ��
		public void previous(); //������һ��Ԫ��
		public boolean isFirst(); // �ж��Ƿ��ǵ�һ��Ԫ��
		public Object getNextItem();//��ȡ��һ��Ԫ��
		public Object getPreviousItem() ;// ��ȡ��һ��Ԫ��
}
