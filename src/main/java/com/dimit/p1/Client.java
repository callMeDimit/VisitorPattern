package com.dimit.p1;

public class Client {
	public static void main(String[] args) {
		Person man = new Man();
		Person woman = new Woman();
		man.action("success");
		woman.action("success");

		man.action("love");
		woman.action("love");
	}
}