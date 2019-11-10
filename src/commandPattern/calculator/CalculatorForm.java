/**
 * @Title: CalculatorForm.java
 * @Package commandPattern.calculator
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��8�� ����9:13:24
 * @version V1.0
 */

package commandPattern.calculator;

/**
 * @ClassName: CalculatorForm
 * @Description: ��������
 * @Author Crazy
 * @DateTime 2019��11��8�� ����9:13:24 
 */

public class CalculatorForm {
	private AbstractCommand command;

	public AbstractCommand getCommand() {
		return command;
	}

	public void setCommand(AbstractCommand command) {
		this.command = command;
	}
	
	public void compute(int value) {
		int i = command.execute(value);
		System.out.println("ִ������,������:"+i);
	}
	
	public void undo() {
		int i = command.undo();
		System.out.println("ִ�г�������,���Ϊ:"+i);
		
	}
}
