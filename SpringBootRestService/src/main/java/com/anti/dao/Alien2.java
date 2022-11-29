package com.anti.dao;

public class Alien2 {
	
	private String lname;
	private String fname;
	public String getLname() {
		return lname;
	}
	public String getFname() {
		return fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	@Override
	public String toString() {
		return "Alien2 [lname=" + lname + ", fname=" + fname + "]";
	}
	
}
