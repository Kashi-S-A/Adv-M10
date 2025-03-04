package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		College college = (College) cApp.getBean("college");
		
		cApp.close();
	}
}
