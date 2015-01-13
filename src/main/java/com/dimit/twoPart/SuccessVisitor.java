package com.dimit.twoPart;

/**
 * Dimit 2015年1月13日
 * 成功时访问器
 */
public class SuccessVisitor extends AbstractVisitor {

	@Override
	public void visit(Man m) {
		System.out.println("当男人成功时，背后多半有一个伟大的女人");
	}

	@Override
	public void visit(Women w) {
		 System.out.println("当女人成功时，背后大多有一个不成功的男人");  
	}
	
	@Override
	public void visit(Child c) {
		System.out.println("小孩成功时只会大笑。。。");
	}
	
	public void visit(Monster m) {
		System.out.println("当怪兽成功时。会笑得很难看。。。");
	}

}
