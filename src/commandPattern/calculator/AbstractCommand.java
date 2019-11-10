package commandPattern.calculator;

/**
 * 
 * @ClassName: AbstractCommand
 * @Description: 充当抽象命令类,  
 * @Author Crazy
 * @DateTime 2019年11月8日 下午9:09:15
 */
public abstract class AbstractCommand {
	public abstract int execute(int value); //声明命令执行方法 
	public abstract int undo(); // 声明撤销方法
	
	

}
