/**
 * @Title: CommandQueue.java
 * @Package commandPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月7日 下午10:19:23
 * @version V1.0
 */

package commandPattern;

import java.util.ArrayList;

/**
 * @ClassName: CommandQueue
 * @Description:  实现命令队列
 * @Author Crazy
 * @DateTime 2019年11月7日 下午10:19:23 
 */

public class CommandQueue {
	
	private ArrayList<Command> commands = new ArrayList<Command>();
	
	public void addCommand(Command command) {
		commands.add(command);
	}

	public void removerCommand(Command command) {
		commands.remove(command);
	}
	public void execute() {
		commands.forEach(command -> command.execute());
	}
}
