/**
 * @Title: PoliceCarAdapter.java
 * @Package adapterPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��2�� ����8:33:12
 * @version V1.0
 */

package adapterPattern;

/**
 * @ClassName: PoliceCarAdapter
 * @Description: ������������ �䵱������
 * @Author Crazy
 * @DateTime 2019��11��2�� ����8:33:12 
 */

public class BaomaAdapter extends CarController {
	Baomaluntai lt;
	
	
	
	public BaomaAdapter() {
		lt = new Baomaluntai();
	}

	@Override
	public void phonate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void twinkle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void luntai() {
		// TODO Auto-generated method stub
		lt.luntai();
	}

	@Override
	public void fangxiang() {
		// TODO Auto-generated method stub
		
	}

	
	

}
