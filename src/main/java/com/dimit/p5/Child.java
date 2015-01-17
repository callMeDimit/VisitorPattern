package com.dimit.p5;
/**
 * Dimit 2015年1月17日
 */
public class Child implements Person {

	@Override
	public void accept(ReflectionVisitor v) {
		v.visit(this);
	}

}

