package builderPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActorBuilder ab;
		ab = new AngelBuilder();
		ActorController ac = new ActorController();
		Actor actor = ac.construct(ab);
		System.out.println(actor.toString());
	}

}
