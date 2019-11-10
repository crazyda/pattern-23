package abstractFactoryPattern;
/**
 * 
 * @ClassName: SkinFactory
 * @Description:界面皮肤工厂接口,充当抽象工厂 
 * @Author Crazy
 * @DateTime 2019年10月31日 下午10:54:01
 */
public interface SkinFactory {
	
	public Button createButton();
	
	public TextField createTextField();
	
	public ComboBox createComboBox();
}
