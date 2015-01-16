package com.dimit.p4;

/**
 * Dimit 2015年1月16日
 */
public class LoveVisitor extends ReflectionVisitor {
	public void visit(Man m) {
		System.out.println("当男人恋爱时，凡事不懂也装懂");
	}

	public void visit(Women w) {
		System.out.println("当女人恋爱时，遇事懂也装不懂");
	}
}
