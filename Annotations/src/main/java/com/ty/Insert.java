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

		Employee employee = new Employee();
		employee.setName("King");
		employee.setEmail("king4@gmail.com");
		employee.setSalary(40000);

		et.begin();
		em.persist(employee);
		et.commit();
		
		System.out.println("saved");
	}
}
