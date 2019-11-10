/**
 * @Title: Invoker.java
 * @Package commandPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��7�� ����10:22:07
 * @version V1.0
 */

package commandPattern;

/**
 * @ClassName: Invoker
 * @Description: ����������, 
 * @Author Crazy
 * @DateTime 2019��11��7�� ����10:22:07 
 */

public class Invoker {
	private CommandQueue commandQueue;

	public Invoker(CommandQueue commandQueue) {
		super();
		this.commandQueue = commandQueue;
	}
	public void call() {
		commandQueue.execute();
	}
}
