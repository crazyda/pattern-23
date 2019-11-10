/**
 * @Title: Image.java
 * @Package bridgePattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月2日 下午10:00:22
 * @version V1.0
 */

package bridgePattern;

/**
 * @ClassName: Image
 * @Description: 抽象图像类，充当抽象类
 * @Author Crazy
 * @DateTime 2019年11月2日 下午10:00:22 
 */

public abstract class Image {
	protected ImageImp imp ;
	
	//注入实现类接口对象
	public void setImageImp(ImageImp imp) {
		this.imp = imp;
	}

	public abstract void parseFile(String fileName);
	
}
