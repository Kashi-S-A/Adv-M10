package com.ty.di.field;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//setter injection
@Component
public class Account {

	private int accNo;

	private String name;

	private double balance;

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}

	@Value(value = "1234567")
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	@Value(value = "Manga")
	public void setName(String name) {
		this.name = name;
	}

	@Value(value = "0.0")
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
