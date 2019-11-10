/**
 * @Title: ExitCommand.java
 * @Package commandPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月7日 下午10:08:46
 * @version V1.0
 */

package commandPattern;

/**
 * @ClassName: ExitCommand
 * @Description: 退出命令,充当具体命令类
 * @Author Crazy
 * @DateTime 2019年11月7日 下午10:08:46 
 */

public class ExitCommand extends Command {

	private SystemExitClass seObj;//维持对请求接收者的引用
	
	
	

	public ExitCommand() {
		seObj = new SystemExitClass();
	}



	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		seObj.exit();
	}

	
}
