package visitorPattern;
/**
 * 
 * @ClassName: FADepartment
 * @Description: 财务部类, 充当具体访问者类 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午5:10:43
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
		System.out.println("正式员工"+employee.getName()+"实际工资为:"+weekWage);
	}

	@Override
	public void visit(ParttimeEmployee employee) {
		// TODO Auto-generated method stub
		int workTime = employee.getWorkTime();
		double hourWage = employee.getHourWage();
		System.out.println("临时工:"+employee.getName()+"实际工资为:"+workTime*hourWage);
		
	}

}
