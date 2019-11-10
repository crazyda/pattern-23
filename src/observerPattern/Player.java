/**
 * @Title: Player.java
 * @Package observerPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����12:35:53
 * @version V1.0
 */

package observerPattern;

/**
 * @ClassName: Player
 * @Description:  ս�ӳ�Ա,�䵱����۲���
 * @Author Crazy
 * @DateTime 2019��11��9�� ����12:35:53 
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
		System.out.println("���ס"+this.name+"������");

	}


	@Override
	public void beAttacked(AllyControlCenter acc) {
		// TODO Auto-generated method stub
		System.out.println(this.name+"������");
		acc.notifyObserver(name);

	}

}
