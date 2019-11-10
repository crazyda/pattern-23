/**
 * @Title: Observer.java
 * @Package observerPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午12:26:14
 * @version V1.0
 */

package observerPattern;

/**
 * @ClassName: Observer
 * @Description: 抽象观察者
 * @Author Crazy
 * @DateTime 2019年11月9日 下午12:26:14 
 */

public interface Observer {
	public String getName();
	public void setName(String name);
	public void help(); // 声明支援盟友方法
	public void beAttacked(AllyControlCenter acc);//声明遭受攻击方法
	
}
