package statePattern.screen;

/**]
 * 
 * @ClassName: Screen
 * @Description: 屏幕环境类 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午3:22:18
 */
public class Screen {
	//枚举所有的状态, 
	private ScreenState currentState,normalState,largerState,largestState;

	public Screen() {
		super();
		
		this.normalState = new NormalState();
		this.largerState = new LargerState();
		this.largestState = new LargestState();
		this.currentState = normalState;
		this.currentState.display();
		// TODO Auto-generated constructor stub
	}
	
	public void setState(ScreenState state) {
		this.currentState = state;
	}
	
	//单击事件处理方法,封装了对状态类中业务方法的调用和状态的转换
	public void onClick() {
		if(this.currentState == normalState) {
			this.setState(largerState);
			this.currentState.display();
		}else if(this.currentState == largerState) {
			this.setState(largestState);
			this.currentState.display();
		}else if(this.currentState == largestState) {
			this.setState(normalState);
			this.currentState.display();
		}
	}
	
	
}
