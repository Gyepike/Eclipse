package com.anti.dao;

import org.springframework.stereotype.Component;

@Component("lp1") // use name not type lpt1
public class Laptop {
	private int lid;
	private String brand;

	public int getLid() {
		return lid;
	}

	public String getBrand() {
		return brand;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	
	public void  compile() {
		System.out.println("compile !!!");
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", getLid()=" + getLid() + ", getBrand()=" + getBrand()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
