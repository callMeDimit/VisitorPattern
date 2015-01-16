package com.dimit.p4;
/**
 * Dimit 2015年1月16日
 */
public class FailVisitor extends ReflectionVisitor {
	public void visit(Man man) {
		System.out.println("当男人失败时只会门头喝酒。。。");
	}
	
	/*public void visit(Women w) {
		System.out.println("当女人失败时只会大哭。。。");
	}*/
}

