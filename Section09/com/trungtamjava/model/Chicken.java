package com.trungtamjava.model;

public class Chicken extends Animal {
	private String sound;

	public Chicken() {

	}

	public Chicken(String sound) {
		super();
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

}
