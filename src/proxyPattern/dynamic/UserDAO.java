/**
 * @Title: UserDAO.java
 * @Package proxyPattern.dynamic
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月6日 下午9:11:58
 * @version V1.0
 */

package proxyPattern.dynamic;

/**
 * @ClassName: UserDAO
 * @Description: 用户DAO 类,具体主题角色
 * @Author Crazy
 * @DateTime 2019年11月6日 下午9:11:58 
 */

public class UserDAO implements AbstractUserDAO {


	@Override
	public Boolean findUserById(String userId) {
		if(userId.equalsIgnoreCase("张无忌")) {
			System.out.println("查询id为"+userId+"的用户信息成功");
			return true;
		}
		System.out.println("查询id为"+userId+"的用户信息失败");
		return false;
	}

}
