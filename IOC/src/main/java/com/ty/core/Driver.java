package com.ty.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext cApp = new ClassPathXmlApplicationContext("config1.xml");
		Employee employee = (Employee) cApp.getBean("myEmp");
		employee.work();
		Student student = (Student) cApp.getBean("myStudent");//exception
		student.study();
	}
}
