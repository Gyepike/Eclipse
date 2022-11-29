package com.anti.springboot.databasedemo.basic;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
// prototype new objct created sigelton only one !!! defult 
public class Peting implements Animals {

	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("kutya") // 1 type Animal 2, name anima 3,  primary or qulifier  
	Animals animal;
    
	@PostConstruct 
	public void postConst() {
		//System.out.println("Post Const");
		logger.info("Logger Post Const Executed Info level !! ! {}", this.getClass());
		logger.trace("Post const Trace level!");
		logger.error("Error level ! ");
	}
	
	
	@PreDestroy
	public void PreDestroy() {
		System.out.println("Shutdown All Resources");
		logger.trace("PreDestory Trace");
	}
	
	
	@Autowired
	private Mano mano;

	public Peting(Animals animal) {
		this.animal = animal;
	}

	@Override
	public void makeSound() {
		animal.makeSound();
		//mano.makeSound();
		
	}

	public Mano getMano() {
		return mano;
	}

	public void setMano(Mano mano) {
		this.mano = mano;
	}

}
