package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Remove {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student student = em.find(Student.class, 101);
		
		if (student!=null) {
			et.begin();
			em.remove(student);
			et.commit();
			System.out.println("deleted");
		} else {
			System.out.println("Not found");
		}
		
	}
}
