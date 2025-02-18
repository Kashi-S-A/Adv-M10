package com.ty.obj;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {

	@Value(value = "1000")
	private int cc;

	@Value(value = "Petrol")
	private String type;
	
	public void display() {
		System.out.println("=======Engine=======");
		System.out.println(cc);
		System.out.println(type);
	}
}
