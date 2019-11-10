/**
 * @Title: CarControoler.java
 * @Package adapterPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月2日 下午8:28:28
 * @version V1.0
 */

package adapterPattern;

/**
 * @ClassName: CarControoler
 * @Description: 	汽车控制类，充当目标抽象类
 * @Author Crazy
 * @DateTime 2019年11月2日 下午8:28:28 
 */

public abstract class CarController {
		
	public void move() {
		System.out.println("玩具汽车移动");
	}
	
	public abstract void phonate();//发出声音
	public abstract void twinkle();//灯光闪烁
	public abstract void luntai();
	public abstract void fangxiang();

}
