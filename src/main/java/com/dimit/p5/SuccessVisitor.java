package com.dimit.p5;
/**
 * Dimit 2015年1月17日
 */
public class SuccessVisitor implements Visitor ,ManVisitor,WomenVisitor{

	@Override
	public void visit(Man m) {
		System.out.println("男人成功了。。。");
	}

	@Override
	public void visit(Women w) {
		System.out.println("女人成功了。。。");
	}

}

