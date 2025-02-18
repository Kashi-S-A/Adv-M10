package com.ty.bean;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new AnnotationConfigApplicationContext(AppConfig.class);

		Student student = (Student) cApp.getBean("student");

		student.play();
		
		student.display();
		
		System.out.println("======================");

		Scanner scanner = (Scanner) cApp.getBean("scanner");
		System.out.println("read integer data");
		int a=scanner.nextInt();
		System.out.println("a : "+a);
	}
}
