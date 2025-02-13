package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("config.xml");

		Student student = (Student) cApp.getBean("student");
		student.play();

		PersonDetail detail = (PersonDetail) cApp.getBean("personDetail");
		detail.lazy();

		TEACHER teacher = (TEACHER) cApp.getBean("myTeacher");// TEACHER --> Is default BeanId for Class TEACHER
		teacher.teach();
	}
}
