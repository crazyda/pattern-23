/**
 * @Title: ComboBox.java
 * @Package modiatorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 上午10:24:07
 * @version V1.0
 */

package modiatorPattern;

/**
 * @ClassName: ComboBox
 * @Description: 组合框类, 充当具体同事类
 * @Author Crazy
 * @DateTime 2019年11月9日 上午10:24:07 
 */

public class ComboBox extends Component{

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("组合框增加一项:张无忌");
	}

	public void select() {
		System.out.println("组合框选中项:小龙女");
	}
}
