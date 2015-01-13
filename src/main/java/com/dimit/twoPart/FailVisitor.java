package com.dimit.twoPart;
/**
 * Dimit 2015年1月13日
 */
public class FailVisitor extends AbstractVisitor {

	@Override
	public void visit(Man m) {
		System.out.println("当男人失败时，闷头喝酒，谁也不用劝");
	}

	@Override
	public void visit(Women w) {
		System.out.println("当女人失败时，眼泪汪汪，谁也劝不了");  
	}
	
	@Override
	public void visit(Child c) {
		System.out.println("当小孩失败时，只会哭。。。");
	}

	public void visit(Monster m) {
		System.out.println("当怪兽失败时。会笑得更加难看。。。");
	}
}

