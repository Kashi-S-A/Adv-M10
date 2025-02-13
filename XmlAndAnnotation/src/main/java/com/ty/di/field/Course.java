package com.ty.di.field;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//constructor injection
@Component
public class Course {

	String cid;

	String name;

	double fees;

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", name=" + name + ", fees=" + fees + "]";
	}

	public Course(@Value(value = "101") 
				  String cid, 
				  @Value(value = "Java Full Stack") 
				  String name,
				  @Value(value = "35000") 
				  double fees) 
	{
		this.cid = cid;
		this.name = name;
		this.fees = fees;
	}

}
