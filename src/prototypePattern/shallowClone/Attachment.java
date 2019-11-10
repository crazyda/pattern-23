/**
 * @Title: Attachment.java
 * @Package prototypePattern.shallowClone
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��2�� ����10:02:18
 * @version V1.0
 */

package prototypePattern.shallowClone;

/**
 * @ClassName: Attachment
 * @Description: ������
 * @Author Crazy
 * @DateTime 2019��11��2�� ����10:02:18 
 */

public class Attachment {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void download() {
		System.out.println("���ظ���,�ļ���"+name);
	}
}
