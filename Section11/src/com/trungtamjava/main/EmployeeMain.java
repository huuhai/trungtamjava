package com.trungtamjava.main;

import com.trungtamjava.enumeration.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee emp = new Employee() {
			public void salary() {
				System.out.println("luong 10 trieu");
			};
		};
		emp.salary();
	}

}
