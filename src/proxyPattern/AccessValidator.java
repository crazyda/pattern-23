package proxyPattern;

/**
 * 
 * @ClassName: AccessValidator
 * @Description: �����֤��, ҵ����, �ṩValidate()������ʵ�������֤ 
 * @Author Crazy
 * @DateTime 2019��11��6�� ����8:44:34
 */
public class AccessValidator {

	public boolean validate(String userId) {
		System.out.println("�����ݿ�����֤�û�"+userId+"�Ƿ�Ϊ�Ϸ��û�");
		if(userId.equalsIgnoreCase("���")) {
			System.out.println("'"+userId+"'��½�ɹ�");
			return true;
		}else {
			System.out.println("��¼ʧ��");
			return false;
		}
	}
}
