package com.dimit.p4;
/**
 * Dimit 2015年1月16日
 */
public class SuccessVisitor extends ReflectionVisitor {
	/**
	 * 男人成功
	 * @param man
	 */
	public void visit(Man man) {
		 System.out.println("当男人成功时，背后多半有一个伟大的女人");  
	}
	
	/**
	 * 女人成功
	 * @param w
	 */
	public void visit(Women w) {
		System.out.println("当女人成功时，背后大多有一个不成功的男人");  
	}
	/**
	 * 怪物成功
	 * @param mo
	 */
	public void visit(Monster mo) {
		System.out.println("当怪物成功时，会笑得很可怕。。。");
	}
}

