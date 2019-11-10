package mementoPattern;

public class Client2 {
	private static int index = -1;
	private static MementoCaretaker2 mc = new MementoCaretaker2();

	public static void main(String[] args) {
		Chessman chess = new Chessman("��",1,1);
		play(chess);
		chess.setY(4);
		play(chess);
		chess.setX(5);
		play(chess);
		undo(chess,index);
		undo(chess,index);
		redo(chess,index);
		redo(chess,index);
		
		
	}
	//����
	public static void play(Chessman chess) {
		mc.setMemento(chess.save());//���汸��¼
		index ++;
		System.out.println("����"+chess.getLabel()+",��ǰλ��Ϊ:��"+chess.getX()+"��,��"+chess.getY()+"��");
	}
	
	//����
	public static void undo(Chessman chess,int i) {
		System.out.println("����");
		index--;
		chess.restore(mc.getMemento(i-1));//����֮��һ������¼
		System.out.println("����"+chess.getLabel()+",��ǰλ��Ϊ:��"+chess.getX()+"��,��"+chess.getY()+"��");
	}
	
	//��������
	public static void redo(Chessman chess,int i) {
		System.out.println("��������");
		index++;
		chess.restore(mc.getMemento(i+1));//����֮��һ������¼
		System.out.println("����"+chess.getLabel()+",��ǰλ��Ϊ:��"+chess.getX()+"��,��"+chess.getY()+"��");
	}

}
