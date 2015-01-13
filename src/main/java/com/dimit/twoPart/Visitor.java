package com.dimit.twoPart;
/**
 * Dimit 2015年1月13日
 */
public interface Visitor {
	/**
	 * 访问男人
	 * @param m
	 */
	void visit(Man m);
	/**
	 * 访问女人
	 * @param w
	 */
	void visit(Women w);
	
	/**
	 * 小孩
	 * @param c
	 */
	void visit(Child c);
	
	/**
	 * 怪兽
	 * @param m
	 */
	void visit(Monster m);
}

