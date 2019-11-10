package strategyPattern;

/**
 * 
 * @ClassName: Discount
 * @Description: 折扣类,充当抽象策略类 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午3:52:25
 */
public interface Discount {
	public double calculate(double price);
}
