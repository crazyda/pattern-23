package singletonPattern.lazySingleton;

public class Client {

	public static void main(String[] args) {
		
		LazySingleton balancer1,balancer2,balancer3,balancer4;
		balancer1 = LazySingleton.getInstance();
		balancer2 = LazySingleton.getInstance();
		balancer3 = LazySingleton.getInstance();
		balancer4 = LazySingleton.getInstance();
		
		if(balancer1 == balancer2 
				&& balancer2 == balancer3
				&& balancer3 == balancer4) {
			System.out.println("服务器负载均衡器 具有唯一性");
		}
		
		//增加服务器
		balancer1.addServer("server1");
		balancer1.addServer("server2");
		balancer1.addServer("server3");
		balancer1.addServer("server4");
		for(int i=0;i<10;i++) {
			String server = balancer3.getServer();
			System.out.println(server);
		}
		
	}

}
