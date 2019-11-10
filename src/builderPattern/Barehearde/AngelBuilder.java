/**
 * @Title: HeroBulider.java
 * @Package builderPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��1�� ����9:07:09
 * @version V1.0
 */

package builderPattern.Barehearde;

/**
 * @ClassName: HeroBulider
 * @Description: 	Ӣ�۽�ɫ������,�䵱���彨����
 * @Author Crazy
 * @DateTime 2019��11��1�� ����9:07:09 
 */

public class AngelBuilder extends ActorBuilder {

	/*
	 * <p>Title: buildType</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��1�� ����9:07:09 
	 * @see builderPattern.ActorBuilder#buildType() 
	 */

	@Override
	public void buildType() {
		// TODO Auto-generated method stub
		actor.setType("��ʹ");

	}

	/*
	 * <p>Title: buildSex</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��1�� ����9:07:09 
	 * @see builderPattern.ActorBuilder#buildSex() 
	 */

	@Override
	public void buildSex() {
		// TODO Auto-generated method stub
		actor.setSex("Ů");
	}

	/*
	 * <p>Title: buildFace</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��1�� ����9:07:09 
	 * @see builderPattern.ActorBuilder#buildFace() 
	 */

	@Override
	public void buildFace() {
		// TODO Auto-generated method stub
		actor.setFace("Ӣ��");
	}

	/*
	 * <p>Title: buildCostume</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��1�� ����9:07:09 
	 * @see builderPattern.ActorBuilder#buildCostume() 
	 */

	@Override
	public void buildCostume() {
		// TODO Auto-generated method stub
		actor.setCostume("��ȹ");
	}

	/*
	 * <p>Title: buildHairstyle</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��1�� ����9:07:09 
	 * @see builderPattern.ActorBuilder#buildHairstyle() 
	 */

	@Override
	public void buildHairstyle() {
		// TODO Auto-generated method stub
		actor.setHairstyle("���糤��");
	}

	@Override
	public String toString() {
		return "AngelBuilder [actor=" + actor + ", cretatActor()=" + cretatActor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
