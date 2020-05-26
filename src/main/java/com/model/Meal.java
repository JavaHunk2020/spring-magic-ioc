package com.model;

public class Meal {
	private String milk;
	private int bread;
	public String getMilk() {
		return milk;
	}
	public void setMilk(String milk) {
		this.milk = milk;
	}
	public int getBread() {
		return bread;
	}
	public void setBread(int bread) {
		this.bread = bread;
	}
	@Override
	public String toString() {
		return "Meal [milk=" + milk + ", bread=" + bread + "]";
	}
	
	

}
