package statePattern.screen;

/**]
 * 
 * @ClassName: Screen
 * @Description: ��Ļ������ 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����3:22:18
 */
public class Screen {
	//ö�����е�״̬, 
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
	
	//�����¼�������,��װ�˶�״̬����ҵ�񷽷��ĵ��ú�״̬��ת��
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
