package com.dimit.p5;
/**
 * Dimit 2015年1月16日
 */
public class Women implements Person {

	@Override
	public void accept(ReflectionVisitor v) {
		v.visit(this);
	}



}

