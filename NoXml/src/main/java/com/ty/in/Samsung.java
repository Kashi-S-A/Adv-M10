package com.ty.in;

import org.springframework.stereotype.Component;

@Component
public class Samsung implements Mobile{

	public void ring() {
		System.out.println("Samsung Mobile is ringing");
	}

}
