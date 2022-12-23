package com.anti.core.core.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.GenericGenerator;

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
public class Employee {
	
	//@TableGenerator(name = "employee_gen", table="id_gen", pkColumnName = "gen_name", valueColumnName  ="gen_val")
	
	@Id
	@GenericGenerator(name = "emp_id", strategy = "com.anti.core.core.idgenerator.CustomRandomIDGenerator")
	@GeneratedValue(generator = "emp_id")
	//@GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_gen" ) 
	private long id;
	private String name;
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}

}
