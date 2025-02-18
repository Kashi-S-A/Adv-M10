package com.ty;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class College {

	@PreDestroy
	public void m2() {
		System.out.println("m2() executed");
	}
	
	public College() {
		System.out.println("College Object is created");
	}
	
	@PostConstruct
	public void m1() {
		System.out.println("m1() executed");
	}
	
}
