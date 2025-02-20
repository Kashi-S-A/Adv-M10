package com.ty.prop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConfig {

	@Value(value = "${url}")
	String url;

	@Value(value = "${un}")
	String username;

	@Value(value = "${pwd}")
	String password;

	public void display() {
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}
}
