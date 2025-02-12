package com.ty.di.map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext cApp = new ClassPathXmlApplicationContext("configMap.xml");
		BookStore store = (BookStore) cApp.getBean("bookStore");
		store.display();
	}
}
