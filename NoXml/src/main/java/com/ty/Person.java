package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

//	@Value(value = "DInga")
	String name;

//	@Value(value = "32")
	int age;

//	@Value(value = "Manga")
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	@Value(value = "78")
//	public void setAge(int age) {
//		this.age = age;
//	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

	public Person(@Value(value = "Penga") String name,@Value(value = "45") int age) {
		this.name = name;
		this.age = age;
	}
}
