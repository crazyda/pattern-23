package simpleFactoryPattern;

public class LineChart implements Chart {

	
	
	public LineChart() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("创建折线图");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("显示折线图");
	}

}
