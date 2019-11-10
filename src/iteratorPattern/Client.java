package iteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> products = new ArrayList<Object>();
		products.add("���콣");
		products.add("������");
		products.add("�ϳ���");
		products.add("��������");
		products.add("�ž�");
		products.add("java");
		AbstractObjectList list;
		AbstractIterator iterator;
		list = new ProductList(products);//�����ۺ϶���
		iterator = list.createIterator(); // ��������������
		System.out.println("�������");
		while(!iterator.isLast()) {
			System.out.println(iterator.getNextItem());
			iterator.next();
		}
		System.out.println("�������");
		while(!iterator.isFirst()) {
			System.out.println(iterator.getPreviousItem());
			iterator.previous();
		}
	}

}
