package com.ty.prop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp=new AnnotationConfigApplicationContext(AppConfig.class);
		DatabaseConfig db= (DatabaseConfig) cApp.getBean("databaseConfig");
		db.display();
	}
}
