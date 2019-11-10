package strategyPattern;
/**
 * 
 * @ClassName: ChildrenDiscount
 * @Description: ��ͯƱ�ۿ���, �䵱���������  
 * @Author Crazy
 * @DateTime 2019��11��9�� ����3:56:24
 */
public class ChildrenDiscount implements Discount{
	private final double DISCOUNT = 10;
	
	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		System.out.println("��ͯƱ:");
		if(price >= 20) {
			return price - DISCOUNT;
		}else {
			return price ;
		}
	}

}
