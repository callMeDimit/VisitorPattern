package com.dimit.p3;

import java.util.ArrayList;
import java.util.List;

/**
 * Dimit 2015年1月13日
 */
public class DataResource {
	private List<Person> list = new ArrayList<>();
	
	/**
	 * 添加数据
	 * @param p
	 */
	public void addData(Person p) {
		if(p != null) {
			list.add(p);
		}
	}
	
	/**
	 * 遍历
	 * @param v
	 */
	public void display(Visitor v) {
		for(Person p : list) {
			p.accept(v);
		}
	}
}

