package abstractFactoryPattern;

import abstractFactoryPattern.summer.SummerSkinFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SkinFactory factory ;
		Button bt ;
		TextField tf ;
		ComboBox cb;
//		factory = new SpringSkinFactory();
		factory = new SummerSkinFactory();
//		factory = new RedSkinFactory();
		bt = factory.createButton();
		tf = factory.createTextField();
		cb = factory.createComboBox();
		bt.display();
		tf.display();
		cb.display();
	}

}
