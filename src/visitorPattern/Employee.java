package visitorPattern;

/**
 * 
 * @ClassName: Employee
 * @Description: 员工类,充当抽象元素类 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午5:04:04
 */
public interface Employee {
	public void accept(Department handler);// 接受一个抽象访问者访问

}
