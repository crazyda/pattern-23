package visitorPattern;
/**
 * 
 * @ClassName: FADepartment
 * @Description: ������, �䵱����������� 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����5:10:43
 */
public class FADepartment extends Department {

	@Override
	public void visit(FulltimeEmployee employee) {
		// TODO Auto-generated method stub
		int workTime = employee.getWorkTime();
		double weekWage = employee.getWeeklywage();
		if(workTime > 40) {
			weekWage = weekWage + (workTime -40) * 100;
		}else if(workTime < 40) {
			weekWage = weekWage -(40 - workTime) * 80;
			if(weekWage < 0) {
				weekWage = 0;
			}
		}
		System.out.println("��ʽԱ��"+employee.getName()+"ʵ�ʹ���Ϊ:"+weekWage);
	}

	@Override
	public void visit(ParttimeEmployee employee) {
		// TODO Auto-generated method stub
		int workTime = employee.getWorkTime();
		double hourWage = employee.getHourWage();
		System.out.println("��ʱ��:"+employee.getName()+"ʵ�ʹ���Ϊ:"+workTime*hourWage);
		
	}

}
