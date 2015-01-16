package com.dimit.p3;
/**
 * Dimit 2015年1月13日
 */
public class Man implements Person {

	@Override
	public void accept(Visitor v) {
		if(v instanceof ManVisitor) {
			ManVisitor mv = (ManVisitor) v;
			mv.visit(this);
		}
	}

}

