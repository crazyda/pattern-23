package visitorPattern;
/**
 * 
 * @ClassName: HRDepartement
 * @Description: 人力资源部, 充当具体访问者类 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午5:16:28
 */
public class HRDepartement extends Department {

	@Override
	public void visit(FulltimeEmployee employee) {
		// TODO Auto-generated method stub
		int workTime = employee.getWorkTime();
		System.out.println("正式员工"+employee.getName()+"实际工作时间:"+workTime);
		if(workTime > 40) {
			System.out.println("正式员工"+employee.getName()+"加班时间:"+(workTime - 40));
		}else if(workTime < 40) {
			System.out.println("正式员工"+employee.getName()+"请假时间:"+(40 - workTime));
		}

	}

	@Override
	public void visit(ParttimeEmployee employee) {
		// TODO Auto-generated method stub
		int workTime = employee.getWorkTime();
		System.out.println("临时工"+employee.getName()+"实际工作时间:"+(workTime));
		
	}

}
