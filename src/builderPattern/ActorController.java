package builderPattern;
/**
 * 
 * @ClassName: ActorController
 * @Description: 角色控制器  
 * 	主要作用: 一方面它隔离了客户端与创建过程,另一方面它控制产品对象的创建过程,指挥者
 * 			针对抽象建造者编程 ,客户端只需要知道具体建造者的类型便可通过指挥者类调用建造者相关方法
 * 			返回一个完整的产品对象
 * @Author Crazy
 * @DateTime 2019年11月1日 下午9:12:11
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
