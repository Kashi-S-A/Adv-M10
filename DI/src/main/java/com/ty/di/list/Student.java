package com.ty.di.list;

import java.util.List;

public class Student {

	private String name;

	private List<String> subjects;

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("-------Subject--------");
		for (String subject : subjects) {
			System.out.println(subject);
			System.out.println("================");
		}
	}

	public Student(String name, List<String> subjects) {
		this.name = name;
		this.subjects = subjects;
	}

}
