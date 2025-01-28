package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchByEngine {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoone");
		EntityManager em = emf.createEntityManager();

		Engine engine = em.find(Engine.class, 111);
		if (engine != null) {
			System.out.println("-------------engine--------------");
			System.out.println(engine);
			
			Car car = engine.getCar();
			
			System.out.println("==========Car============");
			System.out.println(car);
		} else {
			System.out.println("not found");
		}
	}
}
