/**
 * @Title: AddCommand.java
 * @Package commandPattern.calculator
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��8�� ����9:11:10
 * @version V1.0
 */

package commandPattern.calculator;

/**
 * @ClassName: AddCommand
 * @Description: ����������, 
 * @Author Crazy
 * @DateTime 2019��11��8�� ����9:11:10 
 */

public class AddCommand extends AbstractCommand {
	private Adder adder = new Adder();
	private int value;
	

	@Override
	public int execute(int value) {
		// TODO Auto-generated method stub
		this.value = value;
		
		return adder.add(value);
	}


	//ʵ�ֳ�����������, undo()����, 
	@Override
	public int undo() {
		// TODO Auto-generated method stub
		
		return adder.add(-value);
	}

}
