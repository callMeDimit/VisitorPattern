package com.dimit.p2;
/**
 * Dimit 2015年1月13日
 */
public class Client {
	public static void main(String[] args) {
		Man m = new Man();
		Women w = new Women();
		Child c = new Child();
		Monster mo = new Monster();
		DataResource dr = new DataResource();
		dr.addData(m);
		dr.addData(w);
		dr.addData(c);
		dr.addData(mo);
		SuccessVisitor sv = new SuccessVisitor();
		dr.display(sv);
		LoveVisitor lv = new LoveVisitor();
		dr.display(lv);
		FailVisitor fv = new FailVisitor();
		dr.display(fv);
		MakeupVisitor mv = new MakeupVisitor();
		dr.display(mv);
	}
}

