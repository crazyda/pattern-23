/**
 * @Title: MementoCaretaker.java
 * @Package mementoPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 上午11:22:44
 * @version V1.0
 */

package mementoPattern;

/**
 * @ClassName: MementoCaretaker
 * @Description:  象棋棋子备忘录管理类, 充当负责人
 * @Author Crazy
 * @DateTime 2019年11月9日 上午11:22:44 
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
