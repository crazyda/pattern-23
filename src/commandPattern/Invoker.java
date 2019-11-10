/**
 * @Title: Invoker.java
 * @Package commandPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月7日 下午10:22:07
 * @version V1.0
 */

package commandPattern;

/**
 * @ClassName: Invoker
 * @Description: 请求发送者类, 
 * @Author Crazy
 * @DateTime 2019年11月7日 下午10:22:07 
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
