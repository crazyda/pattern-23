/**
 * @Title: ActorBuilder.java
 * @Package builderPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月1日 下午9:04:38
 * @version V1.0
 */

package builderPattern.Barehearde;

/**
 * @ClassName: ActorBuilder
 * @Description: 游戏角色建造者, 充当抽象建造者
 * @Author Crazy
 * @DateTime 2019年11月1日 下午9:04:38 
 */

public abstract class ActorBuilder {
	protected Actor actor = new Actor();
	
	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildFace();
	public abstract void buildCostume();
	public abstract void buildHairstyle();
	
	//钩子方法
	public boolean isBareheaded() {
		return false;
	}
	
	
	public Actor cretatActor() {
		return actor;
	}
	
}
