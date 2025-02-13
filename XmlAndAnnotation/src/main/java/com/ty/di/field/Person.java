package com.ty.di.field;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//field/variable injection
@Component
public class Person {

	@Value(value = "Dinga")
	String name;
	
	@Value(value = "dinga@gmail.com")
	String email;
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
	}
}
