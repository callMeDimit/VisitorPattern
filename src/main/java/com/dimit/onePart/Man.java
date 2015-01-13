package com.dimit.onePart;

public class Man implements Person {

	public void action(String state) {
		if (state == "success") {
			System.out.println("当男人成功时，背后多半有一个伟大的女人");
		} else if (state == "love") {
			System.out.println("当男人恋爱时，凡事不懂也装懂");
		}
	}
}