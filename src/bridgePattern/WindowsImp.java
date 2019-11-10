/**
 * @Title: WindowsImp.java
 * @Package bridgePattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月2日 下午9:56:05
 * @version V1.0
 */

package bridgePattern;

/**
 * @ClassName: WindowsImp
 * @Description:  具体实现类
 * @Author Crazy
 * @DateTime 2019年11月2日 下午9:56:05 
 */

public class WindowsImp implements ImageImp {

	/*
	 * <p>Title: doPaint</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年11月2日 下午9:56:05
	 * @param m 
	 * @see bridgePattern.ImageImpl#doPaint(bridgePattern.Matrix) 
	 */

	@Override
	public void doPaint(Matrix m) {
		//调用windows系统的绘制函数 绘制像素矩阵
		System.out.println("在windows操作系统中显示图片");
		

	}

}
