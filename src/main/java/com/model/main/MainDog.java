package com.model.main;

import com.model.Dog;

public class MainDog {
	
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.setColor("white");
		dog.setName("Tommy");
		dog.setPrice(132);
		dog.bark();
		System.out.println(dog);
		dog=null;
		System.out.println("@(@(@(");
	}
}
