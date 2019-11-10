/**
 * @Title: DocumentDAO.java
 * @Package proxyPattern.dynamic
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��6�� ����9:14:05
 * @version V1.0
 */

package proxyPattern.dynamic;

/**
 * @ClassName: DocumentDAO
 * @Description: ���������ɫ
 * @Author Crazy
 * @DateTime 2019��11��6�� ����9:14:05 
 */

public class DocumentDAO implements AbstractDocumentDAO {


	@Override
	public Boolean deleteDocumentById(String documentId) {
		if (documentId.equalsIgnoreCase("D001")) {
			System.out.println("ɾ��idΪ"+documentId+"���ĵ��ɹ�");
			return true;
		}
		System.out.println("ɾ��idΪ"+documentId+"���ĵ�ʧ��");
		return false;
	}

}
