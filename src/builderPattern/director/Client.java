package builderPattern.director;

public class Client {

	/**
	 * 	 
	 * @Title: main
	 * @Description:  ʡ����ָ�������
	 * @Author Crazy
	 * @DateTime 2019��11��1�� ����9:50:12
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
