package visitorPattern;

import java.util.ArrayList;

/**
 * 
 * @ClassName: EmployeeList
 * @Description: Ա���б���, �䵱����ṹ 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����5:20:37
 */
public class EmployeeList {
	
	private ArrayList<Employee> list = new ArrayList<Employee>();
	
	public void addEmployee(Employee employee) {
		list.add(employee);
	}

	//��������Ա�������е�ÿһ��Ա������
	public void accept(Department handler) {
		list.forEach( i -> {
			i.accept(handler);
		});
	}
}
