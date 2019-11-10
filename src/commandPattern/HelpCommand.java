/**
 * @Title: HelpCommand.java
 * @Package commandPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月7日 下午10:13:03
 * @version V1.0
 */

package commandPattern;

/**
 * @ClassName: HelpCommand
 * @Description: 帮助命令类, 充当具体命令类
 * @Author Crazy
 * @DateTime 2019年11月7日 下午10:13:03 
 */

public class HelpCommand extends Command {

	private DisplayHelpClass hcObj;

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		hcObj.display();

	}

	public HelpCommand() {
		hcObj = new DisplayHelpClass();
	}
	

}
