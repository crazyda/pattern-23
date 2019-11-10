/**
 * @Title: AbstractObjectList.java
 * @Package iteratorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月8日 下午10:42:11
 * @version V1.0
 */

package iteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: AbstractObjectList
 * @Description:  抽象聚合类
 * @Author Crazy
 * @DateTime 2019年11月8日 下午10:42:11 
 */

public abstract class AbstractObjectList {
	protected List<Object> objects = new ArrayList<Object>();

	public AbstractObjectList(List<Object> objects) {
		super();
		this.objects = objects;
	}
	public void addObject(Object obj) {
		this.objects.add(obj);
	}
	public void removeObject(Object obj) {
		this.objects.remove(obj);
		
	}
	public List<Object> getObjects(){
		return this.objects;
	}
	
	//声明创建迭代器对象的抽象工厂方法
	public abstract AbstractIterator createIterator();
	
}
