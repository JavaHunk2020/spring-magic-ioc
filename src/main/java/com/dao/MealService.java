package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.model.Meal;


/**
 * 	<bean id="mealService" class="com.dao.MealService">
		<property name="mealDao" ref="tmealDao" />
	</bean>
 * @author nagendra
 *
 */

@Service("mealService")
@Scope("singleton")
public class MealService {
	
	/**
	 *  no 
	 *  byType
	 *  byName
	 *  byConstrcutor
	 */
	@Autowired
	//@Qualifier("tmealDao")
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
