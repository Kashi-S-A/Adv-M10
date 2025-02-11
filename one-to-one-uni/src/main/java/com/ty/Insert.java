package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoone");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Car c = new Car();
		c.setCid(102);
		c.setBrand("Audi");

		Engine e = new Engine();
		e.setEid(222);
		e.setCc(18000);

		c.setEngine(e);

		et.begin();
		em.persist(c);
//		em.persist(e);//bcz we are using CascadeType
		et.commit();

		System.out.println("saved");

	}
}
