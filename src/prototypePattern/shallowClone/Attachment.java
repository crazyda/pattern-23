/**
 * @Title: Attachment.java
 * @Package prototypePattern.shallowClone
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月2日 上午10:02:18
 * @version V1.0
 */

package prototypePattern.shallowClone;

/**
 * @ClassName: Attachment
 * @Description: 福建类
 * @Author Crazy
 * @DateTime 2019年11月2日 上午10:02:18 
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
		System.out.println("下载附件,文件名"+name);
	}
}
