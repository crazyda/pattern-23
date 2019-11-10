package decoratorPattern;

/**
 * 
 * @ClassName: ComponentDecorator
 * @Description: 构件装饰类, 充当抽象装饰类 
 * @Author Crazy
 * @DateTime 2019年11月3日 下午2:37:09
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
