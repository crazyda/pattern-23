/**
 * @Title: ActorBuilder.java
 * @Package builderPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��1�� ����9:04:38
 * @version V1.0
 */

package builderPattern.director;

/**
 * @ClassName: ActorBuilder
 * @Description: ��Ϸ��ɫ������, �䵱��������
 * @Author Crazy
 * @DateTime 2019��11��1�� ����9:04:38 
 */

public abstract class ActorBuilder {
	protected static Actor actor = new Actor();
	
	public abstract void buildType();
	public abstract void buildSex();
	public abstract void buildFace();
	public abstract void buildCostume();
	public abstract void buildHairstyle();
	
	public static Actor cretatActor(ActorBuilder ab) {
		ab.buildHairstyle();
		ab.buildType();
		ab.buildSex();
		ab.buildFace();
		ab.buildCostume();
		return actor;
	}
	
}
