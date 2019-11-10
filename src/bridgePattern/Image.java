/**
 * @Title: Image.java
 * @Package bridgePattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��2�� ����10:00:22
 * @version V1.0
 */

package bridgePattern;

/**
 * @ClassName: Image
 * @Description: ����ͼ���࣬�䵱������
 * @Author Crazy
 * @DateTime 2019��11��2�� ����10:00:22 
 */

public abstract class Image {
	protected ImageImp imp ;
	
	//ע��ʵ����ӿڶ���
	public void setImageImp(ImageImp imp) {
		this.imp = imp;
	}

	public abstract void parseFile(String fileName);
	
}
