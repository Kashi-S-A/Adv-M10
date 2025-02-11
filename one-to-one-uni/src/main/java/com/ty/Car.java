package com.ty;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {

	@Id
	private int cid;

	private String brand;

//	@OneToOne(cascade = CascadeType.PERSIST)//to persist engine while car is being persisted
//	@OneToOne(cascade = CascadeType.REMOVE)//to remove engine while car is being removed
//	@OneToOne(cascade = CascadeType.MERGE)//to update engine while car is being updated
//	@OneToOne(cascade = CascadeType.REFRESH)//to refresh engine while car is being refreshed
//	@OneToOne(cascade = CascadeType.DETACH)//to detach engine while car is being detached
	@OneToOne(cascade = CascadeType.ALL) // to perform all actions on engine while performing on car
	private Engine engine;

	@Override
	public String toString() {
		return "Car [cid=" + cid + ", brand=" + brand + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
