/**
 * @Title: TextBox.java
 * @Package modiatorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 上午10:22:09
 * @version V1.0
 */

package modiatorPattern;

/**
 * @ClassName: TextBox
 * @Description: 文本框类, 充当具体同事类
 * @Author Crazy
 * @DateTime 2019年11月9日 上午10:22:09 
 */

public class TextBox extends Component{

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("客户信息增加成功后文本框情况");
		
	}
	
	public void setText() {
		System.out.println("文本框显示:小龙女");
	}

}
