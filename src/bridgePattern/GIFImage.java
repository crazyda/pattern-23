/**
 * @Title: JPGImage.java
 * @Package bridgePattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月2日 下午10:03:29
 * @version V1.0
 */

package bridgePattern;

/**
 * @ClassName: JPGImage
 * @Description: 
 * @Author Crazy
 * @DateTime 2019年11月2日 下午10:03:29 
 */

public class GIFImage extends Image {

	@Override
	public void parseFile(String fileName) {
		// 模拟解析jpg 文件获得像素矩阵对象m
		Matrix m = new Matrix();
		imp.doPaint(m);
		System.out.println(fileName + "格式为 GIF");
		
	}

	
}
