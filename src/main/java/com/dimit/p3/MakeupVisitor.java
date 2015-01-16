package com.dimit.p3;
/**
 * Dimit 2015年1月16日
 */
public class MakeupVisitor implements Visitor, WomenVisitor {

	@Override
	public void visit(Women w) {
		System.out.println("只用女人才会化妆。。。");
	}

}

