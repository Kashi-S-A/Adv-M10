package com.ty.di.map;

import java.util.Map;
import java.util.Map.Entry;

public class BookStore {

	private String name;

	private Map<String, Double> books;

	public void display() {
		System.out.println("========Welcome to " + name + "=========");
		for (Entry<String, Double> book : books.entrySet()) {
			System.out.println(book.getKey() + "-->" + book.getValue());
			
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Double> getBooks() {
		return books;
	}

	public void setBooks(Map<String, Double> books) {
		this.books = books;
	}

}
