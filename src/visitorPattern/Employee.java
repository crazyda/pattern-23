package visitorPattern;

/**
 * 
 * @ClassName: Employee
 * @Description: Ա����,�䵱����Ԫ���� 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����5:04:04
 */
public interface Employee {
	public void accept(Department handler);// ����һ����������߷���

}
