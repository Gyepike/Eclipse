package com.anti.controller.telusko;



import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


//https://docs.spring.io/spring-framework/docs/2.0.x/reference/aop.html
@Aspect
@Component
public class AlienServiceAspect {

	 
	private static final Logger logger = LoggerFactory.getLogger(AlienServiceAspect.class);
	
	@Before("execution(String com.anti.controller.telusko.AlienController.findByAname(..))")  // * com.anti.controller.telusko.AlienController.findByAname*(..))
	 private void beforeSearching() {
	
		//System.out.println("AOP findByAname Called !!!");
		
		logger.info("AOP findByAname Called !!!");
	}
	
	@Before("execution( * com.anti.controller.telusko.AlienController.findAlien(..))")  // * com.anti.controller.telusko.AlienController.findByAname*(..))
	 private void beforeTest() {
	
		//System.out.println("AOP FindAlien Called !!!");
		System.getProperty("user.dir");
		logger.info("AOP FindAlien Calsled !!!");
	}
}
