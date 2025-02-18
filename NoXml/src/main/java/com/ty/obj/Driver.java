package com.ty.obj;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car car=(Car)cApp.getBean("car");
		car.display();
	}
}
