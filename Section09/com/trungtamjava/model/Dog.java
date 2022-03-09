package com.trungtamjava.model;

public class Dog extends Animal {
	private int numberOfLeg;

	public Dog() {
		super();
	}

	public Dog(int numberOfLeg) {
		super();
		this.numberOfLeg = numberOfLeg;
	}

	public int getNumberOfLeg() {
		return numberOfLeg;
	}

	public void setNumberOfLeg(int numberOfLeg) {
		this.numberOfLeg = numberOfLeg;
	}
	
}
