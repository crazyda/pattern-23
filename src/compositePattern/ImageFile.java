/**
 * @Title: ImageFile.java
 * @Package compositePattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月3日 上午11:43:44
 * @version V1.0
 */

package compositePattern;

/**
 * @ClassName: ImageFile
 * @Description: 图像文件类, 充当叶子构件类
 * @Author Crazy
 * @DateTime 2019年11月3日 上午11:43:44 
 */

public class ImageFile extends AbstractFile {
	private String name;
	
	
	
	public ImageFile(String name) {
		this.name = name;
	}


	public ImageFile() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public void add(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("不支持该方法(add)");
	}


	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("不支持该方法(remove)");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("不支持该方法getChild");
		return null;
	}


	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("对图像文件"+name+"杀毒");
	}

}
