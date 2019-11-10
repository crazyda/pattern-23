/**
 * @Title: DocumentDAO.java
 * @Package proxyPattern.dynamic
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月6日 下午9:14:05
 * @version V1.0
 */

package proxyPattern.dynamic;

/**
 * @ClassName: DocumentDAO
 * @Description: 具体主题角色
 * @Author Crazy
 * @DateTime 2019年11月6日 下午9:14:05 
 */

public class DocumentDAO implements AbstractDocumentDAO {


	@Override
	public Boolean deleteDocumentById(String documentId) {
		if (documentId.equalsIgnoreCase("D001")) {
			System.out.println("删除id为"+documentId+"的文档成功");
			return true;
		}
		System.out.println("删除id为"+documentId+"的文档失败");
		return false;
	}

}
