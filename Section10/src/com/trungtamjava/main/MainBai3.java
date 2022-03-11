package com.trungtamjava.main;

import com.trungtamjava.model.bai3.Student;

public class MainBai3 {

	public static void main(String[] args) {
		Student student = new Student();
		StudentService studentService = new StudentServiceImpl();
		studentService.input(student);
		studentService.info(student);
	}

}
