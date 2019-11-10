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

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: MementoCaretaker
 * @Description:  �������ӱ���¼������, �䵱������   ʵ�ֶ�γ���
 * @Author Crazy
 * @DateTime 2019��11��9�� ����11:22:44 
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
