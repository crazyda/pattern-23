package proxyPattern.dynamic;

/**
 * 
 * @ClassName: AbstractUserDAO
 * @Description:抽象用户DAO类, 抽象主题角色 
 * @Author Crazy
 * @DateTime 2019年11月6日 下午9:09:57
 */
public interface AbstractUserDAO {
	public Boolean findUserById(String userId);
}
