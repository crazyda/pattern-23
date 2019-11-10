package commandPattern;

/**
 * 
 * @ClassName: FunctionButton
 * @Description: ���ܼ���, �䵱�������, �������� 
 * @Author Crazy
 * @DateTime 2019��11��7�� ����10:05:49
 */
public class FunctionButton {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	public void click() {
		System.out.println("�������ܼ�");
		command.execute();
	}

}
