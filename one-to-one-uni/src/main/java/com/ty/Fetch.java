package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoone");
		EntityManager em = emf.createEntityManager();
		
//		Car car = em.find(Car.class, 102);
//		
//		if (car!=null) {
//			System.out.println("---------Car------------");
//			System.out.println(car);
//			System.out.println("---------Engine----------");
//			Engine engine = car.getEngine();
//			System.out.println(engine);
//		} else {
//			System.out.println("not found");
//		}
		
		Engine engine = em.find(Engine.class, 222);
		if (engine!=null) {
			System.out.println(engine);
		} else {
			System.out.println("not found");
		}
	}
}
