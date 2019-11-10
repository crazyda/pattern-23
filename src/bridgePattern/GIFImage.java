/**
 * @Title: JPGImage.java
 * @Package bridgePattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��2�� ����10:03:29
 * @version V1.0
 */

package bridgePattern;

/**
 * @ClassName: JPGImage
 * @Description: 
 * @Author Crazy
 * @DateTime 2019��11��2�� ����10:03:29 
 */

public class GIFImage extends Image {

	@Override
	public void parseFile(String fileName) {
		// ģ�����jpg �ļ�������ؾ������m
		Matrix m = new Matrix();
		imp.doPaint(m);
		System.out.println(fileName + "��ʽΪ GIF");
		
	}

	
}
