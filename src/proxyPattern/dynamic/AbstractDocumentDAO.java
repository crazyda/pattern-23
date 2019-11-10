package proxyPattern.dynamic;

/**
 * 
 * @ClassName: AbstractDocumentDAO
 * @Description: 抽象文档DAO 类 抽象主题角色 
 * @Author Crazy
 * @DateTime 2019年11月6日 下午9:10:51
 */
public interface AbstractDocumentDAO {

	public Boolean deleteDocumentById(String documentId);
}
