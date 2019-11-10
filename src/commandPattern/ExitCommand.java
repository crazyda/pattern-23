/**
 * @Title: ExitCommand.java
 * @Package commandPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��7�� ����10:08:46
 * @version V1.0
 */

package commandPattern;

/**
 * @ClassName: ExitCommand
 * @Description: �˳�����,�䵱����������
 * @Author Crazy
 * @DateTime 2019��11��7�� ����10:08:46 
 */

public class ExitCommand extends Command {

	private SystemExitClass seObj;//ά�ֶ���������ߵ�����
	
	
	

	public ExitCommand() {
		seObj = new SystemExitClass();
	}



	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		seObj.exit();
	}

	
}
