/**
 * @Title: Onstate.java
 * @Package statePattern.switchstate
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午3:12:33
 * @version V1.0
 */

package statePattern.switchstate;

/**
 * @ClassName: Onstate
 * @Description: 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午3:12:33 
 */

public class Onstate extends SwitchState {

	/*
	 * <p>Title: on</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年11月9日 下午3:12:33
	 * @param s 
	 * @see statePattern.switchstate.SwitchState#on(statePattern.switchstate.Switch) 
	 */

	@Override
	public void on(Switch s) {
		// TODO Auto-generated method stub
		System.out.println("已经打开");

	}

	/*
	 * <p>Title: off</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年11月9日 下午3:12:33
	 * @param s 
	 * @see statePattern.switchstate.SwitchState#off(statePattern.switchstate.Switch) 
	 */

	@Override
	public void off(Switch s) {
		// TODO Auto-generated method stub
		System.out.println("关闭");
		s.setState(Switch.getState("off"));

	}

}
