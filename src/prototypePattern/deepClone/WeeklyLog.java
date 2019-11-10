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

package prototypePattern.deepClone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @ClassName: WeeklyLog
 * @Description: 充当原型角色,
 * @Author Crazy
 * @DateTime 2019年11月2日 上午10:04:21 
 */

public class WeeklyLog implements Serializable {
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

	public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bao);
		oos.writeObject(this);
		ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return (WeeklyLog) ois.readObject();
		
	}
	
	
	
}
