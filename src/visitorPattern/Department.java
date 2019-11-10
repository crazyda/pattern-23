/**
 * @Title: Department.java
 * @Package visitorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 下午5:05:13
 * @version V1.0
 */

package visitorPattern;

/**
 * @ClassName: Department
 * @Description: 部门类, 充当抽象访问者类
 * @Author Crazy
 * @DateTime 2019年11月9日 下午5:05:13 
 */

public abstract class Department {
	//声明一组重载的访问方法,用于访问不同类型的具体元素
	public abstract void visit(FulltimeEmployee employee);
	public abstract void visit(ParttimeEmployee employee);

}
