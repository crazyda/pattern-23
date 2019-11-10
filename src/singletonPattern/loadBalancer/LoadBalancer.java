package singletonPattern.loadBalancer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
	//˽�о�̬��Ա������ �洢 Ψһʵ��
	private static LoadBalancer instance = null;
	
	//����������
	private List serverList = null ;

	//˽�й��캯��
	public LoadBalancer() {
		serverList = new ArrayList<>();
	}
	
	//���о�̬��Ա����������Ψһʵ��
	public static LoadBalancer getLoadBalancer() {
		if(instance  == null) {
			instance = new LoadBalancer();
		}
		return instance;
	}
	
	//���ӷ�����
	public void addServer(String server) {
		serverList.add(server);
	}
	
	
	//ɾ��������
	public void removerServer (String server) {
		serverList.remove(server);
	}
	
	//����random �������ȡ������
	public String getServer() {
		Random random = new Random();
		int i = random.nextInt(serverList.size());
		return (String) serverList.get(i);
	}
	
}
