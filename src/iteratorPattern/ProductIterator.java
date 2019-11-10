/**
 * @Title: ProductIterator.java
 * @Package iteratorPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��8�� ����10:51:21
 * @version V1.0
 */

package iteratorPattern;

import java.util.List;

/**
 * @ClassName: ProductIterator
 * @Description: ��Ʒ������, �䵱���������
 * @Author Crazy
 * @DateTime 2019��11��8�� ����10:51:21 
 */

public class ProductIterator implements AbstractIterator {
	private List<Object> products ; 
	private int cursor1 ; // �α�,��¼���������λ��
	private int cursor2 ; //��¼���������λ��
	

	public ProductIterator(ProductList list) {
		this.products =list.getObjects(); //��ȡ���϶���
		cursor1 = 0; // ��ʼֵ
		cursor2 = products.size()-1;
	}
	

	@Override
	public void next() {
		if(cursor1 <products.size()) {
			cursor1 ++;
		}

	}


	@Override
	public boolean isLast() {
		// TODO Auto-generated method stub
		return cursor1 == products.size();
	}

	/*
	 * <p>Title: previous</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��8�� ����10:51:21 
	 * @see iteratorPattern.AbstractIterator#previous() 
	 */

	@Override
	public void previous() {
		// TODO Auto-generated method stub
		if(cursor2 > -1) {
			cursor2-- ;
		}
	}

	/*
	 * <p>Title: isFirst</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��8�� ����10:51:21
	 * @return 
	 * @see iteratorPattern.AbstractIterator#isFirst() 
	 */

	@Override
	public boolean isFirst() {
		// TODO Auto-generated method stub
		return cursor2==-1;
	}

	/*
	 * <p>Title: getNextItem</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��8�� ����10:51:21
	 * @return 
	 * @see iteratorPattern.AbstractIterator#getNextItem() 
	 */

	@Override
	public Object getNextItem() {
		// TODO Auto-generated method stub
		return products.get(cursor1);
	}

	/*
	 * <p>Title: getPreviousItem</p>
	 * <p>Description: </p>
	 * @Author Crazy
	 * @DateTime 2019��11��8�� ����10:51:21
	 * @return 
	 * @see iteratorPattern.AbstractIterator#getPreviousItem() 
	 */

	@Override
	public Object getPreviousItem() {
		// TODO Auto-generated method stub
		return products.get(cursor2);
	}

}
