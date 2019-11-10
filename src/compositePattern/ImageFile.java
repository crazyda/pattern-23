/**
 * @Title: ImageFile.java
 * @Package compositePattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��3�� ����11:43:44
 * @version V1.0
 */

package compositePattern;

/**
 * @ClassName: ImageFile
 * @Description: ͼ���ļ���, �䵱Ҷ�ӹ�����
 * @Author Crazy
 * @DateTime 2019��11��3�� ����11:43:44 
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
		System.out.println("��֧�ָ÷���(add)");
	}


	@Override
	public void remove(AbstractFile file) {
		// TODO Auto-generated method stub
		System.out.println("��֧�ָ÷���(remove)");
	}

	@Override
	public AbstractFile getChild(int i) {
		// TODO Auto-generated method stub
		System.out.println("��֧�ָ÷���getChild");
		return null;
	}


	@Override
	public void killVirus() {
		// TODO Auto-generated method stub
		System.out.println("��ͼ���ļ�"+name+"ɱ��");
	}

}
