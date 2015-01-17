package com.dimit.p5;

/**
 * Dimit 2015年1月17日
 */
public interface ReflectionVisitor {
	String METHODNAME = "visit";

	void visit(Person p);

	void updateVisitor(Visitor v);
}
