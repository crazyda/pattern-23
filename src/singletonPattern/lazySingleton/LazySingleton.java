package singletonPattern.lazySingleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LazySingleton {

	private List serverList = null ;

	//懒汉单例模式  
		private volatile static  LazySingleton instance = null;

		public LazySingleton() {
			serverList = new ArrayList<>();
			// TODO Auto-generated constructor stub
		}
		
		public static LazySingleton getInstance() {
			if(instance == null) {
				synchronized(LazySingleton.class) {
					if(instance == null ) {
						System.out.println("nei");
						instance = new LazySingleton();
					}
				}
				
			}
			
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
