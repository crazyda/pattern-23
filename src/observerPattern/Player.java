/**
 * @Title: Player.java
 * @Package observerPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午12:35:53
 * @version V1.0
 */

package observerPattern;

/**
 * @ClassName: Player
 * @Description:  战队成员,充当具体观察者
 * @Author Crazy
 * @DateTime 2019年11月9日 下午12:35:53 
 */

public class Player implements Observer {
	private String name;
	

	public Player(String name) {
		super();
		this.name = name;
	}

	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}


	@Override
	public void setName(String name) {
		this.name = name;

	}


	@Override
	public void help() {
		// TODO Auto-generated method stub
		System.out.println("坚持住"+this.name+"来救你");

	}


	@Override
	public void beAttacked(AllyControlCenter acc) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"被攻击");
		acc.notifyObserver(name);

	}

}
