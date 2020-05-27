package com.dao;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMaianMainaDao {

	public static void main(String[] args) {
		ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("meal-dao.xml");
		MealService mealService=(MealService)applicationContext.getBean("mealService");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter milk");
		String milk=scanner.next();
		System.out.println("Enter breads");
		int breads=scanner.nextInt();
		mealService.save(milk,breads);
		System.out.println("@)(@@*(@*@*@*");
	}
}
