package com.dimit.p4;

/**
 * Dimit 2015年1月16日
 */
public class Man implements Person {

	@Override
	public void accept(ReflectionVisitor v) {
		v.visit(this);
	}
}
