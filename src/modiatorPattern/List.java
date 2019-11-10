/**
 * @Title: List.java
 * @Package modiatorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 上午10:25:51
 * @version V1.0
 */

package modiatorPattern;


/**
 * @ClassName: List
 * @Description: 
 * @Author Crazy
 * @DateTime 2019年11月9日 上午10:25:51 
 */

public class List extends Component {

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("列表框增加一项 :张无忌");
	}

	public void select() {
		System.out.println("列表框中选中:小龙女");
	}
	

}
