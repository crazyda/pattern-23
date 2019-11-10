package builderPattern.Barehearde;
/**
 * 
 * @ClassName: ActorController
 * @Description: ��ɫ������  
 * 	��Ҫ����: һ�����������˿ͻ����봴������,��һ���������Ʋ�Ʒ����Ĵ�������,ָ����
 * 			��Գ������߱�� ,�ͻ���ֻ��Ҫ֪�����彨���ߵ����ͱ��ͨ��ָ��������ý�������ط���
 * 			����һ�������Ĳ�Ʒ����
 * @Author Crazy
 * @DateTime 2019��11��1�� ����9:12:11
 */
public class ActorController {
	
	public Actor construct(ActorBuilder ab) {
		ab.buildType();
		ab.buildSex();
		ab.buildFace();
		ab.buildCostume();
		if(!ab.isBareheaded()) {
			ab.buildHairstyle();
		}
		return ab.cretatActor();
	}
}
