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
		
		Car car=new Car();
		car.setCid(101);
		car.setBrand("TATA");
		
		Engine engine=new Engine();
		engine.setEid(111);
		engine.setCc(1000);
		
		car.setEngine(engine);
//		engine.setCar(car);
		
		et.begin();
		em.persist(car);
		em.persist(engine);
		et.commit();
		
//		System.out.println("saved");
	}
}
