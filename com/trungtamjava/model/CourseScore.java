package com.trungtamjava.model;

import java.util.Scanner;

public class CourseScore {
	
	int id;
	float score;
	String name;
	
	public void input() {
		Scanner scID = new Scanner(System.in);
		System.out.println("enter id:");
		setId(scID.nextInt());
		Scanner scName = new Scanner(System.in);
		System.out.println("enter name:");
		setName(scName.nextLine());
		Scanner scScore = new Scanner(System.in);
		System.out.println("enter score:");
		setScore(scScore.nextFloat());
	}
	
	public void info() {
		System.out.println(getId());
		System.out.println(getName());
		if(getScore()<5)
			System.out.println("Yeu");
		else if (getScore()>=5 && getScore()<7)
			System.out.println("TB");
		else if (getScore()>=7 && getScore()<8)
			System.out.println("Kha");
		else if (getScore()>=8 && getScore()<9)
			System.out.println("Gioi");
		else if (getScore()>=9)
			System.out.println("Xuat sac");
		
	}
	
	public CourseScore() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public float getScore() {
		return score;
	}
	
	public void setScore(float score) {
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
