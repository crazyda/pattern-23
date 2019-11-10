/**
 * @Title: CalculatorForm.java
 * @Package commandPattern.calculator
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月8日 下午9:13:24
 * @version V1.0
 */

package commandPattern.calculator;

/**
 * @ClassName: CalculatorForm
 * @Description: 请求发送者
 * @Author Crazy
 * @DateTime 2019年11月8日 下午9:13:24 
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
		System.out.println("执行运算,运算结果:"+i);
	}
	
	public void undo() {
		int i = command.undo();
		System.out.println("执行撤销运算,结果为:"+i);
		
	}
}
