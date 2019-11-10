package strategyPattern;
/**
 * 
 * @ClassName: ChildrenDiscount
 * @Description: 儿童票折扣类, 充当具体策略类  
 * @Author Crazy
 * @DateTime 2019年11月9日 下午3:56:24
 */
public class ChildrenDiscount implements Discount{
	private final double DISCOUNT = 10;
	
	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		System.out.println("儿童票:");
		if(price >= 20) {
			return price - DISCOUNT;
		}else {
			return price ;
		}
	}

}
