package com.dimit.p5;
/**
 * Dimit 2015年1月17日
 */
public class LoveVisitor implements Visitor,ManVisitor,WomenVisitor {

	@Override
	public void visit(Women w) {
		System.out.println("女人恋爱了。。。");
	}

	@Override
	public void visit(Man m) {
		System.out.println("男人恋爱了。。。");
	}

}

