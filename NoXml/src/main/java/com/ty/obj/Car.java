package com.ty.obj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Value(value = "101")
	private int cid;
	
	@Value(value = "TATA")
	private String brand;
	
	@Value(value = "1000000")
	private double price;
	
//	@Autowired	//variable / field injection
	private Engine engine;
	
//	@Autowired 	//setter injection
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}
	
	@Autowired	//constructor injection
	public Car(Engine engine) {
		this.engine=engine;
	}	
	
	public void display() {
		System.out.println("=========Car============");
		System.out.println(cid);
		System.out.println(brand);
		System.out.println(price);
		engine.display();
	}
}
