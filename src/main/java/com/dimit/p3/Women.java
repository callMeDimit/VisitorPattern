package com.dimit.p3;
/**
 * Dimit 2015年1月13日
 */
public class Women implements Person {

	@Override
	public void accept(Visitor v) {
		if(v instanceof WomenVisitor) {
			WomenVisitor w = (WomenVisitor) v;
			w.visit(this);
		}
	}
	
}

