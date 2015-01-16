package com.dimit.p3;

/**
 * Dimit 2015年1月16日
 */
public class LoveVisitor implements Visitor, WomenVisitor, ManVisitor,
		MonsterVisitor {

	@Override
	public void visit(Man man) {
		System.out.println("当男人恋爱时，凡事不懂也装懂 ");
	}

	@Override
	public void visit(Women w) {
		System.out.println("当女人恋爱时，遇事懂也装不懂 ");
	}

	@Override
	public void visit(Monster mo) {
		System.out.println("怪兽没有爱。。。");
	}

}
