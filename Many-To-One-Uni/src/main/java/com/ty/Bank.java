package com.ty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {

	@Id
	private int bid;

	private String name;

	@Override
	public String toString() {
		return "Bank [bid=" + bid + ", name=" + name + "]";
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
