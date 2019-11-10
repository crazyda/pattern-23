package proxyPattern;

/**
 * 
 * @ClassName: AccessValidator
 * @Description: 身份验证类, 业务类, 提供Validate()方法来实现身份验证 
 * @Author Crazy
 * @DateTime 2019年11月6日 下午8:44:34
 */
public class AccessValidator {

	public boolean validate(String userId) {
		System.out.println("在数据库中验证用户"+userId+"是否为合法用户");
		if(userId.equalsIgnoreCase("杨过")) {
			System.out.println("'"+userId+"'登陆成功");
			return true;
		}else {
			System.out.println("登录失败");
			return false;
		}
	}
}
