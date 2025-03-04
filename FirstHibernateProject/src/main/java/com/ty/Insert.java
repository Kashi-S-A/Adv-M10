package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		Student student = new Student();
		student.setSid(103);
		student.setName("Martin");
		student.setEmail("martin@gmail.com");

		et.begin();
		em.persist(student);
		et.commit();
		
		System.out.println("data is inserted");
	}
}
