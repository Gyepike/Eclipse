package com.anti.dao;


import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype") // create two alien not singelton!!

//http://localhost:8080/home?aid=1&aname=alma&tech=java

public class Alien {
	

	private int aid;
	private String aname;
	private String tech;
	
	@Autowired
	@Qualifier("lp1") // use name not type 
	private Laptop laptop;
	
	public Alien() {
		System.out.println("Created Alien");
	}
	public int getAid() {
		return aid;
	}
	public String getAname() {
		return aname;
	}
	public String getTech() {
		return tech;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}

	public void show() {
		System.out.println("show Alien!");
		laptop.compile();
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", tech=" + tech + ", laptop=" + laptop + "]";
	}
}
