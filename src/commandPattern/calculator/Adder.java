package commandPattern.calculator;

/**
 * 
 * @ClassName: Adder
 * @Description: 加法类, 充当请求接收者 
 * @Author Crazy
 * @DateTime 2019年11月8日 下午9:08:01
 */
public class Adder {
	private int num = 0;
	
	public int add(int value) {
		num+=value;
		return num;
	}

}
