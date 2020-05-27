package com.model;

import java.sql.Timestamp;

public class Meal {
	private int fid;
	private String milk;
	private int bread;
	private Timestamp createdate;
	
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public Timestamp getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}
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
