package singletonPattern.EagerSingleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EagerSingleton {

	private List serverList = null ;

	//饿汉单例模式  当类被加载时，静态变量instance 会被初始化，此时类的私有构造函数会被调用， 单例类的唯一实例被创建
		private static final EagerSingleton instance = new EagerSingleton();

		public EagerSingleton() {
			serverList = new ArrayList<>();
			// TODO Auto-generated constructor stub
		}
		
		public static EagerSingleton getInstance() {
			return instance;
		}
		
		//增加服务器
		public void addServer(String server) {
			serverList.add(server);
		}
		
		public String getServer() {
			Random random = new Random();
			int i = random.nextInt(serverList.size());
			return (String) serverList.get(i);
		}
}
