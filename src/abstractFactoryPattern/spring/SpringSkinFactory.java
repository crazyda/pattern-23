package abstractFactoryPattern.spring;

import abstractFactoryPattern.Button;
import abstractFactoryPattern.ComboBox;
import abstractFactoryPattern.SkinFactory;
import abstractFactoryPattern.TextField;

public class SpringSkinFactory implements SkinFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new SpringButton();
	}

	@Override
	public TextField createTextField() {
		// TODO Auto-generated method stub
		return new SpringTextField();
	}

	@Override
	public ComboBox createComboBox() {
		// TODO Auto-generated method stub
		return new SpringComboBox();
	}

}
