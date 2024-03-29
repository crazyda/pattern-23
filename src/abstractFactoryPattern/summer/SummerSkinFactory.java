package abstractFactoryPattern.summer;

import abstractFactoryPattern.Button;
import abstractFactoryPattern.ComboBox;
import abstractFactoryPattern.SkinFactory;
import abstractFactoryPattern.TextField;

public class SummerSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new SummerButton();
	}

	@Override
	public TextField createTextField() {
		// TODO Auto-generated method stub
		return new SummerTextField();
	}

	@Override
	public ComboBox createComboBox() {
		// TODO Auto-generated method stub
		return new SummerComboBox();
	}

}
