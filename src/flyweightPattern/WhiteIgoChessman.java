/**
 * @Title: BlackIgoChessman.java
 * @Package flyweight
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月5日 下午9:18:54
 * @version V1.0
 */

package flyweightPattern;

/**
 * @ClassName: BlackIgoChessman
 * @Description: 黑色棋子, 充当具体享元类
 * @Author Crazy
 * @DateTime 2019年11月5日 下午9:18:54 
 */

public class WhiteIgoChessman extends IgoChessman {

	/*
	 * <p>Title: getColor</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年11月5日 下午9:18:55
	 * @return 
	 * @see flyweight.IgoChessman#getColor() 
	 */

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "白色";
	}

}
