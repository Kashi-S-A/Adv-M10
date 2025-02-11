package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoone");
		EntityManager em = emf.createEntityManager();

		Car car = em.find(Car.class, 105);

		if (car != null) {
			System.out.println("---------Car------------");
			System.out.println(car);
			System.out.println("---------Engine----------");
//			Engine engine = car.getEngine();//demanding engine
//			System.out.println(engine);
		} else {
			System.out.println("not found");
		}

	}
}
