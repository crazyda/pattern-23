/**
 * @Title: ConcreteAllyControlCenter.java
 * @Package observerPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����12:31:15
 * @version V1.0
 */

package observerPattern;

/**
 * @ClassName: ConcreteAllyControlCenter
 * @Description:  ����ָ�Ӳ���,�䵱����Ŀ����
 * @Author Crazy
 * @DateTime 2019��11��9�� ����12:31:15 
 */

public class ConcreteAllyControlCenter extends AllyControlCenter {

	
	public ConcreteAllyControlCenter(String allyName) {
		System.out.println(allyName+"ս���齨�ɹ�");
		this.allyName = allyName;
	}

	@Override
	public void notifyObserver(String name) {
		// TODO Auto-generated method stub
		System.out.println(this.allyName+"ս�ӽ���֪ͨ,����"+name+"���ܵ��˹���");
		for(Object obs : players) {
			if(((Observer)obs).getName().equalsIgnoreCase(name)) {
				((Observer)obs).help();
			}
		}
		
	}

}
