/**
 * @Title: MementoCaretaker.java
 * @Package mementoPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019��11��9�� ����11:22:44
 * @version V1.0
 */

package mementoPattern;

/**
 * @ClassName: MementoCaretaker
 * @Description:  �������ӱ���¼������, �䵱������
 * @Author Crazy
 * @DateTime 2019��11��9�� ����11:22:44 
 */

public class MementoCaretaker {
	private ChessmanMemento memento ;

	public ChessmanMemento getMemento() {
		return memento;
	}

	public void setMemento(ChessmanMemento memento) {
		this.memento = memento;
	}
	
}
