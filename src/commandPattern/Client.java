package commandPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionButton fb = new FunctionButton();// 
		Command command  = new ExitCommand(); // 定义命令对象
		fb.setCommand(command);//将命令对象注入功能键
		fb.click(); //调用功能键的方法
		
		Command command1 = new HelpCommand();
		Command command2 = new ExitCommand();
		CommandQueue qu = new CommandQueue();
		qu.addCommand(command2);
		qu.addCommand(command1);
		qu.addCommand(command);
		
		Invoker ik = new Invoker(qu);
		ik.call();
		
		
	}

}
