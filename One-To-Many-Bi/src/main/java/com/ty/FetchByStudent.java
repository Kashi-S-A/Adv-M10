package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchByStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetomany");
		EntityManager em = emf.createEntityManager();
		
		Student student = em.find(Student.class, 1);
		
		if (student!=null) {
			System.out.println("------------Student-----------");
			System.out.println(student);
			System.out.println("---------College-----------");
			College college = student.getCollege();
			System.out.println(college);
		} else {
			System.out.println("not found");
		}
	}
}
