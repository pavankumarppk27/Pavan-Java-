package com.string;

public class HashCode_vs_ToString {

	public static void main(String[] args) {

		Test test = new Test(100, "pavan");
		System.out.println(test);

		Test2 test2 = new Test2(100, "pavan");
		Test2 test3 = new Test2(100, "pavan");
		System.out.println(test2.equals(test3));
		System.out.println(test2);
		System.out.println(test2.getName());
	}
}

class Test {

	int id;
	String name;

	public Test(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Test2 {

	int id;
	String name;

	public Test2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {

		return id;
	}

	@Override
	public boolean equals(Object obj) {

		int id = this.id;
		String name = this.name;

		Test2 test = (Test2) obj;
		int id2 = test.id;
		String name2 = test.name;

		if (name.equals(name2) && id == id2) {
			return true;
		}

		return false;
	}

	public String getName() {

		return "" + getClass().getName();
	}
}
