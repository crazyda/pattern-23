package visitorPattern;
/**
 * 
 * @ClassName: HRDepartement
 * @Description: ������Դ��, �䵱����������� 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����5:16:28
 */
public class HRDepartement extends Department {

	@Override
	public void visit(FulltimeEmployee employee) {
		// TODO Auto-generated method stub
		int workTime = employee.getWorkTime();
		System.out.println("��ʽԱ��"+employee.getName()+"ʵ�ʹ���ʱ��:"+workTime);
		if(workTime > 40) {
			System.out.println("��ʽԱ��"+employee.getName()+"�Ӱ�ʱ��:"+(workTime - 40));
		}else if(workTime < 40) {
			System.out.println("��ʽԱ��"+employee.getName()+"���ʱ��:"+(40 - workTime));
		}

	}

	@Override
	public void visit(ParttimeEmployee employee) {
		// TODO Auto-generated method stub
		int workTime = employee.getWorkTime();
		System.out.println("��ʱ��"+employee.getName()+"ʵ�ʹ���ʱ��:"+(workTime));
		
	}

}
