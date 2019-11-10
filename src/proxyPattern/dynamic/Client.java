package proxyPattern.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {
		InvocationHandler handler = null;
		AbstractUserDAO userDAO = new UserDAO();
		handler = new DAOLogHandler(userDAO);
		AbstractUserDAO proxy = null;
		//动态创建代理对象,用于代理一个 AbstractUserDAO 类型的真实主题对象
		proxy = (AbstractUserDAO)Proxy.newProxyInstance(AbstractUserDAO.class.getClassLoader(),new Class[] {AbstractUserDAO.class},handler);
		
		proxy.findUserById("张无忌");
		System.out.println("--------------------");
		
		AbstractDocumentDAO docDAO = new DocumentDAO();
		handler = new DAOLogHandler(docDAO);
		AbstractDocumentDAO proxy_new = null;
		
		proxy_new = (AbstractDocumentDAO)Proxy.newProxyInstance(AbstractDocumentDAO.class.getClassLoader(),new Class[] {AbstractDocumentDAO.class},handler);
		
		proxy_new.deleteDocumentById("D001");
	
	}
}
