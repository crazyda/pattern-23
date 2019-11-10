/**
 * @Title: DAOLogHandler.java
 * @Package proxyPattern.dynamic
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��6�� ����9:16:29
 * @version V1.0
 */

package proxyPattern.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @ClassName: DAOLogHandler
 * @Description: �Զ��������������
 * @Author Crazy
 * @DateTime 2019��11��6�� ����9:16:29 
 */

public class DAOLogHandler implements InvocationHandler {
	private Calendar calendar;
	private Object object;
	
	
	public DAOLogHandler() {
		super();
	}

	

	public DAOLogHandler(Object object) {
		super();
		this.object = object;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		beforeInvoke();
		Object result = method.invoke(object, args);
		afterInvoke();
	
		return result;
	}
	
	public void beforeInvoke() {
		calendar = new GregorianCalendar();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		String time = hour+":"+minute+":"+second;
		System.out.println("����ʱ��:"+time);
		
	}
	public void afterInvoke() {
		System.out.println("�������ý���");
	}
	

}
