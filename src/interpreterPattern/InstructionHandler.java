package interpreterPattern;

import java.util.Stack;

/**
 * 
 * @ClassName: InstructionHandler
 * @Description: ָ�����,������ 
 * @Author Crazy
 * @DateTime 2019��11��8�� ����9:51:26
 */
public class InstructionHandler {
	private AbstractNode node;
	public void handle(String instruction) {
		AbstractNode left = null ,right = null;
		AbstractNode direction = null ,action = null , distance = null;
		Stack<AbstractNode> stack = new Stack<AbstractNode>();
		String[] words = instruction.split(" ");
		for(int i=0;i<words.length;i++) {
			if(words[i].equalsIgnoreCase("and")) {
				left = stack.pop(); //����ջ�����ʽ��Ϊ����ʽ
				String word1 = words[++i];
				direction = new DirectionNode(word1);
				String word2 = words[++i];
				action = new ActionNode(word2);
				String word3 = words[++i];
				distance = new DistanceNode(word3);
				right = new SentenceNode(direction, action, distance);//�ұ��ʽ
				stack.push(new AndNode(left, right));
				
				
			}else {
				String word1 = words[i];
				direction = new DirectionNode(word1);
				String word2 = words[++i];
				action = new ActionNode(word2);
				String word3 = words[++i];
				distance = new DistanceNode(word3);
				left = new SentenceNode(direction, action, distance);//�ұ��ʽ
				stack.push(left);
			}
		}
		this.node = stack.pop();
	}
	
	public String outPut() {
		String result = node.interpret();
		return result;
	}
}
