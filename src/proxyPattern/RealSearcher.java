package proxyPattern;

/**
 * 
 * @ClassName: RealSearcher
 * @Description: �����ѯ��,�䵱��ʵ�����ɫ,��ʵ�ֲ�ѯ����, 
 * @Author Crazy
 * @DateTime 2019��11��6�� ����8:50:02
 */
public class RealSearcher implements Searcher {

	@Override
	public String doSearch(String userId, String keyword) {
		// TODO Auto-generated method stub
		System.out.println("�û�"+userId+",ʹ�ùؼ���"+keyword+"��ѯ������Ϣ");
		return "���ؾ�������";
	}

}
