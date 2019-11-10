package strategyPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieTicker mt = new MovieTicker();
		double originalPrice = 60.0;
		double currentPrice ;
		mt.setPrice(originalPrice);
		System.out.println("‘≠º€:"+originalPrice);
		Discount discount = new StudentDiscount();
		mt.setDiscount(discount);
		currentPrice = mt.getPrice();
		System.out.println("’€ø€º€:"+currentPrice);
	}

}
