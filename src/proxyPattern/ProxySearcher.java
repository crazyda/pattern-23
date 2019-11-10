/**
 * @Title: ProxySearcher.java
 * @Package proxyPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��6�� ����8:51:51
 * @version V1.0
 */

package proxyPattern;

/**
 * @ClassName: ProxySearcher
 * @Description: �����ѯ�� �䵱���������ɫ, ��ʱ��ѯ����,λ���˶�RealSearcher����,
 * @Author Crazy
 * @DateTime 2019��11��6�� ����8:51:51 
 */

public class ProxySearcher implements Searcher {

	private RealSearcher searcher = new RealSearcher();//ά��һ����ʵi���������
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
