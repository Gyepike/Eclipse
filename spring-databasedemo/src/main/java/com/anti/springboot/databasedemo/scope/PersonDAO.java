package com.anti.springboot.databasedemo.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {
     
	@Autowired
	ComonentJDBCConnection jdbcConnection;

	public ComonentJDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(ComonentJDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
}
