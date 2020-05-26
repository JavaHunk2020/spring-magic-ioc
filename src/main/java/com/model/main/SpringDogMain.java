package com.model.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Dog;

public class SpringDogMain {
	
	public static void main(String[] args) {
		
		//Spring container
		ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("dogs.xml");
		Dog dog=(Dog)applicationContext.getBean("dog");
		dog.bark();
		System.out.println(dog);
		
		Dog pdog=(Dog)applicationContext.getBean("pdog");
		pdog.bark();
		System.out.println(pdog);
		pdog=null;
	}

}
