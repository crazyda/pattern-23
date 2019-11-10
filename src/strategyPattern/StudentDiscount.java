package strategyPattern;
/**
 * 
 * @ClassName: StudentDiscount
 * @Description: 学生票折扣类, 充当具体策略类 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午3:56:00
 */
public class StudentDiscount implements Discount{
	private final double DISCOUNT = 0.8;
	
	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		System.out.println("学生票:");
		return price * DISCOUNT;
	}

}
