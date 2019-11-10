/**
 * @Title: WeeklyLog.java
 * @Package prototypePattern.shallowClone
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月2日 上午10:04:21
 * @version V1.0
 */

package prototypePattern.shallowClone;

/**
 * @ClassName: WeeklyLog
 * @Description: 充当原型角色,
 * @Author Crazy
 * @DateTime 2019年11月2日 上午10:04:21 
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
			System.out.println("不支持复制");
		}
		return null;
	
	
	}
	
	//使用 clone() 实现浅克隆
	
	
	
}
