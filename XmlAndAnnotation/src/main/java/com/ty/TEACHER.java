package com.ty;

import org.springframework.stereotype.Component;

@Component(value = "myTeacher")
public class TEACHER {

	public void teach() {
		System.out.println("Adv Java");
	}
}
