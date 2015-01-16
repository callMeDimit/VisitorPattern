package com.dimit.p3;
/**
 * Dimit 2015年1月13日
 */
public class Monster implements Person {

	@Override
	public void accept(Visitor v) {
		if(v instanceof MonsterVisitor) {
			MonsterVisitor mv = (MonsterVisitor) v;
			mv.visit(this);
		}
	}

}

