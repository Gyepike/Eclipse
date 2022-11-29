package com.anti.springboot.componentscan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS) // without target_calss prototype not working !! proxz separet class
public class ComonentJDBCConnection {

	public ComonentJDBCConnection() {
		
		System.out.println("Component JDBC connected !");
	}
}
