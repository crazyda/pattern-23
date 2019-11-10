package commandPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionButton fb = new FunctionButton();// 
		Command command  = new ExitCommand(); // �����������
		fb.setCommand(command);//���������ע�빦�ܼ�
		fb.click(); //���ù��ܼ��ķ���
		
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
