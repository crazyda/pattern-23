/**
 * @Title: FulltimeEmployee.java
 * @Package visitorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午5:07:16
 * @version V1.0
 */

package visitorPattern;

/**
 * @ClassName: FulltimeEmployee
 * @Description: 兼职员工类, 充当具体元素
 * @Author Crazy
 * @DateTime 2019年11月9日 下午5:07:16 
 */

public class ParttimeEmployee implements Employee {

	private String name;
	private double hourWage;
	private int workTime;
	
	

	public ParttimeEmployee(String name, double hourWage, int workTime) {
		super();
		this.name = name;
		this.hourWage = hourWage;
		this.workTime = workTime;
	}



	@Override
	public void accept(Department handler) {
		// TODO Auto-generated method stub
		handler.visit(this);
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}





	public int getWorkTime() {
		return workTime;
	}



	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}



	public double getHourWage() {
		return hourWage;
	}



	public void setHourWage(double hourWage) {
		this.hourWage = hourWage;
	}

}
