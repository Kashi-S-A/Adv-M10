package com.ty.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value(value = "Dinga")
	private String name;
	
	@Value(value = "34")
	private int age;
	
//  variable or field injection
//	@Autowired
//	@Qualifier(value = "IPhone")
	private Mobile mobile;
	
//  setter injection
//	@Autowired
//	@Qualifier(value = "IPhone")
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

//  constructor injection
	@Autowired
	public Person(@Qualifier(value = "samsung")Mobile mobile) {
		this.mobile = mobile;
	}
	
	public void dispay() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		mobile.ring();
	}
}
