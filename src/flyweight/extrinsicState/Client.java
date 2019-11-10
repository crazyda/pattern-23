package flyweight.extrinsicState;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IgoChessman black1,black2,black3,white1,white2;
		IgoChessmanFactory factory;
		//��ȡ��Ԫ��������
		factory = IgoChessmanFactory.getInstance();
		//ͨ����Ԫ������ȡ3�ź�ɫ
		black1 = factory.getIgoChessman("b");
		black2 = factory.getIgoChessman("b");
		black3 = factory.getIgoChessman("b");
		
		System.out.println("�ж��Ƿ���ͬ"+(black1==black2));
		
		white1 = factory.getIgoChessman("w");
		white2 = factory.getIgoChessman("w");
		System.out.println("�жϰ�ɫ�Ƿ���ͬ:"+(white1==white2));
		
		black1.display(new Coordinates(1,2));
		black2.display(new Coordinates(3,4));
		black3.display(new Coordinates(1,3));
		white1.display(new Coordinates(2,5));
		white2.display(new Coordinates(2,4));
		
	}

}
