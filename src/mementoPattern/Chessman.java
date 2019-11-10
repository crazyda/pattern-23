/**
 * @Title: Chessman.java
 * @Package mementoPattern
 * @Description: 
 * Copyright: Copyright (c) 2018
 * Website: www.panzhijie.cn
 * 
 * @Author Crazy
 * @DateTime 2019年11月9日 上午11:18:05
 * @version V1.0
 */

package mementoPattern;

/**
 * @ClassName: Chessman
 * @Description:  象棋棋子类, 充当原发器
 * @Author Crazy
 * @DateTime 2019年11月9日 上午11:18:05 
 */

public class Chessman {
	private String label;
	private int x;
	private int y;
	
	public Chessman(String label, int x, int y) {
		super();
		this.label = label;
		this.x = x;
		this.y = y;
	}
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
	
	//保存状态
	public ChessmanMemento save() {
		return new ChessmanMemento(this.label,this.x,this.y);
	}
	//恢复状态
	public void restore(ChessmanMemento memento) {
		this.label = memento.getLabel();
		this.x = memento.getX();
		this.y = memento.getY();
	}

}
