package builderPattern.Barehearde;

/**]
 * 
 * @ClassName: Client
 * @Description: ʹ�ù��ӵķ��� ָ���������ߵ�ĳЩϸ�� 
 * @Author Crazy
 * @DateTime 2019��11��1�� ����10:56:29
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActorBuilder ab;
		ab = new DevilBuilder();
		ActorController ac = new ActorController();
		Actor actor = ac.construct(ab);
		System.out.println(actor.toString());
	}

}
