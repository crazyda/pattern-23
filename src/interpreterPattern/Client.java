package interpreterPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String instruction = "down run 10 and left move 20";
		InstructionHandler handler = new InstructionHandler();
		handler.handle(instruction);
		String outString;
		outString = handler.outPut();
		System.out.println(outString);
	}

}
