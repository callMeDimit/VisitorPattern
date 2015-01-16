package com.dimit.p3;

/**
 * Dimit 2015年1月13日
 */
public interface Person {
	/**
	 * 接收访问器
	 * @param v
	 */
	void accept(Visitor v);
}
