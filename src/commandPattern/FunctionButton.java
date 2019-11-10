package commandPattern;

/**
 * 
 * @ClassName: FunctionButton
 * @Description: 功能键类, 充当请求调用, 请求发送者 
 * @Author Crazy
 * @DateTime 2019年11月7日 下午10:05:49
 */
public class FunctionButton {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	public void click() {
		System.out.println("单击功能键");
		command.execute();
	}

}
