package decoratorPattern;

/**
 * 
 * @ClassName: Window
 * @Description:窗体类,充当具体构件类 
 * @Author Crazy
 * @DateTime 2019年11月3日 下午2:34:51
 */
public class Window extends Component {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("显示窗体");
	}

}
