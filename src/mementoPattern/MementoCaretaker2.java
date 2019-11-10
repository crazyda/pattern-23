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

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: MementoCaretaker
 * @Description:  象棋棋子备忘录管理类, 充当负责人   实现多次撤销
 * @Author Crazy
 * @DateTime 2019年11月9日 上午11:22:44 
 */

public class MementoCaretaker2 {
	private List<ChessmanMemento> mementolist = new ArrayList<ChessmanMemento>() ;

	public ChessmanMemento getMemento(int i) {
		return mementolist.get(i);
	}

	public void setMemento(ChessmanMemento memento) {
		mementolist.add(memento);
	}
	
}
