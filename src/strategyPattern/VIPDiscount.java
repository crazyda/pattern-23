package strategyPattern;
/**
 * 
 * @ClassName: StudentDiscount
 * @Description: ��ԱƱ�ۿ���, �䵱��������� 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����3:56:00
 */
public class VIPDiscount implements Discount{
	private final double DISCOUNT = 0.5;
	
	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		System.out.println("vipƱ:");
		System.out.println("���ӻ���");
		return price * DISCOUNT;
	}

}
