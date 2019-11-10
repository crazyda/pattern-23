/**
 * @Title: Actor.java
 * @Package builderPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��1�� ����9:01:44
 * @version V1.0
 */

package builderPattern;

/**
 * @ClassName: Actor
 * @Description:  ��Ϸ��ɫ��, �䵱���Ӳ�Ʒ���� 
 * @Author Crazy
 * @DateTime 2019��11��1�� ����9:01:44 
 */

public class Actor {
	
	private String type ;// ��ɫ����
	
	private	String sex;//
	
	private String face; //����
	
	private String costume ;// ��װ
	
	private String hairstyle;//����

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public String getCostume() {
		return costume;
	}

	public void setCostume(String costume) {
		this.costume = costume;
	}

	public String getHairstyle() {
		return hairstyle;
	}

	public void setHairstyle(String hairstyle) {
		this.hairstyle = hairstyle;
	}

	@Override
	public String toString() {
		return "Actor [type=" + type + ", sex=" + sex + ", face=" + face + ", costume=" + costume + ", hairstyle="
				+ hairstyle + "]";
	}
	
	
	
}
