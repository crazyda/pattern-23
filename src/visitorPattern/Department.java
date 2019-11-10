/**
 * @Title: Department.java
 * @Package visitorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����5:05:13
 * @version V1.0
 */

package visitorPattern;

/**
 * @ClassName: Department
 * @Description: ������, �䵱�����������
 * @Author Crazy
 * @DateTime 2019��11��9�� ����5:05:13 
 */

public abstract class Department {
	//����һ�����صķ��ʷ���,���ڷ��ʲ�ͬ���͵ľ���Ԫ��
	public abstract void visit(FulltimeEmployee employee);
	public abstract void visit(ParttimeEmployee employee);

}
