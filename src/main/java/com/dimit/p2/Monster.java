package com.dimit.p2;
/**
 * Dimit 2015年1月13日
 */
public class Monster implements Person {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}

