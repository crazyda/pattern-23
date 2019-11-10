package strategyPattern;
/**
 * 
 * @ClassName: StudentDiscount
 * @Description: 会员票折扣类, 充当具体策略类 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午3:56:00
 */
public class VIPDiscount implements Discount{
	private final double DISCOUNT = 0.5;
	
	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		System.out.println("vip票:");
		System.out.println("增加积分");
		return price * DISCOUNT;
	}

}
