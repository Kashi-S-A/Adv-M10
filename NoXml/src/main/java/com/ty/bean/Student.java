package com.ty.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Student {
	
	@Value(value = "Dinga")
	String name;
	
	@Autowired
	List<String> subjects;

	public void play() {
		System.out.println("Playing cricket");
	}
	
	public void display() {
		System.out.println(name);
		for (String sub : subjects) {
			System.out.println(sub);
		}
	}
}
