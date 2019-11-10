/**
 * @Title: ProductList.java
 * @Package iteratorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��8�� ����10:49:07
 * @version V1.0
 */

package iteratorPattern;

import java.util.List;

/**
 * @ClassName: ProductList
 * @Description: 
 * @Author Crazy
 * @DateTime 2019��11��8�� ����10:49:07 
 */

public class ProductList extends AbstractObjectList{

	public ProductList(List<Object> objects) {
		super(objects);
		// TODO Auto-generated constructor stub
	}
	//��������������ľ��幤������

	@Override
	public AbstractIterator createIterator() {
		// TODO Auto-generated method stub
		return new ProductIterator(this);
	}
	

}
