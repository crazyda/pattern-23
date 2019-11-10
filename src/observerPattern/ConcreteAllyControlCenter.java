/**
 * @Title: ConcreteAllyControlCenter.java
 * @Package observerPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午12:31:15
 * @version V1.0
 */

package observerPattern;

/**
 * @ClassName: ConcreteAllyControlCenter
 * @Description:  具体指挥部类,充当具体目标类
 * @Author Crazy
 * @DateTime 2019年11月9日 下午12:31:15 
 */

public class ConcreteAllyControlCenter extends AllyControlCenter {

	
	public ConcreteAllyControlCenter(String allyName) {
		System.out.println(allyName+"战队组建成功");
		this.allyName = allyName;
	}

	@Override
	public void notifyObserver(String name) {
		// TODO Auto-generated method stub
		System.out.println(this.allyName+"战队紧急通知,盟友"+name+"遭受敌人攻击");
		for(Object obs : players) {
			if(((Observer)obs).getName().equalsIgnoreCase(name)) {
				((Observer)obs).help();
			}
		}
		
	}

}
