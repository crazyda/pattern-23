/**
 * @Title: WindowsImp.java
 * @Package bridgePattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��2�� ����9:56:05
 * @version V1.0
 */

package bridgePattern;

/**
 * @ClassName: WindowsImp
 * @Description:  ����ʵ����
 * @Author Crazy
 * @DateTime 2019��11��2�� ����9:56:05 
 */

public class WindowsImp implements ImageImp {

	/*
	 * <p>Title: doPaint</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��2�� ����9:56:05
	 * @param m 
	 * @see bridgePattern.ImageImpl#doPaint(bridgePattern.Matrix) 
	 */

	@Override
	public void doPaint(Matrix m) {
		//����windowsϵͳ�Ļ��ƺ��� �������ؾ���
		System.out.println("��windows����ϵͳ����ʾͼƬ");
		

	}

}
