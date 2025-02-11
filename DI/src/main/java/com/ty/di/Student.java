package com.ty.di;

public class Student {

	private int sid;

	private String name;

	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("Sid : " + sid);
		System.out.println("Name : " + name);
	}
}
