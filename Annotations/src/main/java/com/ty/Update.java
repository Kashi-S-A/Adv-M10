package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee emp = em.find(Employee.class, 1);
		
		if (emp!=null) {
			et.begin();
			emp.setSalary(55000);
			em.merge(emp);
			et.commit();
			System.out.println("updated");
		} else {
			System.out.println("Not found");
		}
	}
}
