/**
 * @Title: LinuxImp.java
 * @Package bridgePattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月2日 下午9:59:32
 * @version V1.0
 */

package bridgePattern;

/**
 * @ClassName: LinuxImp
 * @Description: 
 * @Author Crazy
 * @DateTime 2019年11月2日 下午9:59:32 
 */

public class LinuxImp implements ImageImp {

	/*
	 * <p>Title: doPaint</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年11月2日 下午9:59:32
	 * @param m 
	 * @see bridgePattern.ImageImp#doPaint(bridgePattern.Matrix) 
	 */

	@Override
	public void doPaint(Matrix m) {
		//调用linux系统的绘制函数 绘制像素矩阵
		System.out.println("在linux操作系统中显示图片");
				

	}

}
