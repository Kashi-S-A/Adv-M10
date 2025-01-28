package com.ty;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetomany");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		College college = new College();
		college.setCid(101);
		college.setName("KC");

		Student s1 = new Student();
		s1.setSid(1);
		s1.setName("Ashish");

		Student s2 = new Student();
		s2.setSid(2);
		s2.setName("Om");
		
		college.setStudents(Arrays.asList(s1,s2));

		et.begin();
		em.persist(college);
		em.persist(s1);
		em.persist(s2);
		et.commit();
		System.out.println("saved");
	}
}
