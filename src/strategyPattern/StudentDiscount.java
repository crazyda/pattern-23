package strategyPattern;
/**
 * 
 * @ClassName: StudentDiscount
 * @Description: ѧ��Ʊ�ۿ���, �䵱��������� 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����3:56:00
 */
public class StudentDiscount implements Discount{
	private final double DISCOUNT = 0.8;
	
	@Override
	public double calculate(double price) {
		// TODO Auto-generated method stub
		System.out.println("ѧ��Ʊ:");
		return price * DISCOUNT;
	}

}
