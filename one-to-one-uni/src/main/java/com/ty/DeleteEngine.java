package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEngine {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoone");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Engine engine = em.find(Engine.class, 222);
		Car car = em.find(Car.class, 102);
		if (engine != null) {
			et.begin();
			car.setEngine(null);
			em.merge(car);
			em.remove(engine);
			et.commit();
			System.out.println("engine is deleted");
		} else {
			System.out.println("not found");
		}
	}
}
