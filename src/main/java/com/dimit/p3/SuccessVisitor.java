package com.dimit.p3;

/**
 * Dimit 2015年1月14日 成功时访问器
 */
public class SuccessVisitor implements Visitor, ManVisitor, WomenVisitor,ChildVisitor,MonsterVisitor {

	@Override
	public void visit(Man man) {
		System.out.println("当男人成功时，背后多半有一个伟大的女人");
	}

	@Override
	public void visit(Women w) {
		System.out.println("当女人成功时，背后大多有一个不成功的男人");
	}

	@Override
	public void visit(Child c) {
		System.out.println("当小孩成功时，只会哈哈傻笑。。。");
	}

	@Override
	public void visit(Monster mo) {
		System.out.println("当怪兽成功时他会怪笑。。。");
	}

}
