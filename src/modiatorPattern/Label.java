/**
 * @Title: Label.java
 * @Package modiatorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 上午10:37:33
 * @version V1.0
 */

package modiatorPattern;

/**
 * @ClassName: Label
 * @Description: 
 * @Author Crazy
 * @DateTime 2019年11月9日 上午10:37:33 
 */

public class Label extends Component {

	/*
	 * <p>Title: update</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019年11月9日 上午10:37:33 
	 * @see modiatorPattern.Component#update() 
	 */

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("文本标签内容发生改变,客户信息总数增加1");

	}

}
