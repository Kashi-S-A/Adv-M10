package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Employee emp = em.find(Employee.class, 10);
//		
//		if (emp!=null) {
//			et.begin();
//			em.remove(emp);
//			et.commit();
//			System.out.println("deleted");
//		} else {
//			System.out.println("not found");
//		}
		
//		Employee employee=new Employee();
//		employee.setEid(9);
//		
//		et.begin();
//		em.remove(em.merge(employee));
//		et.commit();
//		System.out.println("deleted");
		
		System.out.println(emf);
		System.out.println(em);
	}
}
