package com.dao;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FindCounts {

	public static void main(String[] args) {
		ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("meal-dao.xml");
		MealService mealService=(MealService)applicationContext.getBean("mealService");
		Scanner scanner=new Scanner(System.in);
		int records=mealService.findCount();
		System.out.println(records);
	}
}
