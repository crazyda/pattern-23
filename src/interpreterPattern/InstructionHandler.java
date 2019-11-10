package interpreterPattern;

import java.util.Stack;

/**
 * 
 * @ClassName: InstructionHandler
 * @Description: 指令处理类,工具类 
 * @Author Crazy
 * @DateTime 2019年11月8日 下午9:51:26
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
				left = stack.pop(); //弹出栈顶表达式作为左表达式
				String word1 = words[++i];
				direction = new DirectionNode(word1);
				String word2 = words[++i];
				action = new ActionNode(word2);
				String word3 = words[++i];
				distance = new DistanceNode(word3);
				right = new SentenceNode(direction, action, distance);//右表达式
				stack.push(new AndNode(left, right));
				
				
			}else {
				String word1 = words[i];
				direction = new DirectionNode(word1);
				String word2 = words[++i];
				action = new ActionNode(word2);
				String word3 = words[++i];
				distance = new DistanceNode(word3);
				left = new SentenceNode(direction, action, distance);//右表达式
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
