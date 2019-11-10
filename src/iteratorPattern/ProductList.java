/**
 * @Title: ProductList.java
 * @Package iteratorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月8日 下午10:49:07
 * @version V1.0
 */

package iteratorPattern;

import java.util.List;

/**
 * @ClassName: ProductList
 * @Description: 
 * @Author Crazy
 * @DateTime 2019年11月8日 下午10:49:07 
 */

public class ProductList extends AbstractObjectList{

	public ProductList(List<Object> objects) {
		super(objects);
		// TODO Auto-generated constructor stub
	}
	//创建迭代器对象的具体工厂方法

	@Override
	public AbstractIterator createIterator() {
		// TODO Auto-generated method stub
		return new ProductIterator(this);
	}
	

}
