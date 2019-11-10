package singletonPattern.EagerSingleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EagerSingleton {

	private List serverList = null ;

	//��������ģʽ  ���౻����ʱ����̬����instance �ᱻ��ʼ������ʱ���˽�й��캯���ᱻ���ã� �������Ψһʵ��������
		private static final EagerSingleton instance = new EagerSingleton();

		public EagerSingleton() {
			serverList = new ArrayList<>();
			// TODO Auto-generated constructor stub
		}
		
		public static EagerSingleton getInstance() {
			return instance;
		}
		
		//���ӷ�����
		public void addServer(String server) {
			serverList.add(server);
		}
		
		public String getServer() {
			Random random = new Random();
			int i = random.nextInt(serverList.size());
			return (String) serverList.get(i);
		}
}
