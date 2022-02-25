package com.trungtamjava.main;

import com.trungtamjava.model.Chair;
import com.trungtamjava.model.Laptop;
import com.trungtamjava.model.Person;
import com.trungtamjava.model.Table;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// person
		Person person = new Person();
		person.setName("Nguyen Van A");
		person.setAge(18);
		person.setSex("Nam");
		person.setNationality("Viet Nam");
		
		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getSex());
		System.out.println(person.getNationality());
		System.out.println("-------------------------");
		
		Person person2= new Person("Nguyen Thi B", 20, "Nu", "USA");
		
		System.out.println(person2.getName());
		System.out.println(person2.getAge());
		System.out.println(person2.getSex());
		System.out.println(person2.getNationality());
		System.out.println("-------------------------");
		
		// chair
		Chair chair = new Chair();
		
		chair.setColor("den");
		chair.setManufacturer("Hoa Phat");
		chair.setPrice(1500000f);
		chair.setType("ghe tua");
		
		System.out.println(chair.getColor());
		System.out.println(chair.getManufacturer());
		System.out.println(chair.getPrice());
		System.out.println(chair.getType());
		System.out.println("-------------------------");
		
		Chair chair2= new Chair("xanh", 2000000f, "ghe lanh dao", "Hoa Phat");
		
		System.out.println(chair2.getColor());
		System.out.println(chair2.getManufacturer());
		System.out.println(chair2.getPrice());
		System.out.println(chair2.getType());
		System.out.println("-------------------------");
		
		// table
		Table table = new Table();
		
		table.setColor("Nau do");
		table.setPrice(3000000f);
		table.setType("ban hoc");
		table.setManufacturer("Hoa Phat");
		
		System.out.println(table.getColor());
		System.out.println(table.getPrice());
		System.out.println(table.getType());
		System.out.println(table.getManufacturer());
		System.out.println("-------------------------");
		
		Table table2 = new Table("Den", 2500000f, "ban giao vien", "Hoa Phat");
		
		System.out.println(table2.getColor());
		System.out.println(table2.getPrice());
		System.out.println(table2.getType());
		System.out.println(table2.getManufacturer());
		System.out.println("-------------------------");
		
		// laptop
		
		Laptop laptop = new Laptop();
		
		laptop.setColor("den");
		laptop.setCPU("intel");
		laptop.setMemory("8GB");
		laptop.setPrice(10000000f);
		laptop.setSizeOfDisk(256);
		laptop.setType("acer");
		
		System.out.println(laptop.getColor());
		System.out.println(laptop.getCPU());
		System.out.println(laptop.getMemory());
		System.out.println(laptop.getPrice());
		System.out.println(laptop.getSizeOfDisk());
		System.out.println(laptop.getType());
		System.out.println("-------------------------");
		
		Laptop laptop2 = new Laptop("trang", 20000000f, "dell", "16GB", 500, "AMD");
		
		System.out.println(laptop2.getColor());
		System.out.println(laptop2.getCPU());
		System.out.println(laptop2.getMemory());
		System.out.println(laptop2.getPrice());
		System.out.println(laptop2.getSizeOfDisk());
		System.out.println(laptop2.getType());
	}

}
