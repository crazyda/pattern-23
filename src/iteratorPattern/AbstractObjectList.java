/**
 * @Title: AbstractObjectList.java
 * @Package iteratorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��8�� ����10:42:11
 * @version V1.0
 */

package iteratorPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: AbstractObjectList
 * @Description:  ����ۺ���
 * @Author Crazy
 * @DateTime 2019��11��8�� ����10:42:11 
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
	
	//������������������ĳ��󹤳�����
	public abstract AbstractIterator createIterator();
	
}
