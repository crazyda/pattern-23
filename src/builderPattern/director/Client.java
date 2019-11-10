package builderPattern.director;

public class Client {

	/**
	 * 	 
	 * @Title: main
	 * @Description:  省略了指挥者类的
	 * @Author Crazy
	 * @DateTime 2019年11月1日 下午9:50:12
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActorBuilder ab;
		ab = new AngelBuilder();
		Actor ac = ActorBuilder.cretatActor(ab);
		System.out.println(ac.toString());
	}

}
