/**
 * @Title: Component.java
 * @Package modiatorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 上午10:18:11
 * @version V1.0
 */

package modiatorPattern;

/**
 * @ClassName: Component
 * @Description: 抽象组件类, 充当抽象同事类
 * @Author Crazy
 * @DateTime 2019年11月9日 上午10:18:11 
 */

public abstract class Component {
	protected Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	//转发调用
	public void changed() {
		mediator.componentChanged(this);
	}
	
	public abstract void update();
}
