/**
 * @Title: SwitchState.java
 * @Package statePattern.switchstate
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����3:09:37
 * @version V1.0
 */

package statePattern.switchstate;

/**
 * @ClassName: SwitchState
 * @Description:  ������
 * @Author Crazy
 * @DateTime 2019��11��9�� ����3:09:37 
 */

public abstract class SwitchState {
	public abstract void on(Switch s);
	public abstract void off(Switch s);
}
