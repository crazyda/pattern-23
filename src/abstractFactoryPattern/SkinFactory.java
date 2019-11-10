package abstractFactoryPattern;
/**
 * 
 * @ClassName: SkinFactory
 * @Description:����Ƥ�������ӿ�,�䵱���󹤳� 
 * @Author Crazy
 * @DateTime 2019��10��31�� ����10:54:01
 */
public interface SkinFactory {
	
	public Button createButton();
	
	public TextField createTextField();
	
	public ComboBox createComboBox();
}
