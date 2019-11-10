/**
 * @Title: UnixImp.java
 * @Package bridgePattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��2�� ����9:58:12
 * @version V1.0
 */

package bridgePattern;

/**
 * @ClassName: UnixImp
 * @Description: 
 * @Author Crazy
 * @DateTime 2019��11��2�� ����9:58:12 
 */

public class UnixImp implements ImageImp {

	/*
	 * <p>Title: doPaint</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��2�� ����9:58:12
	 * @param m 
	 * @see bridgePattern.ImageImp#doPaint(bridgePattern.Matrix) 
	 */

	@Override
	public void doPaint(Matrix m) {
		// TODO Auto-generated method stub
		//����Unixϵͳ�Ļ��ƺ��� �������ؾ���
		System.out.println("��Unix����ϵͳ����ʾͼƬ");
				
	}

}
