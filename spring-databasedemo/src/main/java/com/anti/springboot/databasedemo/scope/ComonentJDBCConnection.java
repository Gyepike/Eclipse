package com.anti.springboot.databasedemo.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS) // without target_calss prototype not working !! proxz separet class
public class ComonentJDBCConnection {

	public ComonentJDBCConnection() {
		
		System.out.println("JDBC connected !");
	}
}
