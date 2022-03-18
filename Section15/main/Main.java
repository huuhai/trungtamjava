package jmaster.io.main;

import jmaster.io.model.Person;

public class Main {

	public static void main(String[] args) {

		Person ps1 = new Person(1, "Abcd", 21);

		Person ps2 = new Person(2, "efgh", 12);

		System.out.println(ps1.equals(ps2));
	}

}
