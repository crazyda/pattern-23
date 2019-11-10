package visitorPattern;

import java.util.ArrayList;

/**
 * 
 * @ClassName: EmployeeList
 * @Description: 员工列表类, 充当对象结构 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午5:20:37
 */
public class EmployeeList {
	
	private ArrayList<Employee> list = new ArrayList<Employee>();
	
	public void addEmployee(Employee employee) {
		list.add(employee);
	}

	//遍历访问员工集合中的每一个员工对象
	public void accept(Department handler) {
		list.forEach( i -> {
			i.accept(handler);
		});
	}
}
