package proxyPattern;

/**
 * 
 * @ClassName: Searcher
 * @Description:抽象查询类,充当抽象主题角色 
 * @Author Crazy
 * @DateTime 2019年11月6日 下午8:48:48
 */
public interface Searcher {

	public String doSearch(String userId,String keyword);
}
