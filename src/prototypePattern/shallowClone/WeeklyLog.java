/**
 * @Title: WeeklyLog.java
 * @Package prototypePattern.shallowClone
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��2�� ����10:04:21
 * @version V1.0
 */

package prototypePattern.shallowClone;

/**
 * @ClassName: WeeklyLog
 * @Description: �䵱ԭ�ͽ�ɫ,
 * @Author Crazy
 * @DateTime 2019��11��2�� ����10:04:21 
 */

public class WeeklyLog implements Cloneable {
	private Attachment attachment;
	
	private String name ;
	
	private String date;
	
	private String content;

	public Attachment getAttachment() {
		return attachment;
	}

	public void setAttachment(Attachment attachment) {
		this.attachment = attachment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	protected WeeklyLog clone()  {
		try {
			Object obj = super.clone();
			return (WeeklyLog)obj;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("��֧�ָ���");
		}
		return null;
	
	
	}
	
	//ʹ�� clone() ʵ��ǳ��¡
	
	
	
}
