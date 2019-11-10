/**
 * @Title: Component.java
 * @Package modiatorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����10:18:11
 * @version V1.0
 */

package modiatorPattern;

/**
 * @ClassName: Component
 * @Description: ���������, �䵱����ͬ����
 * @Author Crazy
 * @DateTime 2019��11��9�� ����10:18:11 
 */

public abstract class Component {
	protected Mediator mediator;

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}
	
	//ת������
	public void changed() {
		mediator.componentChanged(this);
	}
	
	public abstract void update();
}
