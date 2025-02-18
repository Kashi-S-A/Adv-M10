package com.ty.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ty.bean")
public class AppConfig {

	@Bean(value = "student")
	public Student getStudent() {
		return new Student();
	}
	
	@Bean(value = "scanner")
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
	
	@Bean
	public List<String> getSubjects() {
		return Arrays.asList("JAVA","SQL","Spring Boot");
	}
	
//	@Bean
//	@Qualifier(value = "samsung")
//	public Mobile getMobile() {
//		return new Samsung();
//	}
}
