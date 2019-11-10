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
 * @Description: 全职员工类, 充当具体元素类
 * @Author Crazy
 * @DateTime 2019年11月9日 下午5:07:16 
 */

public class FulltimeEmployee implements Employee {

	private String name;
	private double weeklywage;
	private int workTime;
	
	

	public FulltimeEmployee(String name, double weeklywage, int workTime) {
		super();
		this.name = name;
		this.weeklywage = weeklywage;
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



	public double getWeeklywage() {
		return weeklywage;
	}



	public void setWeeklywage(double weeklywage) {
		this.weeklywage = weeklywage;
	}



	public int getWorkTime() {
		return workTime;
	}



	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}

}
