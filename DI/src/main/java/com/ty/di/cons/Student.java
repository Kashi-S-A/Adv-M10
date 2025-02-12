package com.ty.di.cons;

public class Student {

	private int sid;

	private String name;

	public Student() {}

	public Student(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}

	public void display() {
		System.out.println("Sid : " + sid);
		System.out.println("Name : " + name);
	}
}
