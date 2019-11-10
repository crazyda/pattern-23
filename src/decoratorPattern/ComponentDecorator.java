package decoratorPattern;

/**
 * 
 * @ClassName: ComponentDecorator
 * @Description: ����װ����, �䵱����װ���� 
 * @Author Crazy
 * @DateTime 2019��11��3�� ����2:37:09
 */
public class ComponentDecorator extends Component {
	private Component component;
	
	
	public ComponentDecorator(Component component) {
		this.component = component;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		component.display();
	}

}
