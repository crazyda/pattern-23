/**
 * @Title: Mediator.java
 * @Package modiatorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 上午10:16:51
 * @version V1.0
 */

package modiatorPattern;

/**
 * @ClassName: Mediator
 * @Description:  抽象中介者类
 * @Author Crazy
 * @DateTime 2019年11月9日 上午10:16:51 
 */

public abstract class Mediator {
	public abstract void componentChanged(Component c);
}
