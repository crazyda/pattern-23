package visitorPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeList list = new EmployeeList();
		Employee fte1,fte2,fte3,pte1,pte2;
		
		fte1 = new FulltimeEmployee("���޼�", 3200, 45);
		fte2 = new FulltimeEmployee("���", 2000, 40);
		fte3 = new FulltimeEmployee("����", 2400, 38);
		
		pte1 = new ParttimeEmployee("���߹�", 80, 20);
		pte2 = new ParttimeEmployee("����", 60, 18);
	
		list.addEmployee(fte1);
		list.addEmployee(fte2);
		list.addEmployee(fte3);
		
		list.addEmployee(pte1);
		list.addEmployee(pte2);
		
		Department dep  = new FADepartment();
		list.accept(dep);
		
		Department dep1  = new HRDepartement();
		list.accept(dep1);
		
	
	}

}
