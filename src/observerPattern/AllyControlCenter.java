/**
 * @Title: AllyControlCenter.java
 * @Package observerPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午12:24:36
 * @version V1.0
 */

package observerPattern;

import java.util.ArrayList;

/**
 * @ClassName: AllyControlCenter
 * @Description:  指挥部类, 充当抽象目标类
 * @Author Crazy
 * @DateTime 2019年11月9日 下午12:24:36 
 */

public abstract class AllyControlCenter {
	protected String allyName ;// 战队名称
	protected ArrayList<Observer> players = new ArrayList<Observer>(); //存储战队
	public String getAllyName() {
		return allyName;
	}
	public void setAllyName(String allyName) {
		this.allyName = allyName;
	}
	
	//注册方法
	public void join(Observer obs) {
		System.out.println(obs.getName()+"加入"+this.allyName+"战队");
		players.add(obs);
	}
	
	//注销方法
	public void quit(Observer obs) {
		System.out.println(obs.getName()+"退出"+this.allyName+"战队");
		players.remove(obs);
	}
	
	//声明抽象通知方法
	public abstract void notifyObserver(String name);

}
