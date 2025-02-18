package com.ty.in;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext cApp=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person person =(Person)cApp.getBean("person");
		
		person.dispay();
	}
}
