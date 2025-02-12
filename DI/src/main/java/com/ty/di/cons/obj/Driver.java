package com.ty.di.cons.obj;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("consObj.xml");

		Car car = (Car) cApp.getBean("myCar");
		
		car.display();
	}
}
