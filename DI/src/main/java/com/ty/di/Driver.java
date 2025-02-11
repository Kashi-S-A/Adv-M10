package com.ty.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext cApp = new ClassPathXmlApplicationContext("config.xml");
		
		Student student = (Student) cApp.getBean("myStu");
		
		student.display();
	}
}
