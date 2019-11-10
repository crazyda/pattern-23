/**
 * @Title: ChessmanMemento.java
 * @Package mementoPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 上午11:19:55
 * @version V1.0
 */

package mementoPattern;

/**
 * @ClassName: ChessmanMemento
 * @Description: 象棋 棋子备忘录, 充当备忘录
 * @Author Crazy
 * @DateTime 2019年11月9日 上午11:19:55 
 */

public class ChessmanMemento {
	private String label;
	private int x;
	private int y;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public ChessmanMemento(String label, int x, int y) {
		super();
		this.label = label;
		this.x = x;
		this.y = y;
	}
	

}
