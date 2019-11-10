/**
 * @Title: Observer.java
 * @Package observerPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����12:26:14
 * @version V1.0
 */

package observerPattern;

/**
 * @ClassName: Observer
 * @Description: ����۲���
 * @Author Crazy
 * @DateTime 2019��11��9�� ����12:26:14 
 */

public interface Observer {
	public String getName();
	public void setName(String name);
	public void help(); // ����֧Ԯ���ѷ���
	public void beAttacked(AllyControlCenter acc);//�������ܹ�������
	
}
