package com.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Meal;

/**
 * <bean id="tmealDao" name="www.meal.com,www.yahoo.com"		class="com.dao.MealDao">
		  <property name="jdbcTemplate"  ref="tjdbcTemplate"/>
	</bean>
	
 * @author nagendra
 *
 */

@Repository("tmealDao")
public class MealDao {
	
	//<property name="jdbcTemplate"  ref="tjdbcTemplate"/>
	
	@Autowired
	@Qualifier("tjdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void deleteById(int fid) {
		jdbcTemplate.update("delete from dog_food_tbl where fid ="+fid);
	}
	

	public void save(Meal meal) {
		String sql = "insert into dog_food_tbl(milk,breads,createdate) values(?,?,?)";
		jdbcTemplate.update(sql,new Object[] {meal.getMilk(),meal.getBread(),
				new Timestamp(new Date().getTime())});
		System.out.println(meal);
		System.out.println("@)@)@)@(meal@(@(@(@(");
	}
	
	
	public List<Meal> findAll() {
		 List<Meal> meals=jdbcTemplate.query("select fid, milk,breads,createdate from dog_food_tbl",
				 new BeanPropertyRowMapper(Meal.class));
		 return  meals;
	}
	
	public Meal findById(int fid) {
		Meal meal=(Meal)jdbcTemplate.queryForObject("select fid, milk,breads,createdate"
				+ " from dog_food_tbl where fid=?",
				 new Object[] {fid},new BeanPropertyRowMapper(Meal.class));
		 return  meal;
	}

	public int findCount() {
	 	String sql="select count(*) from dog_food_tbl";
	 	int count =jdbcTemplate.queryForObject(sql, Integer.class);
		 return  count;
	}

}
