package com.dimit.twoPart;
/**
 * Dimit 2015年1月13日
 * 化妆访问器
 */
public class MakeupVisitor extends AbstractVisitor {

	@Override
	public void visit(Man m) {
	}

	@Override
	public void visit(Women w) {
		System.out.println("女人就是这么任性。每天都要化妆。。。");
	}

}

