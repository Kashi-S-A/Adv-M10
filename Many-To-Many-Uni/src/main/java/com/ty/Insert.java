package com.ty;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytomany");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student student = new Student();
		student.setStu_id(101);
		student.setName("X");

		Subject s1 = new Subject();
		s1.setSub_id(1);
		s1.setName("JAVA");

		Subject s2 = new Subject();
		s2.setSub_id(2);
		s2.setName("SQL");

		Subject s3 = new Subject();
		s3.setSub_id(3);
		s3.setName("ReactJs");

		student.setSubjects(Arrays.asList(s1, s2, s3));

		et.begin();
		em.persist(student);
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		et.commit();

		System.out.println("saved");
	}
}
