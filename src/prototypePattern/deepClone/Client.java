package prototypePattern.deepClone;

import java.io.IOException;

public class Client {
	public static void main(String[] args) {
		WeeklyLog log_previous,log_new = null;
		log_previous = new WeeklyLog(); // ����ԭ�Ͷ���
		Attachment attachment = new Attachment(); // ������������
		
		log_previous.setAttachment(attachment); // 
		try {
			log_new = log_previous.deepClone();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("�ܱ��Ƿ���ͬ:"+(log_previous == log_new));
		
		System.out.println("�����Ƿ���ͬ:"+(log_previous.getAttachment() == log_new.getAttachment()));
	}
}
