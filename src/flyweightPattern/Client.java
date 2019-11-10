package flyweightPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IgoChessman black1,black2,black3,white1,white2;
		IgoChessmanFactory factory;
		//获取享元工厂对象
		factory = IgoChessmanFactory.getInstance();
		//通过享元工厂获取3颗黑色
		black1 = factory.getIgoChessman("b");
		black2 = factory.getIgoChessman("b");
		black3 = factory.getIgoChessman("b");
		
		System.out.println("判断是否相同"+(black1==black2));
		
		white1 = factory.getIgoChessman("w");
		white2 = factory.getIgoChessman("w");
		System.out.println("判断白色是否相同:"+(white1==white2));
		
		black1.display();
		black2.display();
		black3.display();
		white1.display();
		white2.display();
		
	}

}
