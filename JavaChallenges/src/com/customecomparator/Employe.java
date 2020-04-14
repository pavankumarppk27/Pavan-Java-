package com.customecomparator;

public class Employe implements Comparable {

	int id;
	String name;

	public Employe(int id, String name) {

		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {

		return "id:" + id + "  " + "name:" + name;
	}

	@Override
	public int compareTo(Object obj) {

		int id1 = this.id;
		Employe emp = (Employe) obj;
		int id2 = emp.id;

		if (id1 > id2) {
			return 1;
		} else if (id1 < id2) {
			return -1;
		} else
			return 0;
	}

}
