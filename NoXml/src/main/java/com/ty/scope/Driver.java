package com.ty.scope;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext cApp=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person person = (Person) cApp.getBean("person");
		System.out.println(person);
		
		Person person1 = (Person) cApp.getBean("person");
		System.out.println(person1);
		
		Person person2 = (Person) cApp.getBean("person");
		System.out.println(person2);
	}
}
