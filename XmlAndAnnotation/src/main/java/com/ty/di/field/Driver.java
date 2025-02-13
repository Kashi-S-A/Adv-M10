package com.ty.di.field;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("configDi.xml");
	
		Person person = (Person) cApp.getBean("person");
		person.display();
		
		System.out.println("=======================");
		
		Account account = (Account) cApp.getBean("account");
		System.out.println(account);
		
		System.out.println("==========================");
		
		Course course = (Course) cApp.getBean("course");
		System.out.println(course);
	}
}
