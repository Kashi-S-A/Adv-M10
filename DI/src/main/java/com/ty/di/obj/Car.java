package com.ty.di.obj;

public class Car {

	private int cid;

	private String brand;

	private Engine engine;

	public void display() {
		System.out.println("-------Car-------");
		System.out.println(cid);
		System.out.println(brand);
		System.out.println("------Engine-------");
		System.out.println(engine.getCc());
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
