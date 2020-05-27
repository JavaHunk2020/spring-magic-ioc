package com.dao;

import java.util.List;

import com.model.Meal;

public class MealService {
	
	private MealDao mealDao;
	
	public MealDao getMealDao() {
		return mealDao;
	}

	public void setMealDao(MealDao mealDao) {
		this.mealDao = mealDao;
	}
	
	public void deleteById(int fid) {
		mealDao.deleteById(fid);
	}
	
	public void save(String milk,int breads) {
		Meal meal=new Meal();
		meal.setBread(breads);
		meal.setMilk(milk);
		mealDao.save(meal);
	}
	
	public List<Meal> findMeals() {
		return mealDao.findAll();
	}
	
	public int findCount() {
		return mealDao.findCount();
	}

}
