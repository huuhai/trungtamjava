package com.trungtamjava.main;

import java.util.Scanner;

import com.trungtamjava.model.Animal;
import com.trungtamjava.model.Chicken;
import com.trungtamjava.model.Dog;

public class AnimalMain {
	public static void main(String[] args) {
		int choice;
		while (true) {
			System.out.println("1. menu dog");
			System.out.println("2. menu chicken");
			System.out.println("3. exit");

			System.out.println("enter choice: ");
			choice = new Scanner(System.in).nextInt();
			if (choice == 1) {
				menuDog();
			} else if (choice == 2) {
				menuChicken();
			} else if (choice == 3) {
				System.out.println("exit");
				break;
			} else {
				System.out.println("Please choose again");
			}
		}
	}

	public static void menuDog() {
		int number;
		System.out.println("enter number: ");
		number = new Scanner(System.in).nextInt();
		Animal[] dogs = new Dog[number];

		for (int i = 0; i < dogs.length; i++) {
			dogs[i] = new Dog();
			input(dogs[i]);
		}

		for (Animal animal : dogs) {
			info(animal);
		}
	}

	public static void menuChicken() {
		int number;
		System.out.println("enter Chicken: ");
		number = new Scanner(System.in).nextInt();
		Animal[] chickens = new Chicken[number];

		for (int i = 0; i < chickens.length; i++) {
			chickens[i] = new Chicken();
			input(chickens[i]);
		}

		for (Animal animal : chickens) {
			info(animal);
		}
	}

	public static void input(Animal animal) {
		System.out.println("enter name: ");
		animal.setName(new Scanner(System.in).nextLine());

		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			System.out.println("enter NumberOfLeg: ");
			dog.setNumberOfLeg(new Scanner(System.in).nextInt());
		}

		if (animal instanceof Chicken) {
			Chicken chicken = (Chicken) animal;
			System.out.println("enter Sound: ");
			chicken.setSound(new Scanner(System.in).nextLine());
		}
	}

	public static void info(Animal animal) {
		System.out.println("=====info======");
		System.out.println("name: " + animal.getName());

		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			System.out.println("NumberOfLeg: " + dog.getNumberOfLeg());
		}

		if (animal instanceof Chicken) {
			Chicken chicken = (Chicken) animal;
			System.out.println("Sound: " + chicken.getSound());
		}

	}

}
