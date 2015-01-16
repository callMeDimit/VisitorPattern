package com.dimit.p3;

/**
 * Dimit 2015年1月13日
 */
public class Child implements Person {

	@Override
	public void accept(Visitor v) {
		if (v instanceof ChildVisitor) {
			ChildVisitor cv = (ChildVisitor) v;
			cv.visit(this);
		}
	}

}
