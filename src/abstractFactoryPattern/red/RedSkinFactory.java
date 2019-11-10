package abstractFactoryPattern.red;

import abstractFactoryPattern.Button;
import abstractFactoryPattern.ComboBox;
import abstractFactoryPattern.SkinFactory;
import abstractFactoryPattern.TextField;

public class RedSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new RedButton();
	}

	@Override
	public TextField createTextField() {
		// TODO Auto-generated method stub
		return new RedTextField();
	}

	@Override
	public ComboBox createComboBox() {
		// TODO Auto-generated method stub
		return new RedComboBox();
	}

}
