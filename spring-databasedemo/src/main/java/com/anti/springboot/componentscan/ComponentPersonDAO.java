package com.anti.springboot.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentPersonDAO {
     
	@Autowired
	ComonentJDBCConnection jdbcConnection;

	public ComonentJDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(ComonentJDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
}
