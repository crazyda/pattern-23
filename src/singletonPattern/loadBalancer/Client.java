package singletonPattern.loadBalancer;

public class Client {

	public static void main(String[] args) {
		
		LoadBalancer balancer1,balancer2,balancer3,balancer4;
		balancer1 = LoadBalancer.getLoadBalancer();
		balancer2 = LoadBalancer.getLoadBalancer();
		balancer3 = LoadBalancer.getLoadBalancer();
		balancer4 = LoadBalancer.getLoadBalancer();
		
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
			String server = balancer2.getServer();
			System.out.println(server);
		}
		
	}

}
