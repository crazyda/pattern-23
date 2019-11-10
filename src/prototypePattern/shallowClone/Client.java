package prototypePattern.shallowClone;

public class Client {
	public static void main(String[] args) {
		WeeklyLog log_previous,log_new;
		log_previous = new WeeklyLog(); // 创建原型对象
		Attachment attachment = new Attachment(); // 创建附件对象
		
		log_previous.setAttachment(attachment); // 
		log_new = log_previous.clone();
		
		System.out.println("周报是否相同:"+(log_previous == log_new));
		
		System.out.println("附件是否相同:"+(log_previous.getAttachment() == log_new.getAttachment()));
	}
}
