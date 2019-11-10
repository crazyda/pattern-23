package builderPattern;
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
		ab.buildHairstyle();
		ab.buildType();
		ab.buildSex();
		ab.buildFace();
		ab.buildCostume();
		return ab.cretatActor();
	}
}
