package com.ty.di.cons.obj;

public class Car {

	private int cid;

	private String brand;

	private Engine engine;
	
	public Car() {	}

	public Car(int cid, String brand, Engine engine) {
		this.cid = cid;
		this.brand = brand;
		this.engine = engine;
	}

	public void display() {
		System.out.println("-------Car-------");
		System.out.println(cid);
		System.out.println(brand);
		System.out.println("------Engine-------");
		System.out.println(engine.cc);
	}

}
