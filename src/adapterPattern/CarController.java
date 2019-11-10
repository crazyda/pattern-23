/**
 * @Title: CarControoler.java
 * @Package adapterPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��2�� ����8:28:28
 * @version V1.0
 */

package adapterPattern;

/**
 * @ClassName: CarControoler
 * @Description: 	���������࣬�䵱Ŀ�������
 * @Author Crazy
 * @DateTime 2019��11��2�� ����8:28:28 
 */

public abstract class CarController {
		
	public void move() {
		System.out.println("��������ƶ�");
	}
	
	public abstract void phonate();//��������
	public abstract void twinkle();//�ƹ���˸
	public abstract void luntai();
	public abstract void fangxiang();

}
