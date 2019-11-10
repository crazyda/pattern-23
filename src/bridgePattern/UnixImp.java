/**
 * @Title: UnixImp.java
 * @Package bridgePattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月2日 下午9:58:12
 * @version V1.0
 */

package bridgePattern;

/**
 * @ClassName: UnixImp
 * @Description: 
 * @Author Crazy
 * @DateTime 2019年11月2日 下午9:58:12 
 */

public class UnixImp implements ImageImp {

	/*
	 * <p>Title: doPaint</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年11月2日 下午9:58:12
	 * @param m 
	 * @see bridgePattern.ImageImp#doPaint(bridgePattern.Matrix) 
	 */

	@Override
	public void doPaint(Matrix m) {
		// TODO Auto-generated method stub
		//调用Unix系统的绘制函数 绘制像素矩阵
		System.out.println("在Unix操作系统中显示图片");
				
	}

}
