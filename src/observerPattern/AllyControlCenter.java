/**
 * @Title: AllyControlCenter.java
 * @Package observerPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����12:24:36
 * @version V1.0
 */

package observerPattern;

import java.util.ArrayList;

/**
 * @ClassName: AllyControlCenter
 * @Description:  ָ�Ӳ���, �䵱����Ŀ����
 * @Author Crazy
 * @DateTime 2019��11��9�� ����12:24:36 
 */

public abstract class AllyControlCenter {
	protected String allyName ;// ս������
	protected ArrayList<Observer> players = new ArrayList<Observer>(); //�洢ս��
	public String getAllyName() {
		return allyName;
	}
	public void setAllyName(String allyName) {
		this.allyName = allyName;
	}
	
	//ע�᷽��
	public void join(Observer obs) {
		System.out.println(obs.getName()+"����"+this.allyName+"ս��");
		players.add(obs);
	}
	
	//ע������
	public void quit(Observer obs) {
		System.out.println(obs.getName()+"�˳�"+this.allyName+"ս��");
		players.remove(obs);
	}
	
	//��������֪ͨ����
	public abstract void notifyObserver(String name);

}
