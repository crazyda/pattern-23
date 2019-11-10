package builderPattern.Barehearde;

/**]
 * 
 * @ClassName: Client
 * @Description: 使用钩子的方法 指定见建造者的某些细节 
 * @Author Crazy
 * @DateTime 2019年11月1日 下午10:56:29
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
