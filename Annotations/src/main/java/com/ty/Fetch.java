package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");

		EntityManager em1 = emf.createEntityManager();

		Employee emp1 = em1.find(Employee.class, 10);
		System.out.println("-------------------------");
		System.out.println(emp1);

		Employee emp2 = em1.find(Employee.class, 10);
		System.out.println("-------------------------");
		System.out.println(emp2);

		Employee emp3 = em1.find(Employee.class, 10);
		System.out.println("-------------------------");
		System.out.println(emp3);

		System.out.println("=========================");

		Employee emp4 = em1.find(Employee.class, 15);
		System.out.println("-------------------------");
		System.out.println(emp4);

		System.out.println("*****************************");

		EntityManager em2 = emf.createEntityManager();

		Employee emp5 = em2.find(Employee.class, 10);
		System.out.println("-------------------------");
		System.out.println(emp5);

		Employee emp6 = em2.find(Employee.class, 10);
		System.out.println("-------------------------");
		System.out.println(emp6);

		System.out.println("=========================");

		Employee emp7 = em2.find(Employee.class, 15);
		System.out.println("-------------------------");
		System.out.println(emp7);
	}
}
