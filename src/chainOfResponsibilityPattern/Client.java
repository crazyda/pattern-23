package chainOfResponsibilityPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Approver wjzhang,gyang,jgou,meeting,rhuang;
		wjzhang = new Director("���޼�");
		gyang = new VicePresident("���");
		jgou = new President("����");
		meeting = new Congress("���»�");
		rhuang = new Manager("����");
		
		//����������
		wjzhang.setSuccessor(rhuang);
		rhuang.setSuccessor(gyang);
		gyang.setSuccessor(jgou);
		jgou.setSuccessor(meeting);
		
		
		//�����ɹ���
		PurchaseRequest pr1 = new PurchaseRequest(45000,10001,"�������콣");
		wjzhang.processRequest(pr1);
		PurchaseRequest pr2 = new PurchaseRequest(60000,10002,"�����������");
		wjzhang.processRequest(pr2);

		PurchaseRequest pr3 = new PurchaseRequest(160000,10003,"�����վ�");
		wjzhang.processRequest(pr3);
		PurchaseRequest pr4 = new PurchaseRequest(800000,10004,"�����һ���");
		wjzhang.processRequest(pr4);
	}	

}
