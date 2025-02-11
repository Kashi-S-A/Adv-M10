package com.ty.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverA {

	public static void main(String[] args) {
		ApplicationContext cApp = new ClassPathXmlApplicationContext("config.xml");

		Employee employee = (Employee) cApp.getBean("myEmp");
		
		employee.work();
	}
}
