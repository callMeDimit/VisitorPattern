package com.dimit.twoPart;
/**
 * Dimit 2015年1月13日
 */
public class Child implements Person {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}

