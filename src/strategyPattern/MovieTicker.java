package strategyPattern;

/**
 * 
 * @ClassName: MovieTicker
 * @Description: ��ӰƱ��, �䵱������ 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����3:51:16
 */
public class MovieTicker {
	private double price;
	private Discount discount ;// ά��һ���Գ����ۿ��������
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	
	public double getPrice() {
		return discount.calculate(this.price);
	}
	
}
