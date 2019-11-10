package interpreterPattern;

/**
 * 
 * @ClassName: DistanceNode
 * @Description: ����ڵ���, �䵱�ս�����ʽ��ɫ 
 * @Author Crazy
 * @DateTime 2019��11��8�� ����9:50:23
 */
public class DistanceNode extends AbstractNode {
	private String distance ;
	
	public DistanceNode(String distance) {
		super();
		this.distance = distance;
	}

	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		return this.distance;
	}

}
