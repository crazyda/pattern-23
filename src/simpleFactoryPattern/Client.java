package simpleFactoryPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chart chart;
		chart = ChartFactory.getChart("histogram");
		chart.display();
	}

}
