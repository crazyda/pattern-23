package commandPattern.calculator;

/**
 * 
 * @ClassName: AbstractCommand
 * @Description: �䵱����������,  
 * @Author Crazy
 * @DateTime 2019��11��8�� ����9:09:15
 */
public abstract class AbstractCommand {
	public abstract int execute(int value); //��������ִ�з��� 
	public abstract int undo(); // ������������
	
	

}
