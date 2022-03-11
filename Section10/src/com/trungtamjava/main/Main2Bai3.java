package com.trungtamjava.main;

import model.bai1.Boss;
import model.bai1.Employee;
import model.bai1.Person;

import java.util.Scanner;

import model.bai3.Student;
import service.StudentService;
import service.StudentServiceImpl;

public class Main2Bai3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so Student ban can");
		int n = scanner.nextInt();

		Student[] students = new Student[n];
		StudentService studentService = new StudentServiceImpl();

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			studentService.input(students[i]);
		}
		
		for (Student student : students) {
			studentService.info(student);
		}
		System.out.println("Tim sinh vien co so tuoi lon nhat");

		Student max = students[0];
		for (int i = 0; i < students.length; i++) {
			if (students[i].getAge() > max.getAge()) {
				max = students[i];
			}
		}
		
		System.out.println("Sinh vien co tuoi lon nhat la:");
		for (int i = 0; i < students.length; i++) {
			if (students[i].getAge() == max.getAge()) {
				studentService.info(students[i]);
			}
		}

	}
}
