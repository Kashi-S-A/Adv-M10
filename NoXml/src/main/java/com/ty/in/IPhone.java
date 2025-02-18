package com.ty.in;

import org.springframework.stereotype.Component;

@Component
public class IPhone implements Mobile{

	public void ring() {
		System.out.println("IPhone Is ringing");
	}

}
