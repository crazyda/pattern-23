/**
 * @Title: ProxySearcher.java
 * @Package proxyPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月6日 下午8:51:51
 * @version V1.0
 */

package proxyPattern;

/**
 * @ClassName: ProxySearcher
 * @Description: 代理查询类 充当代理主题角色, 它时查询代理,位置了对RealSearcher对象,
 * @Author Crazy
 * @DateTime 2019年11月6日 下午8:51:51 
 */

public class ProxySearcher implements Searcher {

	private RealSearcher searcher = new RealSearcher();//维持一个真实i对象的引用
	private AccessValidator validator;
	private Logger logger;

	@Override
	public String doSearch(String userId, String keyword) {
		if(this.validate(userId)) {
			String result = searcher.doSearch(userId, keyword);
			this.log(userId);
			return result;
		}
		return null;
	}

	
	public boolean validate(String userId) {
		validator = new AccessValidator();
		return validator.validate(userId);
		
	}
	
	public void log(String userId) {
		logger = new Logger();
		logger.log(userId);
	}
	
}
