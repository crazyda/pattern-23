package interpreterPattern;

/**
 * 
 * @ClassName: DistanceNode
 * @Description: 距离节点类, 充当终结符表达式角色 
 * @Author Crazy
 * @DateTime 2019年11月8日 下午9:50:23
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
