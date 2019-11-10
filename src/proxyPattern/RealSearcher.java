package proxyPattern;

/**
 * 
 * @ClassName: RealSearcher
 * @Description: 具体查询类,充当真实主题角色,它实现查询功能, 
 * @Author Crazy
 * @DateTime 2019年11月6日 下午8:50:02
 */
public class RealSearcher implements Searcher {

	@Override
	public String doSearch(String userId, String keyword) {
		// TODO Auto-generated method stub
		System.out.println("用户"+userId+",使用关键词"+keyword+"查询商务信息");
		return "返回具体内容";
	}

}
