package com.trungtamjava.main;

import com.trungtamjava.model.bai1.Car;
import com.trungtamjava.model.bai1.House;
import com.trungtamjava.model.bai1.Person;

public class PersonMain {

	public static void main(String[] args) {
		Person person = new Person();
		person.input();

		House[] houses = new House[2];
		Car[] cars = new Car[2];

		for (int i = 0; i < houses.length; i++) {
			houses[i] = new House();
			houses[i].input();
			houses[i].setOwner(person);
		}

		for (int j = 0; j < cars.length; j++) {
			cars[j] = new Car();
			cars[j].input();
			cars[j].setOwner(person);
		}

		for (House house : houses) {
			house.info();
			house.getOwner().info();
		}

		for (Car car : cars) {
			car.info();
			car.getOwner().info();
		}
	}

}
