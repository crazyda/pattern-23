package commandPattern.calculator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorForm form = new CalculatorForm();
		AbstractCommand command;
		command = new AddCommand();
		form.setCommand(command);
		form.compute(10);
		form.compute(5);
		form.compute(10);
		form.undo();
	}

}
