package com.trungtamjava.model;

public class Laptop {
	
	public String color;
	float price;
	String type;
	String memory;
	int sizeOfDisk;
	String CPU;
	
	public Laptop() {
		
	}

	public Laptop(String color, float price, String type, String memory, int sizeOfDisk, String cPU) {
		super();
		this.color = color;
		this.price = price;
		this.type = type;
		this.memory = memory;
		this.sizeOfDisk = sizeOfDisk;
		CPU = cPU;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public int getSizeOfDisk() {
		return sizeOfDisk;
	}

	public void setSizeOfDisk(int sizeOfDisk) {
		this.sizeOfDisk = sizeOfDisk;
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}
	
}
