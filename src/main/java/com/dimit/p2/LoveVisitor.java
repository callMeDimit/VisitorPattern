package com.dimit.p2;

/**
 * Dimit 2015年1月13日
 * 恋爱时访问器
 */
public class LoveVisitor extends AbstractVisitor {

	@Override
	public void visit(Man m) {
		System.out.println("当男人恋爱时，凡事不懂也装懂");  
	}

	@Override
	public void visit(Women w) {
		System.out.println("当女人恋爱时，遇事懂也装不懂");  
	}
	
}
