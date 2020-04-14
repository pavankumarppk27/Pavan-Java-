package com.string;

public class EqualsMethodImplementation {

	public static void main(String[] args) {

		Customer c1 = new Customer(10, "pavan");
		Customer c2 = new Customer(10, "pavan");

		System.out.println(c1.hashCode() + "  " + c2.hashCode());
		System.out.println(c1 + "  " + c2);

		System.out.println(c1.equals(c2));
		// System.out.println(c1.equals("pavan"));
		// System.out.println(c1.equals(null));
		System.out.println(c1.equals2(c2));

	}

}

class Customer {

	int id;
	String name;

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {

		return "id:" + id + "......" + "name:" + name;
	}

	@Override
	public int hashCode() {

		return id;
	}

	@Override
	public boolean equals(Object obj) {

		try {
			int id = this.id;
			String name = this.name;

			Customer c = (Customer) obj;
			int id2 = c.id;
			String name2 = c.name;

			if (name.equals(name2) && id == id2) {
				return true;
			} else {
				return false;
			}
		} catch (ClassCastException cce) {
			return false;
		} catch (NullPointerException npe) {
			return false;
		}

	}

	public boolean equals2(Object obj) {

		try {
			Customer c = (Customer) obj;
			if (name.equals(c.name) && id == c.id) {
				return true;
			} else {
				return false;
			}
		} catch (ClassCastException cce) {
			return false;
		} catch (NullPointerException npe) {
			return false;
		}

	}

	public boolean equals3(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj instanceof Customer) {
			Customer c = (Customer) obj;
			if (name.equals(c.name) && id == c.id) {
				return true;
			} else {
				return false;
			}
		}
		return false;

	}

}
