package com.dimit.p3;
/**
 * Dimit 2015年1月14日
 */
public class FailVisitor implements Visitor, ManVisitor, WomenVisitor,ChildVisitor {

	@Override
	public void visit(Women w) {
		System.out.println("当女人失败时，眼泪汪汪，谁也劝不了");
	}

	@Override
	public void visit(Man man) {
		System.out.println("当男人失败时，闷头喝酒，谁也不用劝");
	}

	@Override
	public void visit(Child c) {
		System.out.println("当小孩失败时，只会嚎啕大哭。。。");
	}

}

