/**
 * @Title: UserDAO.java
 * @Package proxyPattern.dynamic
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��6�� ����9:11:58
 * @version V1.0
 */

package proxyPattern.dynamic;

/**
 * @ClassName: UserDAO
 * @Description: �û�DAO ��,���������ɫ
 * @Author Crazy
 * @DateTime 2019��11��6�� ����9:11:58 
 */

public class UserDAO implements AbstractUserDAO {


	@Override
	public Boolean findUserById(String userId) {
		if(userId.equalsIgnoreCase("���޼�")) {
			System.out.println("��ѯidΪ"+userId+"���û���Ϣ�ɹ�");
			return true;
		}
		System.out.println("��ѯidΪ"+userId+"���û���Ϣʧ��");
		return false;
	}

}
