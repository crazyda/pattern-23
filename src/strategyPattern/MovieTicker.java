package strategyPattern;

/**
 * 
 * @ClassName: MovieTicker
 * @Description: 电影票类, 充当环境类 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午3:51:16
 */
public class MovieTicker {
	private double price;
	private Discount discount ;// 维持一个对抽象折扣类的引用
	
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
