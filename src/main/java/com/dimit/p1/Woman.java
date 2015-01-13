package com.dimit.p1;

public class Woman implements Person {

	public void action(String state) {
		if (state == "success") {
			System.out.println("当女人成功时，背后大多有一个不成功的男人");
		} else if (state == "love") {
			System.out.println("当女人恋爱时，遇事懂也装不懂");
		}
	}

}