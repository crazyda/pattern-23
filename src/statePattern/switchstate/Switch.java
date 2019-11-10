package statePattern.switchstate;

/**
 * 
 * @ClassName: Switch
 * @Description: ������ 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����3:08:20
 */
public class Switch {
	private static SwitchState currentState,onState,offState; 
	private String name ;
	
	public Switch(String name) {
		super();
		this.name = name;
		onState = new Onstate();
		offState = new OffState();
		currentState = onState;
	}
	
	public void setState(SwitchState state) {
		currentState = state;
	}
	
	public static SwitchState getState(String type) {
		if(type.equalsIgnoreCase("on")) {
			return onState;
		}else {
			return offState;
		}
	}
	
	public void on() {
		System.out.println(name);
		currentState.on(this);
	}
	
	public void off() {
		System.out.println(name);
		currentState.off(this);
	}
	


}
