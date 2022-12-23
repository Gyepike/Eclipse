package com.anti.core.core.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/* 
*
* AUTO: Hibernate selects the generation strategy based on the used dialect,
IDENTITY: Hibernate relies on an auto-incremented database column to generate the primary key,
@GeneratedValue(strategy = GenerationType.IDENTITY) 
SEQUENCE: Hibernate requests the primary key value from a database sequence,
TABLE: Hibernate uses a database table to simulate a sequence.
@TableGenerator(name = "employee_gen", table="id_gen", pkColumnName = "gen_name", valueColumnName  ="gen_val")
@GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_gen" ) 

*/
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private String email;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	

}
