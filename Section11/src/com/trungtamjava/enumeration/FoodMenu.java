package com.trungtamjava.enumeration;

public enum FoodMenu {
	CAFE(1, "Cafe"), MILK_TEA(2, "Milk Tea");

	private FoodMenu(int id, String ten) {
		this.ten = ten;
		this.id = id;
	}

	private int id;
	private String ten;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
