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

		Student student = em.find(Student.class, 103);

		if (student != null) {
			et.begin();
			
			student.setName("DInga");
			
			Student updatedStudent = em.merge(student);
			System.out.println(updatedStudent);
			
			et.commit();
		} else {
			System.out.println("Not found");
		}
	}
}
