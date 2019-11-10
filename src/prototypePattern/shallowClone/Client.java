package prototypePattern.shallowClone;

public class Client {
	public static void main(String[] args) {
		WeeklyLog log_previous,log_new;
		log_previous = new WeeklyLog(); // ����ԭ�Ͷ���
		Attachment attachment = new Attachment(); // ������������
		
		log_previous.setAttachment(attachment); // 
		log_new = log_previous.clone();
		
		System.out.println("�ܱ��Ƿ���ͬ:"+(log_previous == log_new));
		
		System.out.println("�����Ƿ���ͬ:"+(log_previous.getAttachment() == log_new.getAttachment()));
	}
}
