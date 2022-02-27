package com.trungtamjava.model;

public class Person {

	String name;
	int age;
	String sex;
	String nationality;
	
	public Person() {
		
	}
	
	public Person(String name, int age, String sex, String nationality) {
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.nationality=nationality;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
}
