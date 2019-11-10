/**
 * @Title: LinuxImp.java
 * @Package bridgePattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��2�� ����9:59:32
 * @version V1.0
 */

package bridgePattern;

/**
 * @ClassName: LinuxImp
 * @Description: 
 * @Author Crazy
 * @DateTime 2019��11��2�� ����9:59:32 
 */

public class LinuxImp implements ImageImp {

	/*
	 * <p>Title: doPaint</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��2�� ����9:59:32
	 * @param m 
	 * @see bridgePattern.ImageImp#doPaint(bridgePattern.Matrix) 
	 */

	@Override
	public void doPaint(Matrix m) {
		//����linuxϵͳ�Ļ��ƺ��� �������ؾ���
		System.out.println("��linux����ϵͳ����ʾͼƬ");
				

	}

}
