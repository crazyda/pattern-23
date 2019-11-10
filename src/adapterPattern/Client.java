package adapterPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarController car = new PoliceCarAdapter();
		car.move();
		car.phonate();
		car.twinkle();
		CarController baoma = new BaomaAdapter();
		baoma.move();
		baoma.luntai();
	}

}
