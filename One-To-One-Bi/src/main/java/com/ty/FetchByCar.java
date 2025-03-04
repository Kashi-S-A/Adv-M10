package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchByCar {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoone");
		EntityManager em = emf.createEntityManager();
		
		Car car = em.find(Car.class, 101);
		if (car!=null) {
			System.out.println("-------------Car--------------");
			System.out.println(car);
			Engine engine = car.getEngine();
			System.out.println("==========Engine============");
			System.out.println(engine);
		} else {
			System.out.println("not found");
		}
	}
}
