package com.anti.dao;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Scope(value = "prototype") // create two alien not singelton!!

//http://localhost:8080/home?aid=1&aname=alma&tech=java

@Entity
@Table(name = "Alien")
public class Alien3 {
	
    @Id
	private long aid;
	private String aname;

	

	
	public Alien3() {
		System.out.println("Created Alien");
	}
	public long getAid() {
		return aid;
	}
	public String getAname() {
		return aname;
	}
	
	public void setAid(long aid) {
		this.aid = aid;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Alien3 [aid=" + aid + ", aname=" + aname + "]";
	}


}
