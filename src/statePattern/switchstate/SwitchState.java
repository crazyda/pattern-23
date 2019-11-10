/**
 * @Title: SwitchState.java
 * @Package statePattern.switchstate
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午3:09:37
 * @version V1.0
 */

package statePattern.switchstate;

/**
 * @ClassName: SwitchState
 * @Description:  抽象类
 * @Author Crazy
 * @DateTime 2019年11月9日 下午3:09:37 
 */

public abstract class SwitchState {
	public abstract void on(Switch s);
	public abstract void off(Switch s);
}
