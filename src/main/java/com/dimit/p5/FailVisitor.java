package com.dimit.p5;


/**
 * Dimit 2015年1月17日
 */
public class FailVisitor implements Visitor,ManVisitor,WomenVisitor,MonsterVisitor {

	@Override
	public void visit(Man m) {
		System.out.println("男人失败了。。。");
	}

	@Override
	public void visit(Women w) {
		System.out.println("女人失败了。。。");
	}

	@Override
	public void visit(Monster mo) {
		System.out.println("怪兽失败了。。。");
	}
}

