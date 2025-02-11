package com.ty.di.list;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("configList.xml");

		Student student = (Student) cApp.getBean("myStudent");
		
		student.display();
	}
}
