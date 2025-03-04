package com.ty;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytomany");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Student student = new Student();
		student.setStu_id(102);
		student.setName("Y");
		
		Subject s1 = em.find(Subject.class, 1);
		
		Subject s2 = em.find(Subject.class,2);

		Subject s3 = new Subject();
		s3.setSub_id(4);
		s3.setName("JavaScript");

		student.setSubjects(Arrays.asList(s1, s2, s3));

		et.begin();
		em.persist(student);
		em.persist(s3);
		et.commit();

		System.out.println("saved");
	}
}
